<template>
  <div class="buyticket">
    <div style="height:2rem;background-color:#f6f7fb"></div>
    <div class="header">
      <div class="header_title">
        <div class="header_title_line">{{line.lineName}}</div>
        <div class="header_title_time">{{line.lineTime}}出发</div>
        <!-- <div class>{{line}}</div> -->
      </div>
      <div class="header_prompt">
        <div class="header_prompt_title">温馨提示</div>
        <div
          class="header_prompt_report"
        >本线路需要实名购票，为杜绝安全隐患，避免超载，请自觉为儿童买座位票，儿童乘客可用户口簿上的身份证号。司机有权拒绝不购票儿童上车，谢谢合作。</div>
      </div>
    </div>
    <div class="buyticket_detail">
      <div class="buyticket_detail_title">
        <div class="buyticket_detail_title_left">请选择上车地点</div>
        <div class="buyticket_detail_title_right">上车地点示意图</div>
      </div>
      <div class="buyticket_detail_geton">
        <div class="buyticket_detail_body_geton" v-for="(item,index) in getonstation" :key="index">
          <div
            class="buyticket_detail_body_un_state"
            v-if="
             sortNumberOn!=item.sortNumber"
            @click="choose_geton(item.sortNumber,item.getOnOff,item.stationName,item.stationType,item.stationId)"
          >
            <div class="buyticket_detail_body_un_div" />
            <div class="buyticket_detail_body_un_time">{{item.stationTime}}</div>
            <div class="buyticket_detail_body_un_name">{{item.stationName}}</div>
            <div class="buyticket_detail_body_un_detail">[{{item.stationType}}]</div>
          </div>
          <div class="buyticket_detail_body_state" v-if="sortNumberOn==item.sortNumber">
            <div class="flex">
              <div class="buyticket_detail_body_div" />
              <div class="buyticket_detail_body_time">{{item.stationTime}}</div>
              <div class="buyticket_detail_body_name">{{item.stationName}}</div>
              <div class="buyticket_detail_body_detail">[{{item.stationType}}]</div>
            </div>
            <div class="buyticket_detail_body_value">{{item.stationRemark}}</div>
          </div>
        </div>
      </div>
      <div class="buyticket_detail_title2">
        <div class="buyticket_detail_title_left">请选择下车地点</div>
        <div class="buyticket_detail_title_right"></div>
      </div>
      <div class="buyticket_detail_geton">
        <div class="buyticket_detail_body_geton" v-for="(item,index) in getoffstation" :key="index">
          <div
            class="buyticket_detail_body_un_state"
            v-if=" sortNumberOff!= item.sortNumber"
            @click="choose_getoff(item.sortNumber,item.getOnOff,item.stationName,item.stationType,item.stationId)"
          >
            <div class="buyticket_detail_body_un_div" />
            <div class="buyticket_detail_body_un_time">{{item.stationTime}}</div>
            <div class="buyticket_detail_body_un_name">{{item.stationName}}</div>
            <div class="buyticket_detail_body_un_detail">[{{item.stationType}}]</div>
          </div>
          <div class="buyticket_detail_body_state" v-if="sortNumberOff == item.sortNumber">
            <div class="flex">
              <div class="buyticket_detail_body_div" />
              <div class="buyticket_detail_body_time">{{item.stationTime}}</div>
              <div class="buyticket_detail_body_name">{{item.stationName}}</div>
              <div class="buyticket_detail_body_detail">[{{item.stationType}}]</div>
            </div>
            <div class="buyticket_detail_body_value">{{item.stationRemark}}</div>
          </div>
        </div>
      </div>
      <div class="buyticket_price">￥{{line.lineMoney}}/座</div>
      <div class="buyticket_inform">
        <van-radio-group v-model="radio">
          <van-radio name="1">
            <div class="buyticket_inform_main">
              我已阅读并同意
              <span class="buyticket_inform_main_pick" @click="showPopup">购票退票规则</span>
            </div>
          </van-radio>
          <!--购票退票规则弹窗-->
          <van-popup v-model="show" closeable position="bottom" :style="{ height: '80%' }">
            <InformMain />
          </van-popup>
          <div class="buyticket_button" @click="showPopup2">确认购票</div>
          <van-popup v-model="show2" :style="{ height: '50%', width:'80%'}">
            <div class="buyticket_button_time">{{line.lineTime}}</div>
            <div class="buyticket_button_height">
              <div class>
                <div class="buyticket_button_geton_div" />
              </div>
              <div class="buyticket_button_value">{{getonName}}</div>
              <img class="buyticket_button_img" src="../icon/jurassic.png" />
              <div class>
                <div class="buyticket_button_getoff_div" />
              </div>
              <div class="buyticket_button_value">{{getoffName}}</div>
            </div>
            <div class="buyticket_button_choose">
              <div
                class="buyticket_button_choose_item_day"
                v-for="(t,index) in day"
                :key="index"
              >{{t.week}}</div>
            </div>
            <div class="buyticket_button_choose2">
              <div
                color="#334ef9"
                plain
                type="info"
                class="buyticket_button_choose_item2"
                v-for="(t,index) in day"
                v-bind:key="index"
              >
                <div
                  class="buyticket_button_choose_item3"
                  v-if=" buyticketchoose.indexOf(t.date) != -1"
                  @click="buyTicketoff(t.date,t.newTime)"
                >{{t.date}}</div>
                <div v-else-if="t.state==0" class="buyticket_button_choose_item1">{{t.date}}(无)</div>
                <div v-else @click="buyTicketon(t.date,t.newTime)">{{t.date}}</div>
              </div>
            </div>
            <div class="buyticket_button_next" @click="clicknext">下一步</div>
          </van-popup>
        </van-radio-group>
      </div>
      <div class="inform_last">
        <Inform />
      </div>
    </div>
    <div class="bottom"></div>
  </div>
</template>
<script>
import Inform from "../components/Inform.vue";
import InformMain from "../components/InformMain.vue";
export default {
  components: {
    Inform,
    InformMain
  },
  data() {
    return {
      stationOffId: "",
      stationOnId: "",
      line: [],
      day: [],
      lineBusId: "",
      getonstation: [],
      getoffstation: [],
      show: false,
      show2: false,
      radio: "1",
      buyticketchoose: [],
      geton: 0,
      getonName: null,
      getoff: 0,
      getoffName: null,
      chooseday: [],
      sortNumberOn:0,
      sortNumberOff:0
          };
  },
  methods: {
    showPopup() {
      this.show = true;
    },
    showPopup2() {
      if (this.getonName != null && this.getoffName != null) {
        this.show2 = true;
        var day = [];
        for (var i = 0; i < 5; i++) {
          var time = new Date();
          time.setTime(time.getTime() + i * (24 * 60 * 60 * 1000));
          let today = {};
          today.time = time;

          var year = time.getFullYear(),
            month = time.getMonth() + 1,
            date = time.getDate();

          today.newTime =
            year +
            "-" +
            (month < 10 ? "0" + month : month) +
            "-" +
            (date < 10 ? "0" + date : date);

          today.date = time.getDate();
          today.week = "日一二三四五六".charAt(time.getDay());
          if (today.week !== "六" && today.week !== "日") {
            let kk = {
              date: time,
              lineBusId: this.lineBusId
            };
            this.axios
              .post("http://localhost:8888/ticket/AllTicketState", kk)
              .then(response => {
                // window.console.log(kk.date);
                // window.console.log(response);
                // window.console.info(response.data);
                today.state = response.data;

                // if (response.data == 1) {
                //   today.state = 1;
                // } else {
                //   today.state = 0;
                // }
              });
            day.push(today);
          }
        }
        this.day = day;
        window.console.log(day);
      }
    },
    choose_geton(s,e, k, i, j) {
      this.sortNumberOn=s;
      this.geton = e;
      this.getonName = k;
      this.stationTypeon = i;
      this.stationOnId = j;
    },
    choose_getoff(s,e, k, i, j) {
      this.sortNumberOff=s;
      this.getoff = e;
      this.getoffName = k;
      this.stationTypeoff = i;
      this.stationOffId = j;
    },
    buyTicketon(e, k) {
      this.buyticketchoose.push(e);
      this.chooseday.push(k);
    },
    buyTicketoff(e, k) {
      // this.buyticketchoose.$remove(e);
      var index = this.buyticketchoose.indexOf(e);
      this.buyticketchoose.splice(index, 1);
      var index2 = this.chooseday.indexOf(k);
      this.chooseday.splice(index2, 1);
    },
    clicknext() {
      // let order =  {"lineNumber":"123"};
      // var m = this.buyticketchoose;
      // console.log(m.length);
      // let t = new Array();
      // for (var i = 0; i < m.length; i++) {
      //   let date = new date();
      //   let year = date.getFullYear(),
      //     month = date.getMonth() + 1,
      //     day = m[i];
      //     console.log(m[i]);
      //   let newTime =
      //     year +
      //     "-" +
      //     (month < 10 ? "0" + month : month) +
      //     "-" +
      //     (day < 10 ? "0" + day : day);

      //   t.push(newTime);
      // }
      let order = {
        line: this.line,
        lineBusId: this.lineBusId,
        date: this.chooseday,
        getonName: this.getonName,
        stationTypeOn: this.stationTypeon,
        stationTypeOff: this.stationTypeoff,
        getoffName: this.getoffName,
        geton: this.geton,
        getOnOff: this.getoff,
        stationOnId: this.stationOnId,
        stationOffId: this.stationOffId
      };
      console.log(this.geton)
      console.log(this.getOnOff)
      sessionStorage.setItem("order", JSON.stringify(order));
      if (this.buyticketchoose.length > 0) {
        this.$router.push({
          path: "/payment"
          // query: {
          //   line: this.line,
          //   lineBusId: this.lineBusId,
          //   date: this.buyticketchoose,
          //   getonName: this.getonName,
          //   stationTypeOn: this.stationTypeon,
          //   stationTypeOff: this.stationTypeoff,
          //   getoffName: this.getoffName,
          //   geton: this.geton,
          //   getOnOff: this.getoff,
          //   stationOnId: this.stationOnId,
          //   stationOffId: this.stationOffId
          // }
        });
      }
    }
  },
   computed: {
    baseurl() {
      return this.$store.state.baseurl;
    }
  },
  //
  beforeMount: function() {
    //
    let order = JSON.parse(sessionStorage.getItem("order"));
    window.console.info("-----------");
    window.console.info(order.lineNumber);
    this.line = this.$route.params;

    if (this.line.lineId == null || this.line.lineId == undefined) {
      this.$router.push({ name: "buyticket" });
      return;
    }

    let m = {
      // {"lineId":1,"lineTime":"6:40","lineDate":1,"lineDirection":1}
      lineId: this.line.lineId,
      lineTime: this.line.lineTime,
      lineDate: this.line.lineDate,
      lineDirection: this.line.lineDirection
    };
    window.console.log(m);
    this.axios
      .post(this.baseurl + "/line/SelectLineBusId", m)
      .then(response => {
        this.lineBusId = response.data;
      });
    this.axios
      .post(this.baseurl + "/station/OneStationAll", m)
      .then(response => {
        // 这里是判断一下，当时上车的班次信息，就getOnOff=1,就放到getonstation里面，getOnOff=2,就放到getoffstation里面
        window.console.log(response.data);
        this.getonstation = response.data.filter(a => a.getOnOff == 1);
        this.getoffstation = response.data.filter(a => a.getOnOff == 2);
      });
  }
};
</script>

<style scoped>
.buyticket {
  height: 100%;
}
.header {
  background-color: #ffffff;
  margin-left: 2rem;
  margin-right: 2rem;
  border-radius: 1rem;
  box-shadow: 0px 3px 3px #c8c8c8;
}
.header_title {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px dashed #ededed;
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
  font-size: 1rem;
  margin-left: 1rem;
  width: 15rem;
  height: 2rem;
  background-color: yellow;
  border-radius: 0.5rem;
}
.header_prompt_report {
  margin-left: 1rem;
  margin-right: 1rem;
}
.bottom {
  height: 2rem;
}
.buyticket_detail {
  background-color: #ffffff;
  margin: 2rem 2rem 0rem 2rem;
  padding: 1rem;
  border-radius: 1rem;
  box-shadow: 0px 3px 3px #c8c8c8;
}
.buyticket_detail_title {
  width: 100%;
  display: flex;
  justify-content: space-between;
}
.buyticket_detail_title_left {
  font-weight: 900;
}
.buyticket_detail_title_right {
  font-size: 0.8rem;
  color: #334ef9;
}
.buyticket_detail_body_un_state {
  display: flex;
  padding: 0.5rem;
}
.buyticket_detail_body_un_div {
  height: 1rem;
  width: 1rem;
  background: #ededed;
  border-radius: 5rem;
  border: 0.1rem solid #8494fb;
}
.buyticket_detail_body_un_time {
  margin-left: 0.5rem;
  font-weight: 550;
}
.buyticket_detail_body_un_name {
  font-weight: 550;
  margin-left: 1rem;
}
.buyticket_detail_body_un_detail {
  font-size: 0.8rem;
  color: #9f9f9f;
}
.buyticket_detail_body_state {
  padding: 0.5rem;
  background-color: #c2cafd;
  border-radius: 0.5rem;
}
.buyticket_detail_body_div {
  height: 1rem;
  width: 1rem;
  background: #334ef9;
  border-radius: 5rem;
}
.buyticket_detail_body_time {
  font-weight: 550;
  margin-left: 1rem;
}
.buyticket_detail_body_name {
  font-weight: 550;
  margin-left: 1rem;
}
.buyticket_detail_body_detail {
  font-size: 0.8rem;
  color: #ededed;
}
.flex {
  display: flex;
}
.buyticket_detail_body_value {
  margin-left: 4.8rem;
  font-size: 0.8rem;
  color: #ededed;
}
.buyticket_detail_geton {
  padding-bottom: 0.5rem;
  border-bottom: 0.1rem dashed #999999;
}
.buyticket_detail_title2 {
  margin-top: 1rem;
  width: 100%;
  display: flex;
  justify-content: space-between;
}
.buyticket_price {
  margin-top: 0.5rem;
  color: #334ef9;
  font-size: 1.5rem;
}
.buyticket_inform {
  margin-top: 1rem;
}
.buyticket_inform_main {
  font-size: 0.8rem;
  color: #999999;
}
.buyticket_inform_main_pick {
  text-decoration: underline;
}
.inform_last {
  font-size: 0.8rem;
  color: #999999;
  text-align: left;
}
.buyticket_button {
  color: #ededed;
  background-color: #334ef9;
  margin: 0.5rem 0rem 0.5rem;
  padding: 0.5rem 0rem 0.5rem;
  border-radius: 1rem;
}
.buyticket_button_img {
  padding: 0.25rem;
  height: 2rem;
  width: 2rem;
  margin-top: -0.5rem;
}
.buyticket_button_height {
  display: flex;
  padding: 2rem;
}
.buyticket_button_geton_div {
  width: 1rem;
  height: 1rem;
  border: 2px solid #ff618b;
  border-radius: 5rem;
}
.buyticket_button_value {
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
.buyticket_button_choose {
  display: flex;
  justify-content: center;
}
.buyticket_button_choose2 {
  display: flex;
  justify-content: center;
}
.buyticket_button_choose_item1 {
  height: 2rem;
  font-size: 1.2rem;
  margin-top: -1rem;
  padding-top: 1rem;
  background-color: #ffffff;
  width: 3.5rem;
}
.buyticket_button_choose_item2 {
  height: 2rem;
  font-size: 1.2rem;
  padding-top: 1rem;
  background-color: #ebedff;
  width: 3.5rem;
}
.buyticket_button_choose_item3 {
  height: 2rem;
  font-size: 1.2rem;
  margin-top: -1rem;
  padding-top: 1rem;
  background-color: #334ef9;
  color: #ffffff;
  width: 3.5rem;
}
.buyticket_button_choose_item_day {
  height: 2rem;
  font-size: 1.2rem;
  color: #999999;
  width: 3.5rem;
}
.buyticket_button_next {
  color: #ededed;
  background-color: #334ef9;
  margin: 1rem 0rem 1rem;
  padding: 0.5rem 0rem 0.5rem;
  border-radius: 1rem;
}
</style>