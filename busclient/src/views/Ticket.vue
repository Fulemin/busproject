<template>
  <div class="container">
    <van-nav-bar title="车票" :fixed="true" />
    <div class="header">
      <van-tabs v-model="active" color="#334EF9" title-active-color="#334EF9">
        <van-tab title="当天发车">
          <div>
            <Alert></Alert>
            <div class="home">
              <div class="car" v-for="(item,index) in currentDataToday" :key="index">
                <div class="car_card">
                  <div class="car_card_line">
                    <div class="car_card_line_title">
                      <div class="car_card_line_date" v-for="(it,i) in item.date" :key="i">{{it}}</div>
                      <div class="car_card_line_time">{{item.time}}开</div>
                    </div>
                    <div class="car_card_line_money">共{{item.ticketNumbers}}张</div>
                  </div>
                  <div class="car_card_groove">
                    <div class="car_card_groove_left"></div>
                    <div class="car_card_groove_right"></div>
                  </div>
                  <div class="car_card_details">
                    <div class="car_card_details_origin">
                      <div class="car_card_details_origin_div"></div>
                      <div class="car_card_details_origin_word">
                        <div class="car_card_details_origin_word_first">{{item.origin}}</div>
                        <div class="car_card_details_origin_word_second">
                          <div class="car_card_details_origin_word_second_lower">上车点</div>
                          <div
                            class="car_card_details_origin_word_second_lowerdetail"
                          >{{item.getOn}}</div>
                        </div>
                      </div>
                    </div>
                    <div class="car_card_details_destination">
                      <div class="car_card_details_destination_div"></div>
                      <div class="car_card_details_destination_word">
                        <div class="car_card_details_destination_word_first">{{item.destination}}</div>
                        <div class="car_card_details_destination_word_second">
                          <div class="car_card_details_destination_word_second_aboard">下车点</div>
                          <div
                            class="car_card_details_destination_word_second_aboarddetail"
                          >{{item.getOff}}</div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="car_card_time" v-for="(t,id) in item.passenger" :key="id">
                    <div class="car_card_time_name">{{t.passengerName}}</div>
                    <div class="car_card_time_other">
                      <div>{{t.passengerType}}</div>
                      <div>{{t.passengerIdCard}}</div>
                    </div>
                  </div>
                  <div class="car_card_time_order">{{item.createTime}}下单</div>
                  <div class="car_card_confirm">
                    <div class="car_card_confirm_payment">支付</div>
                    <div class="car_card_confirm_canel">取消</div>
                  </div>
                  <div class="line1" v-if="item.payment==1" />
                  <div class="line2" v-if="item.payment==2" />
                  <div class="line3" v-if="item.payment==3" />
                  <div class="line4" v-if="item.payment==4" />
                </div>
              </div>
            </div>
            <!-- <Card></Card> -->
          </div>
        </van-tab>
        <van-tab title="非当天发车">
          <div>
            <Alert></Alert>
            <div class="home">
              <div class="car" v-for="(item,index) in currentData" :key="index">
                <div class="car_card">
                  <div class="car_card_line">
                    <div class="car_card_line_title">
                      <div class="car_card_line_date" v-for="(it,i) in item.date" :key="i">{{it}}</div>
                      <div class="car_card_line_time">{{item.time}}开</div>
                    </div>
                    <div class="car_card_line_money">共{{item.ticketNumbers}}张</div>
                  </div>
                  <div class="car_card_groove">
                    <div class="car_card_groove_left"></div>
                    <div class="car_card_groove_right"></div>
                  </div>
                  <div class="car_card_details">
                    <div class="car_card_details_origin">
                      <div class="car_card_details_origin_div"></div>
                      <div class="car_card_details_origin_word">
                        <div class="car_card_details_origin_word_first">{{item.origin}}</div>
                        <div class="car_card_details_origin_word_second">
                          <div class="car_card_details_origin_word_second_lower">上车点</div>
                          <div
                            class="car_card_details_origin_word_second_lowerdetail"
                          >{{item.getOn}}</div>
                        </div>
                      </div>
                    </div>
                    <div class="car_card_details_destination">
                      <div class="car_card_details_destination_div"></div>
                      <div class="car_card_details_destination_word">
                        <div class="car_card_details_destination_word_first">{{item.destination}}</div>
                        <div class="car_card_details_destination_word_second">
                          <div class="car_card_details_destination_word_second_aboard">下车点</div>
                          <div
                            class="car_card_details_destination_word_second_aboarddetail"
                          >{{item.getOff}}</div>
                        </div>
                      </div>
                    </div>
                  </div>
                  <div class="car_card_time" v-for="(t,id) in item.passenger" :key="id">
                    <div class="car_card_time_name">{{t.passengerName}}</div>
                    <div class="car_card_time_other">
                      <div>{{t.passengerType}}</div>
                      <div>{{t.passengerIdCard}}</div>
                    </div>
                  </div>
                  <div class="car_card_time_order">{{item.createTime}}下单</div>
                  <div class="car_card_confirm">
                    <div class="car_card_confirm_payment">{{payment}}</div>
                    <div class="car_card_confirm_canel">{{cancel}}</div>
                  </div>
                  <div class="line1" v-if="item.payment==1" />
                  <div class="line2" v-if="item.payment==2" />
                  <div class="line3" v-if="item.payment==3" />
                  <div class="line4" v-if="item.payment==4" />
                </div>
              </div>
            </div>
            <!-- <Card></Card> -->
          </div>
        </van-tab>
      </van-tabs>
    </div>
    <div class="last">
      <div class="lastone">
        <van-tag round type="danger"></van-tag>待支付
      </div>
      <div class="lastone">
        <van-tag round type="success"></van-tag>待出发
      </div>
      <div class="lastone">
        <van-tag round type="primary"></van-tag>当天出发
      </div>
      <div class="lastone">
        <van-tag round></van-tag>已出发
      </div>
    </div>
  </div>
</template>
<script>
import Alert from "@/components/Alert.vue";
export default {
  components: {
    // Card,
    Alert
  },
  data() {
    return {
      currentDataToday: "",
      payment: "",
      cancel: "",
      active: 2,
      currentData: "",
      carObj: [
        {
          // passenger:"",
          date:  "2019-12-06" , //选择票的日期
          time: "12:40", //车次时间
          ticketNumbers: 1,
          origin: "岭南雅筑/金色梦想/中海誉城去程", //车次起点
          getOn: "中海誉城去程(羊城一路公交站)", //上车站点
          destination: "华师", //车次终点
          getOff: "体育西路(公交总站)", //下车站点
          passenger: [
            {
              passengerName: "张三",
              passengerType: "成人",
              passengerIdCard: "xxxx"
            }
          ],
          createTime: "2019-12-06 11:23:06 下单", //下单时间
          state: 3 //支付状态
        }
      ]
    };
  },
  beforeMount: function() {
    let userObject=localStorage.getItem("user")
    // let t = { userId: JSON.parse(localStorage.getItem("user")).tokenId };
    // console.log(t);
    if (userObject == null || userObject == undefined) {
      this.currentData = this.carObj;
      this.currentDataToday =  this.carObj;
    } else {
      let t ={userId:JSON.parse(userObject).tokenId}
      this.axios.post(this.baseurl + "/order", t).then(response => {
        window.console.log(response);
        this.currentData = response.data;
        response.data.forEach(i => {
          if (i.payment == 1) {
            this.payment = "退款";
          } else if (i.payment == 0) {
            this.payment = "支付";
            this.cancel = "取消";
          }
        });
      });
      this.axios.post(this.baseurl + "/orderToday", t).then(response => {
        window.console.log(response);
        this.currentDataToday = response.data;
        response.data.forEach(i => {
          if (i.payment == 1) {
            this.payment = "退款";
          } else if (i.payment == 0) {
            this.payment = "支付";
            this.cancel = "取消";
          }
        });
      });
    }
  },
  computed: {
    baseurl() {
      return this.$store.state.baseurl;
    }
  }
};
</script>
<style scoped>
.van-nav-bar {
  background-color: #334ef9;
}
.van-nav-bar__title {
  color: #ffffff;
}
.van-tabs--line .van-tabs__wrap {
  box-shadow: 0px 3px 3px #c8c8c8;
  margin: 5px 10px;
}
.header {
  margin-top: 45px;
}
.last {
  position: fixed;
  bottom: 0px;
  width: 100%;
  height: 50px;
  display: flex;
  justify-content: center;
  padding-bottom: 30px;
  background-color: #f6f7fb;
}
.lastone {
  padding-right: 8px;
  font-size: 12px;
}
.Alert {
  background-color: #f6f7fb;
  left: 0px;
  height: 40px;
  width: 100%;
  display: flex;
  flex-direction: row;
  font-size: 10px;
}
.todaycard {
  background-color: #ffffff;
}
.car {
  margin-top: 2rem;
  width: 100%;
  margin-bottom: 5rem;
}
.car_card {
  margin: 0.75rem 1.25rem 0rem 1.25rem;
  border-radius: 0.5rem;
  background-color: #ffffff;
  box-shadow: 0px 3px 3px #c8c8c8;
}
.car_card_line {
  display: flex;
  align-items: center;
  height: auto;
  border-bottom: 0.1rem dashed #c8c8c8;
}
.car_card_line_title {
  display: flex;
  justify-content: space-between;
  padding-left: 10px;
  font-size: 1rem;
  font-weight: 800;
  flex-grow: 1;
  /* height: auto; */
  align-items: center;
}
.car_card_line_money {
  padding-right: 1.25rem;
  font-size: 1rem;
  font-weight: 550;
  width: 50%;
  text-align: right;
}
.car_card_line_date {
  display: flex;
  flex-direction: column;
  text-align: left;
  width: 60%;
}
.car_card_line_time {
  flex-grow: 1;
}
.car_card_groove {
  display: flex;
  justify-content: space-between;
}
.car_card_groove_left {
  width: 2rem;
  height: 2rem;
  margin-top: -1rem;
  margin-left: -1rem;
  border-radius: 5rem;
  background-color: #f6f7fb;
}
.car_card_groove_right {
  width: 2rem;
  height: 2rem;
  margin-top: -1rem;
  margin-right: -1rem;
  border-radius: 5rem;
  background-color: #f6f7fb;
}
.car_card_details {
  text-align: left;
  border-bottom: 1px solid #ededed;
}
.car_card_details_origin {
  display: flex;
  margin-left: 1rem;
}
.car_card_details_origin_div {
  width: 1rem;
  height: 1rem;
  border: 2px solid #7ed321;
  border-radius: 5rem;
}
.car_card_details_origin_word {
  display: flex;
  flex-direction: column;
}
.car_card_details_origin_word_first {
  margin-left: 1rem;
  font-size: 1rem;
}
.car_card_details_origin_word_second {
  margin-left: 1rem;
  display: flex;
  flex-direction: row;
  font-size: 0.8rem;
  color: #747474;
}
.car_card_details_origin_word_second_lower {
  width: 3rem;
}
.car_card_details_origin_word_second_lowerdetail {
  flex-grow: 1;
  padding-left: 1rem;
  padding-right: 1rem;
}
.car_card_details_destination {
  display: flex;
  padding-bottom: 1rem;
  margin: 0.25rem 0rem 0rem 1rem;
}
.car_card_details_destination_div {
  width: 1rem;
  height: 1rem;
  border: 2px solid #ff618b;
  border-radius: 5rem;
}
.car_card_details_destination_word {
  display: flex;
  flex-direction: column;
}
.car_card_details_destination_word_first {
  margin-left: 1rem;
  font-size: 1rem;
}
.car_card_details_destination_word_second {
  margin-left: 1rem;
  display: flex;
  flex-direction: row;
  font-size: 0.8rem;
  color: #747474;
}
.car_card_details_destination_word_second_aboard {
  width: 3rem;
}
.car_card_details_destination_word_second_aboarddetail {
  flex-grow: 1;
  padding-left: 1rem;
  padding-right: 1rem;
}
.bottom {
  padding-bottom: 4rem;
}
.car_card_time {
  background-color: #f6f7fb;
  height: auto;
  margin-top: 0.25rem;
  display: flex;
  margin-left: 1rem;
}
.car_card_time_name {
  text-align: left;
  width: 40%;
  font-size: 1rem;
  font-weight: bolder;
}
.car_card_time_other {
  margin-right: 1rem;
  display: flex;
  flex-grow: 1;
  justify-content: space-between;
  color: #747474;
}
.car_card_time_order {
  margin: 0.25rem 0rem 1rem 1rem;
  text-align: left;
  font-size: 0.8rem;
}
.car_card_confirm {
  height: 2rem;
  display: flex;
  flex-direction: row-reverse;
  margin-right: 2rem;
}
.car_card_confirm_payment {
  width: 3rem;
  height: 1.5rem;
  color: #d291a9;
  border: 1px solid #d291a9;
}
.car_card_confirm_canel {
  width: 3rem;
  margin-right: 1rem;
  height: 1.5rem;
  color: #9e9e9e;
  border: 1px solid #9e9e9e;
}
.line1 {
  background-color: #ff618b;
  height: 5px;
}
.line2 {
  background-color: #7ed321;
  height: 5px;
}
.line3 {
  background-color: #1989fa;
  height: 5px;
}
.line4 {
  background-color: #969799;
  height: 5px;
}
</style>
