<template>
  <div>
    <van-nav-bar title="选择小区" left-arrow @click-left="onClickLeft" :fixed="true" />
    <div id="content">
      <div class="contentsearch">
        <van-search placeholder="请输入小区名" v-model="value" @search="onSearch" @cancel="onCancel" show-action />
        <div
          class="contentsearchvalue"
          v-for="(items,index) in searchname"
          v-bind:key="index"
          @click="onclick_first(items)"
        >{{items.uptownName}}</div>
      </div>
      <div class="contenthot">
        <van-tag type="primary" style="height:10px"></van-tag>热门小区
      </div>
      <div class="contenttext">
        <div
          class="contenttext_A"
          @click="onclick_first(i)"
          v-for="(i,index) in count"
          v-bind:key="index"
        >{{i.uptownName}}</div>
        <!-- <div class="contenttext_A" @click="onclick_second">{{i.uptownName}}</div> -->
      </div>
      <!-- <van-overlay :show="show" @click="show = false">
        <div class="wrapper">
          <div class="block">
            <div class="block_text">入驻小区成功</div>
            <div class="block_a" @click="onclickconfirm(i)">确定</div>
          </div>
        </div>
      </van-overlay>-->
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      value: "",
      // show: false,
      searchname: "",
      count: "",
      userId: "",
      uptownId: ""
    };
  },
  methods: {
    onClickLeft() {
      window.history.back(-1);
    },
    onclick_first(e) {
      // this.show = true;
      this.$dialog
        .alert({
          message: "入驻小区成功"
        })
        .then(() => {
          let m = {
            userId: this.userId,
            uptownId: e.uptownId
          };
          let t = this;
          t.axios.put(this.baseurl + "/updateUser", m).then(response => {
            window.console.log(response);
            t.$router.push({
              path: "/buyticket"
            });
          });
        });
    },
    onSearch() {
      let t =this;
      let m = t.value;
      // window.console.log(m);
       t.axios.post(this.baseurl + "/uptown/name/",{"uptownName":m}).then(response => {
        window.console.log(response);
        t.searchname=response.data
      });
    },
    onCancel(){
      window.location.reload();
    }
  },
  beforeMount() {
    this.axios.get(this.baseurl + "/uptown").then(response => {
      window.console.log(response);
      this.count = response.data;
    });
    let userObject =localStorage.getItem("user");
    if(userObject==null||userObject==undefined){
        this.userId = 1
    }else{
      let m = JSON.parse(userObject);
    this.userId =m.tokenId
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
#content {
  background-color: #ffffff;
  margin-top: 45px;
}
.van-cell {
  color: blue;
}
/* .contentsearch {
  box-shadow: 0px, 3px, 3px, #c8c8c8;
} */
.contentsearchvalue {
  background-color: #ffffff;
  text-align: left;
  margin-left: 40px;
  margin-bottom: 20px;
}
.contenthot {
  background-color: #ffffff;
  text-align: left;
  margin-left: 20px;
  font-weight: bolder;
  margin-bottom: 20px;
}
.contenttext {
  display: flex;
  flex-wrap: wrap;
  margin: 10px;
  height: 28px;
  background-color: #ffffff;
  /* display: flex;
  flex-wrap: wrap; */
  /* flex-direction: row; */
}
.contenttext_A {
  border-bottom: 1px solid #c8c8c8;
  text-align: left;
  font-size: 15px;
  margin-left: 10px;
  padding: 5px;
  width: 40%;
}
.contenttext_B {
  font-size: 15px;
}
.wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 100%;
}
.block {
  width: 250px;
  height: 100px;
  background-color: #fff;
  display: flex;
  flex-direction: column;
}
.block_text {
  padding-top: 20px;
  padding-bottom: 20px;
}
.block_a {
  color: #446dfa;
}
</style>