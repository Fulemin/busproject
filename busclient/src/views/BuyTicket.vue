<template>
  <div class="home">
    <!-- <button @click="doit">do{{this.$store.state.count}}</button> -->
    <div class="header">
      <div class="header_word">
        <van-icon name="exchange" />
        <span @click="onClickSwitch">切换小区</span>
      </div>
      <div class="header_title">
        <div class="header_title_uptownName">
          <span>{{uptownName}}</span>
        </div>
        <div class="header_title_uptownPeople">
          <span>小区已入驻{{uptownPeople}}人</span>
        </div>
      </div>
    </div>
    <div class="area_selection">
      <div class="area_selection_choose">
        <van-tabs color="#334ef9">
          <van-tab title="86小区" />
          <van-tab title="86城际(未开放)" disabled />
        </van-tabs>
      </div>
    </div>
    <div class="time_choose_black">
      <div class="time_choose">
        <div class="time_choose_timeframe">
          时间
          <van-button color="#334EF9" size="small" v-if="time==1" @click="clicktime1">工作日</van-button>
          <van-button color="#334EF9" plain size="small" v-if="time==2" @click="clicktime1">工作日</van-button>
          <van-button
            color="#334EF9"
            plain
            size="small"
            v-if="time==1"
            style="margin-left:1rem;"
            @click="clicktime2"
          >周末</van-button>
          <van-button
            color="#334EF9"
            size="small"
            v-if="time==2"
            style="margin-left:1rem;"
            @click="clicktime2"
          >周末</van-button>
        </div>
        <div class="time_choose_direction">
          方向
          <van-button color="#334EF9" size="small" v-if="direction==1" @click="clickdirection1">出门</van-button>
          <van-button
            color="#334EF9"
            plain
            size="small"
            v-if="direction==2"
            @click="clickdirection1"
          >出门</van-button>
          <van-button
            color="#334EF9"
            plain
            size="small"
            v-if="direction==1"
            style="margin-left:1rem;"
            @click="clickdirection2"
          >回家</van-button>
          <van-button
            color="#334EF9"
            size="small"
            v-if="direction==2"
            style="margin-left:1rem;"
            @click="clickdirection2"
          >回家</van-button>
        </div>
      </div>
    </div>
    <div class="car" v-for="(item,index) in currentData" :key="index">
      <div class="car_destination">
        <div class>
          <div class="car_destination_div" />
        </div>
        <div class="car_destination_word">{{item.lineDestination}}</div>
      </div>
      <div class="car_card">
        <div class="car_card_line">
          <div class="car_card_line_title">{{item.lineName}}</div>
          <div class="car_card_line_money">￥{{item.lineMoney}}</div>
        </div>
        <div class="car_card_groove">
          <div class="car_card_groove_left"></div>
          <div class="car_card_groove_right"></div>
        </div>
        <div class="car_card_details">
          <div class="car_card_details_origin">
            <div>
              <div class="car_card_details_origin_div"></div>
            </div>
            <div class="car_card_details_origin_word">{{item.lineOrigin}}</div>
          </div>
          <div class="car_card_details_destination">
            <div>
              <div class="car_card_details_destination_div"></div>
            </div>
            <div class="car_card_details_destination_word">{{item.lineDestination}}</div>
          </div>
        </div>
        <div class="car_card_time">
          <van-button
            color="#334ef9"
            plain
            type="info"
            v-for="(it,i) in item.lineTime"
            :key="i"
            class="car_card_time_item"
            @click="buyTicket(item,it)"
          >{{it}}</van-button>
        </div>
      </div>
    </div>
    <div class="bottom"></div>
  </div>
</template>

<script>
// import { link } from "fs";
// @ is an alias to /src
// import http from '@/utils/http.js'

export default {
  name: "home",
  data() {
    return {
      uptownName: "",
      uptownPeople: "",
      time: 1,
      direction: 1,
      // iii: [1, 2, 3],
      currentData: this.carObj,
      carObj: [],
      carObj2: [],
      carObj3: [],
      carObj4: [],
      userId: ""
    };
  },
  components: {},
  beforeMount: function() {
    let userobject=localStorage.getItem("user")
    if(userobject==null||userobject==undefined){
        this.uptownName = "万科金色梦想";
      let m = { uptownId: 1 };
      this.axios
        .post(this.baseurl + "/user/CountByUptownID/", m)
        .then(response => {
          this.uptownPeople = response.data;
        });
      this.axios.post(this.baseurl + "/line/WorkGoOut", m).then(response => {
        window.console.log(response.data);
        this.carObj = response.data;
        this.currentData = response.data;
      });
      this.axios.post(this.baseurl + "/line/WorkGoBack", m).then(response => {
        this.carObj2 = response.data;
      });
      this.axios.post(this.baseurl + "/line/WeekendGoOut", m).then(response => {
        this.carObj3 = response.data;
      });
      this.axios
        .post(this.baseurl + "/line/WeekendGoBack", m)
        .then(response => {
          this.carObj4 = response.data;
        });
   
    }else{
    let t = JSON.parse(userobject).tokenId;
    this.axios.get(this.baseurl + "/getUptownByUserId/" + t).then(res => {
      window.console.log(res);
      this.uptownName = res.data.uptownName;
      let m = { uptownId: res.data.uptownId };
      this.axios
        .post(this.baseurl + "/user/CountByUptownID/", m)
        .then(response => {
          this.uptownPeople = response.data;
        });
      this.axios.post(this.baseurl + "/line/WorkGoOut", m).then(response => {
        window.console.log(response.data);
        this.carObj = response.data;
        this.currentData = response.data;
      });
      this.axios.post(this.baseurl + "/line/WorkGoBack", m).then(response => {
        this.carObj2 = response.data;
      });
      this.axios.post(this.baseurl + "/line/WeekendGoOut", m).then(response => {
        this.carObj3 = response.data;
      });
      this.axios
        .post(this.baseurl + "/line/WeekendGoBack", m)
        .then(response => {
          this.carObj4 = response.data;
        });
    });

    this.currentData = this.carObj;
    }
  },
  methods: {
    doit() {
      this.$store.commit("increment");
    },
    clicktime1() {
      this.time = 1;
      if (this.direction == 1) {
        this.currentData = this.carObj;
      }
      if (this.direction == 2) {
        this.currentData = this.carObj2;
      }
    },
    clicktime2() {
      this.time = 2;
      if (this.direction == 1) {
        this.currentData = this.carObj3;
      }
      if (this.direction == 2) {
        this.currentData = this.carObj4;
      }
    },
    clickdirection1() {
      this.direction = 1;
      if (this.time == 1) {
        this.currentData = this.carObj;
      }
      if (this.time == 2) {
        this.currentData = this.carObj3;
      }
    },
    clickdirection2() {
      this.direction = 2;
      if (this.time == 1) {
        this.currentData = this.carObj2;
      }
      if (this.time == 2) {
        this.currentData = this.carObj4;
      }
    },
    buyTicket(e, k) {
      let token = localStorage.getItem("user");
      if (token == null || token == undefined) {
       this.$router.push({
         path:"/mine"
       })
      }else{
         let order = { lineNumber: "123" };

        sessionStorage.setItem("order", JSON.stringify(order));
        this.$router.push({
          name: "buyticketdetails",
          params: {
            lineDate: e.lineDate,
            lineDestination: e.lineDestination,
            lineDirection: e.lineDirection,
            lineId: e.lineId,
            lineMoney: e.lineMoney,
            lineName: e.lineName,
            lineOrigin: e.lineOrigin,
            lineTime: k,
            uptownId: e.uptownId
          }
        });
      }
    },
    onClickSwitch() {
      this.$router.push({ path: "/address" });
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
.header {
  width: 100%;
  height: 12rem;
  background-image: url("../assets/c.jpg");
  background-size: 100% 12rem;
}
.header_word {
  color: #ffffff;
  font-weight: 900;
  text-align: left;
  margin-left: 1rem;
  padding-top: 0.5rem;
}
.header_title {
  font-weight: 900;
  margin-top: 2rem;
}
.header_title_uptownName {
  color: #ffffff;
  font-size: 2rem;
}
.header_title_uptownPeople {
  color: #ffffff;
}
.area_selection {
  width: 100%;
  height: 1rem;
}
.area_selection_choose {
  margin: 0rem 2rem 0rem 2rem;
  margin-top: -1rem;
  box-shadow: 0px 3px 3px #c8c8c8;
}
/* .area_selection_choose >>> [role='tablist']{ */
.area_selection_choose >>> .van-tabs__nav.van-tabs__nav--line {
  border-radius: 0.5rem !important;
}
.time_choose_black {
  margin-top: 3rem;
  width: 100%;
}
.time_choose {
  margin: 0rem 2rem 0rem 2rem;
  text-align: left;
  border-radius: 0.5rem;
  background-color: #ffffff;
  box-shadow: 0px 3px 3px #c8c8c8;
}
.time_choose_timeframe {
  margin-left: 1rem;
  padding-top: 1rem;
}
.time_choose_direction {
  margin-left: 1rem;
  padding-top: 1rem;
  padding-bottom: 1rem;
}
.car {
  margin-top: 2rem;
  width: 100%;
}
.car_destination {
  margin: 0rem 2rem 0rem 2rem;
  display: flex;
}
.car_destination_div {
  height: 1.2rem;
  width: 0.8rem;
  border-radius: 5rem;
  background-color: #334ef9;
}
.car_destination_word {
  display: flex;
  flex-wrap: wrap;
  margin-left: 0.2rem;
  font-size: 1.05rem;
  font-weight: 1000;
}
.car_card {
  margin: 1rem 2rem 0rem 2rem;
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
  padding-left: 2rem;
  font-size: 1.2rem;
  font-weight: 800;
}
.car_card_line_money {
  padding-right: 2rem;
  font-size: 1.5rem;
  color: #e21918;
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
  margin-left: 2rem;
}
.car_card_details_origin_div {
  width: 1rem;
  height: 1rem;
  border: 2px solid #7ed321;
  border-radius: 5rem;
}
.car_card_details_origin_word {
  margin-left: 1rem;
  color: #747474;
}
.car_card_details_destination {
  display: flex;
  padding-bottom: 1rem;
  margin: 1rem 0rem 0rem 2rem;
}
.car_card_details_destination_div {
  width: 1rem;
  height: 1rem;
  border: 2px solid #ff618b;
  border-radius: 5rem;
}
.car_card_details_destination_word {
  margin-left: 1rem;
  color: #747474;
}
.bottom {
  padding-bottom: 4rem;
}
.car_card_time {
  display: flex;
  flex: row;
  flex-wrap: wrap;
  margin-left: 0.25rem;
}
.car_card_time_item {
  margin: 0.5rem 0.25rem 0.5rem 0.25rem;
}
</style>