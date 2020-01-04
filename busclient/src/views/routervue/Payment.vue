<template>
  <div class="contain">
    <van-nav-bar title="购票" left-arrow @click-left="onClickLeft" />
    <div style="height:2rem;background-color:#f6f7fb"></div>
    <div class="header">
      <div class="header_title">
        <div class="header_title_line">{{card.lineName}}</div>
        <div class="header_title_time">{{card.lineTime}}</div>
      </div>
      <div class="buyticket_button_height">
        <div class>
          <div class="buyticket_button_geton_div" />
        </div>
        <div class="buyticket_button_value">{{getonName}}</div>
        <!-- <img class="buyticket_button_img" src="../icon/jurassic.png" /> -->
        <div class>
          <div class="buyticket_button_getoff_div" />
        </div>
        <div class="buyticket_button_value">{{getoffName}}</div>
      </div>
      <div class="header_prompt">
        <div class="header_prompt_title">温馨提示</div>
        <div
          class="header_prompt_report"
        >本线路需要实名购票，为杜绝安全隐患，避免超载，请自觉为儿童买座位票，儿童乘客可用户口簿上的身份证号。司机有权拒绝不购票儿童上车，谢谢合作。</div>
      </div>
    </div>
    <div class="content">
      <div class="content_add" @click="onclick">
        <div class="contenticon">
          <van-icon name="add-o" />添加新乘客
        </div>
        <!-- <div class="contenttext">添加新乘客</div> -->
      </div>
      <div class="content_passenger" v-for="(item,index) in currentData" :key="index">
        <div class="header_title1">
          <div class="header_title_name">
            <div class="header_title_name_user">{{item.passengerName}}</div>
            <div class="header_title_name_default">{{item.passengerDefault}}</div>
          </div>
          <div class="header_title_type">
            <div class="header_title_type_adult">{{item.passengerType}}</div>
            <div class="header_title_type_id">{{item.passengerIdCard}}</div>
          </div>
        </div>
        <div class="header_revision">
          <div class="header_revision_delete">
            <van-icon :name="iconB" @click="onclickdetele(index)" />
          </div>
        </div>
      </div>
    </div>
    <div class="tail">
      <div class="tail_now">
        <van-radio-group v-model="radio">
          <div>
            <van-radio name="1"></van-radio>
          </div>
          <div class="buyticket_inform_main">
            我已阅读并同意
            <span class="buyticket_inform_main_pick" @click="showPopup">《购票退票规则》</span>
            和
            <span class="buyticket_inform_main_pick" @click="showPopup2">《用户须知》</span>
          </div>

          <!--购票退票规则弹窗-->
          <van-popup v-model="show" closeable position="bottom" :style="{ height: '80%' }">
            <InformMain />
          </van-popup>
          <van-popup v-model="show2" closeable position="bottom" :style="{ height: '80%' }">
            <Inform />
          </van-popup>
        </van-radio-group>
      </div>
      <div class="tail_payment">
        <div class="tail_payment_details">
          <div class="tail_payment_details_price">
            <div class="tail_payment_details_price_p">共{{all}}元</div>
            <div class="tail_payment_details_price_check" @click="showPopup3">
              查看明细
              <van-icon name="arrow-up" size="20" />
            </div>

            <van-popup v-model="show3" position="bottom" :style="{ height: '15%' }" class="popup">
              <div>{{passengerType}}票</div>
              <div>{{card.lineMoney}}*{{ticketNumber}}={{all}}</div>
            </van-popup>
          </div>
        </div>
        <div class="tail_payment_confrim" @click.stop="confirm(currentData)">确认购票</div>
      </div>
    </div>
  </div>
</template>
<script>
import iconA from "@/icon/edit.png";
import iconB from "@/icon/delete.png";
import InformMain from "@/components/InformMain.vue";
import Inform from "@/components/Inform.vue";
export default {
  components: {
    InformMain,
    Inform
  },
  data() {
    return {
      card: [],
      date: [],
      geton: "",
      getOnOff: "",
      stationOnId: "",
      stationOffId: "",
      passengerType: "成人",
      ticketNumber: "",
      lineBusId: "",
      all: "",
      radio: "1",
      show: false,
      show2: false,
      show3: false,
      iconA: iconA,
      iconB: iconB,
      getonName: "",
      getoffName: "",
      busId: 1,
      passengerId: "",
      currentData: [],
      userId:""
    };
  },
  methods: {
    onclick() {
      this.$router.push({
        path: "/apassenger"
      });
    },
    onClickLeft() {
      window.history.back(-1);
    },
    confirm(e) {
      if (this.currentData != null) {
        window.console.log(e);
        var date = new Date();

        var year = date.getFullYear(),
          month = date.getMonth() + 1, //月份是从0开始的
          day = date.getDate(),
          hour = date.getHours(),
          min = date.getMinutes(),
          sec = date.getSeconds();
        var newTime =
          year + "-" + (month < 10? '0' + month : month) + '-' +
				(day < 10? '0' + day : day) + ' ' +
				(hour < 10? '0' + hour : hour) + ':' +
				(min < 10? '0' + min : min) + ':' +
				(sec < 10? '0' + sec : sec);


        let m = {
          busId: this.busId,
          lineOrigin: this.card.lineOrigin,
          lineDestination: this.card.lineDestination,
          createTime: newTime,
          lineTime: this.card.lineTime,
          userId:this.userId
        };

        let t = [];
        this.date.forEach(i => {
          t.push({
            ticketNumber: e.length,
            busId: this.busId,
            date: i,
            lineBusId: this.lineBusId
          });
        });
        window.console.log(t);

        let m2 = {
          stationId: this.stationOnId,
          getOnOff: this.getOnOff
        };
        let mm = {
          stationId: this.stationOffId,
          getOnOff: this.geton
        };

        let m3 = [];
        e.forEach(i => {
          m3.push(i.passengerId);
        });
        let p = { passengerId: m3 };
    
        let obj = {
          orderLike: [m],
          ticket: t,
          OrderStation: [m2, mm],
          OrderPassenger: [p]
        };
        this.axios.post(this.baseurl + "/add", obj).then(response => {
          window.console.log(response.data);
          this.$router.push({
            path: "/ticket"
          });
        });
      }
    },
    showPopup() {
      this.show = true;
    },
    showPopup2() {
      this.show2 = true;
    },
    showPopup3() {
      this.show3 = true;
    },
    onclickdetele(e) {
      this.$dialog
        .confirm({
          title: "是否删除此乘客"
          // message: "弹窗内容"
        })
        .then(() => {
          // on confirm
          this.delete;
          window.console.log(e);
        })
        .catch(() => {
          // on cancel
        });
    }
  },
 computed: {
    baseurl() {
      return this.$store.state.baseurl;
    }
  },
  beforeUpdate() {},
  beforeMount: function() {
    let user= JSON.parse(localStorage.getItem("user"));
    this.userId= user.tokenId
    let order = JSON.parse(sessionStorage.getItem("order"));
    this.card = order.line;

    this.getonName = order.getonName + "(" + order.stationTypeOn + ")";

    this.getoffName = order.getoffName + "(" + order.stationTypeOff + ")";

    this.date = order.date;

    this.lineBusId = order.lineBusId;

    this.geton = order.geton;
    this.getOnOff = order.getOnOff;
    // console.log(this.geton)
    // console.log(this.getOnOff)

    this.stationOnId = order.stationOnId;
    this.stationOffId = order.stationOffId;
    let passenger = JSON.parse(sessionStorage.getItem("passenger"));
    window.console.info(order);
    this.currentData = passenger.ps;

    var a;
    if (passenger.ps != null) {
      a = order.date.length * passenger.ps.length;
    } else {
      a = order.date.length;
    }

    this.ticketNumber = a;

    var all = order.line.lineMoney * a;
    this.all = all;
    // window.console.log(this.$route.query);
  }
};
</script>
<style scoped>
.contain {
  display: flex;
  flex-direction: column;
  width: 100%;
}
.header {
  display: flex;
  flex-direction: column;
  background-color: #ffffff;

  height: 15rem;
  margin-left: 2rem;
  margin-right: 2rem;
  border-radius: 1rem;
  box-shadow: 0px 3px 3px #c8c8c8;
}
.header_title {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 0.1rem dashed #999999;
  margin: 0rem 1rem 1rem 1rem;
}
.header_title_line {
  margin-left: 1rem;
  font-weight: 900;
}
.header_title_time {
  margin-right: 1rem;
  font-weight: 700;
  color: #334ef9;
}
.header_prompt {
  margin-top: 1rem;
  display: flex;
  justify-content: space-between;
}
.header_prompt_title {
  padding: 0.3rem;
  font-size: 0.85rem;
  margin-left: 1rem;
  width: 8rem;
  height: 2rem;
  background-color: yellow;
  border-radius: 0.5rem;
}
.header_prompt_report {
  font-size: 0.75rem;
  margin-left: 1rem;
  margin-right: 1rem;
}
.buyticket_button_height {
  display: flex;
  padding: 1rem;
}
.buyticket_button_geton_div {
  width: 1rem;
  height: 1rem;
  border: 2px solid #ff618b;
  border-radius: 5rem;
}
.buyticket_button_value {
  font-size: 0.85rem;
  text-align: left;
  width: 6rem;
  margin-left: 0.25rem;
  color: #747474;
}
.buyticket_button_getoff_div {
  width: 1rem;
  height: 1rem;
  border: 2px solid #7ed321;
  border-radius: 5rem;
}
.buyticket_button_time {
  text-align: left;
  margin-top: 0.5rem;
  margin-left: 2rem;
  font-size: 1.2rem;
}
.content_passenger {
  display: flex;
  margin: 15px;
  height: auto;
  background-color: #ffffff;
}
.content {
  display: flex;
  flex-direction: column;
  /* height: 5rem; */
  margin: 1.5rem 1.5rem 9rem 1.5rem;
  border-radius: 1rem;
  background-color: #ffffff;
  box-shadow: 0px 3px 3px #c8c8c8;
}

.header_title1 {
  display: flex;
  flex-direction: column;
  width: 80%;
  text-align: left;
}
.header_title_name {
  display: flex;
  margin: 0.5rem 0rem 0.5rem 1rem;
}
.header_title_name_default {
  margin-left: 1rem;
  background-color: #334ef9;
  color: #ffffff;
}
.header_title_type {
  display: flex;
  margin: 0rem 0rem 0.25rem 1rem;
  font-size: 0.75rem;
  color: #747474;
}
.header_title_type_id {
  margin-left: 1rem;
}
.header_revision {
  margin-right: 0.75rem;
  display: flex;
  justify-content: space-around;
  flex-grow: 1;
}
.header_revision_edit {
  display: flex;
  flex-direction: column;
  justify-content: center;
  flex-grow: 1;
}
.header_revision_delete {
  padding-left: 0.5rem;
  display: flex;
  flex-direction: column;
  justify-content: center;
  flex-grow: 1;
  font-size: 1.5rem;
}
.content_add {
  display: flex;
  justify-content: center;
  font-size: 1rem;
  /* margin: 15px; */
  height: 1rem;
  flex-direction: column;
  border-bottom: 1px solid #eeeeee;
  color: #334ef9;
  font-weight: bolder;
  padding-top: 1rem;
  padding-bottom: 0.5rem;
}
.van-icon {
  padding-right: 5px;
  /* font-size: 1rem */
}
.tail {
  display: flex;
  position: fixed;
  flex-direction: column;
  height: 7rem;
  bottom: 30px;
  background-color: #ffffff;
  padding: 0rem 1rem 0rem 1rem;
}
.van-radio-group {
  display: flex;
}
.tail_now {
  /* display: flex; */
  height: 3rem;
  text-align: center;
  border-bottom: 1px solid #eeeeee;
  margin-bottom: 0.5rem;
}
.buyticket_inform_main {
  font-size: 1rem;
  /* color: #999999; */
}
.buyticket_inform_main_pick {
  text-decoration: underline;
  color: #8c93dd;
}
.tail_payment {
  /* position: fixed;
  bottom: 0rem; */
  display: flex;
  height: 2rem;
}
.tail_payment_details {
  flex-grow: 1;
}
.tail_payment_details_price {
  margin: 0.25rem;
  display: flex;
  justify-content: space-between;
}
.tail_payment_details_price_p {
  display: flex;
  justify-content: center;
}
.tail_payment_details_price_check {
  display: flex;
  justify-content: center;
}
.tail_payment_confrim {
  display: flex;
  margin-left: 0.5rem;
  flex-direction: column;
  justify-content: center;
  width: 40%;
  background-color: #334ef9;
  color: #ffffff;
}
.popup {
  display: flex;
  justify-content: space-around;
}
</style>
