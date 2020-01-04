<template>
  <div id="container">
    <div class="header">
      <div v-if="token==null">
        <a
          href="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8ab51aa00c0248e8&redirect_uri=http://113.119.134.145/mine&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect"
        >
          <van-image :src="image" id="imgInit" type="contain" round width="4rem" height="4rem" />
        </a>
      </div>
      <div v-if="token!=null">
        <van-image :src="image" id="imgInit" type="contain" round width="4rem" height="4rem" />
      </div>
      <!-- <div>
        <a href="https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8ab51aa00c0248e8&redirect_uri=http://113.119.75.200/mine&response_type=code&scope=snsapi_userinfo&state=STATE#wechat_redirect"><van-image :src="image" type="contain" round width="4rem" height="4rem" /></a>
      </div>-->
      <!-- <button @click="getToken"></button> -->
      <div class="headertext">{{userName}}</div>
      <div class="headertext">{{userPhone}}</div>
      <div class="headertext">信用值:{{userCredit}}</div>
    </div>
    <div class="content">
      <van-cell title="车票" icon="coupon-o" is-link to="/ticket" />
      <van-cell title="常用乘客" icon="manager-o" is-link to="/passenger" />
      <div class="content_background"></div>
      <van-cell title="所在小区" icon="wap-home-o" is-link to="/address">
        <div slot="default">{{uptownName}}</div>
      </van-cell>
    </div>
    <div></div>
    <div></div>
  </div>
</template>
<script>
// var image = require("@/assets/logo.png")
// import image from "@/assets/a.jpeg";
export default {
  data() {
    return {
      image: "",
      userName: "",
      userPhone: "188***5857",
      userCredit: "100",
      uptownName: "",
      code: "",
      token: "",
      tokenId:""
    };
  },
  methods: {
    getSomeParam() {
      let code = this.getParam("code");
      this.code = code;
    },
    getParam(variable) {
      var query = window.location.search.substring(1);
      var vars = query.split("&");
      for (var i = 0; i < vars.length; i++) {
        var pair = vars[i].split("=");
        if (pair[0] == variable) {
          return pair[1];
        }
      }
      return false;
    }
  },
  beforeMount: function() {
    let userObject = localStorage.getItem("user");
    this.token = userObject;
    if (userObject == null || userObject == undefined) {
      this.getSomeParam();
      let url = this.baseurl + "/getUserInfo?code=" + this.code;
      this.axios.get(url).then(a => {
        // console.log(a);
        this.image = a.data.headimgurl;
        this.userName = a.data.nickname;
        let user = {
          tokenId: a.data.tokenId,
          image: a.data.headimgurl,
          userName: a.data.nickname
        };

        this.axios
          .get(this.baseurl + "/getUptownByUserId/" + a.data.tokenId)
          .then(res => {
            // window.console.log(res);
            this.uptownName = res.data.uptownName;
          });
        localStorage.setItem("user", JSON.stringify(user));
      });

     
    }else{
      let user = JSON.parse(userObject);
      this.image = user.image;
      this.userName = user.userName;
      this.tokenId = user.tokenId;
      let t = this.tokenId;

      this.axios.get(this.baseurl + "/getUptownByUserId/" + t).then(res => {
        // window.console.log(res);
        this.uptownName = res.data.uptownName;
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
#container {
  display: flex;
  flex-direction: column;
}
.header {
  display: flex;
  flex-direction: column;
  justify-content: center;
  background-image: linear-gradient(to right, #4bb0ff, #6149f6);
  height: 12rem;
}
.headertext {
  padding: 0.2rem;
  color: #fffffe;
  font-size: 0.75rem;
}
.content {
  text-align: left;
}
.content_background {
  margin-left: 15px;
  margin-right: 15px;
  background-color: #f6f7fb;
  height: 0.75rem;
}
.van-cell__left-icon {
  color: blue;
}
</style>
