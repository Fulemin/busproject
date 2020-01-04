<template>
  <div class="home">
    <div class="car" v-for="(item,index) in currentData" :key="index">
      <div class="car_card">
        <div class="car_card_line">
          <div class="car_card_line_title">{{item.date}}  {{item.time}}开</div>
          <div class="car_card_line_money">共{{item.orderNumber}}张</div>
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
                <div class="car_card_details_origin_word_second_lowerdetail">{{item.lowerdetails}}</div>
              </div>
            </div>
          </div>
          <div class="car_card_details_destination">
            <div class="car_card_details_destination_div"></div>
            <div class="car_card_details_destination_word">
              <div class="car_card_details_destination_word_first">{{item.destination}}</div>
              <div class="car_card_details_destination_word_second">
                <div class="car_card_details_destination_word_second_aboard">下车点</div>
                <div class="car_card_details_destination_word_second_aboarddetail">{{item.aboarddetail}}</div>
              </div>
            </div>
          </div>
        </div>
        <div class="car_card_time">
          <div class="car_card_time_name">{{item.name}}</div>
          <div class="car_card_time_other">
            <div>{{item.type}}</div>
            <div>{{item.id}}</div>
          </div>
        </div>
        <div class="car_card_time_order">{{item.createtime}}</div>
        <div class="car_card_confirm">
          <div class="car_card_confirm_payment">支付</div>
          <div class="car_card_confirm_canel">取消</div>
        </div>
        <div class="line1" v-if="item.state==1"/>
        <div class="line2" v-if="item.state==2"/>
        <div class="line3" v-if="item.state==3"/>
        <div class="line4" v-if="item.state==4"/>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      currentData: "",
      carObj: [
        {
          date:'2019-12-06',//选择票的日期
          time: "12:40",//车次时间
          orderNumber: 1,
          origin: "岭南雅筑/金色梦想/中海誉城去程",//车次起点
          lowerdetails: "中海誉城去程(羊城一路公交站)",//上车站点
          destination: "华师",//车次终点
          aboarddetail:"体育西路(公交总站)",//下车站点
          name:"张三",
          type:"成人",
          id:"**********2222",//乘客信息
          createtime:"2019-12-06 11:23:06 下单",//下单时间
          state:3,//支付状态
        }
      ]
    };
  },
  beforeMount: function() {
    this.axios.get("http://localhost:8888/order").then(response=>{
      
      window.console.log(response)
    })
    this.currentData = this.carObj;
  },
  methods: {
   
  }
};
</script>
<style scoped>
.car {
  margin-top: 2rem;
  width: 100%;
}
.car_card {
  margin: 0.75rem 1.25rem 0rem 1.25rem;
  border-radius: 0.5rem;
  background-color: #ffffff;
  box-shadow: 0px 3px 3px #c8c8c8;
}
.car_card_line {
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 3rem;
  border-bottom: 0.1rem dashed #c8c8c8;
}
.car_card_line_title {
  padding-left: 10px;
  font-size: 1rem;
  font-weight: 800;
}
.car_card_line_money {
  padding-right: 1.25rem;
  font-size: 1rem;
  font-weight: 550;
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
  font-size: 0.80rem;
  color: #747474;
}
.car_card_details_origin_word_second_lower{
  width: 3rem
}
.car_card_details_origin_word_second_lowerdetail{
  flex-grow: 1;
  padding-left: 1rem;
  padding-right: 1rem
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
.car_card_details_destination_word{
  display: flex;
  flex-direction: column;
}
.car_card_details_destination_word_first {
  margin-left: 1rem;
  font-size: 1rem;
}
.car_card_details_destination_word_second{
  margin-left: 1rem;
  display: flex;
  flex-direction: row;
  font-size: 0.80rem;
  color: #747474;
}
.car_card_details_destination_word_second_aboard{
  width: 3rem
}
.car_card_details_destination_word_second_aboarddetail{
  flex-grow: 1;
  padding-left: 1rem;
  padding-right: 1rem
}
.bottom {
  padding-bottom: 4rem;
}
.car_card_time {
  background-color: #f6f7fb;
  height: 1.5rem;
  margin-top: 0.25rem;
  display: flex;
  margin-left: 1rem;
}
.car_card_time_name{
  text-align: left;
  width: 40%;
  font-size:1rem;
  font-weight: bolder
}
.car_card_time_other{
  margin-right: 1rem;
  display: flex;
  flex-grow: 1;
  justify-content: space-around;
  color: #747474;
}
.car_card_time_order{
  margin: 0.25rem 0rem 1rem 1rem ;
  text-align: left;
  font-size: 0.80rem;
}
.car_card_confirm{
  height: 2rem;
  display: flex;
  flex-direction: row-reverse;
  margin-right: 2rem
}
.car_card_confirm_payment{
  width: 3rem;
  height: 1.5rem;
  color: #D291A9;
  border: 1px solid #D291A9
}
.car_card_confirm_canel{
  width: 3rem;
  margin-right: 1rem;
  height: 1.5rem;
  color:#9E9E9E;
  border: 1px solid #9E9E9E
}
.line1{
  background-color: #ff618b;
  height: 5px;
}
.line2{
  background-color: #7ed321;
  height: 5px;
}
.line3{
  background-color: #1989FA;
  height: 5px;
}
.line4{
  background-color: #969799;
  height: 5px;
}
</style>