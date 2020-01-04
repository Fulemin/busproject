<template>
  <div>
    <van-nav-bar title="选择乘客" left-text="返回" left-arrow @click-left="onClickLeft" />

    <!-- <div class="input_div"> -->
    <van-checkbox-group v-model="card">
      <div class="flex" v-for="(item,index) in currentData" :key="index" >
        <!-- @click="toggle(index)" -->
        <!-- ref="checkboxes"  -->
        <van-checkbox :name="item"/>
        <div class="header">
          <div class="header_title">
          <div class="header_title_name">
            <div class="header_title_name_user">{{item.passengerName}}</div>
            <div class="header_title_name_default">{{item.passangerDefault}}</div>
          </div>
          <div class="header_title_type">
            <div class="header_title_type_adult">{{item.passengerType}}</div>
            <div class="header_title_type_id">{{item.passengerIdCard}}</div>
          </div>
        </div>
        <div class="header_revision">
          <div class="header_revision_edit">
            <van-icon :name="iconA" color="#e6e6e6" @click="onclickedit(item)" />
          </div>
          <div class="header_revision_delete">
            <van-icon :name="iconB" @click="onclickdetele(item.passengerIdCard)" />
          </div>
        </div>
        </div>
      </div>
    </van-checkbox-group>
    <!-- </div> -->

    <div class="content">
      <div class="contenticon" @click="gotoAddPassenger">
        <van-icon name="add-o" />添加新乘客
      </div>
      <div class="button_div">
        <van-button type="default" color="blue" @click="confirm">确定</van-button>
      </div>
    </div>
  </div>
</template>
<script>
import iconA from "@/icon/edit.png";
import iconB from "@/icon/delete.png";
export default {
  data() {
    return {
      card: [],
      currentData: [],
      iconA: iconA,
      iconB: iconB,
    };
  },
  methods: {
    onClickLeft() {
      window.history.back(-1);
    },
    gotoAddPassenger() {
      this.$router.push({
        path: "/addpassenger"
      });
    },
    onclickedit(e) {
      this.$router.push({
        path: "/editpassenger",
        query: {
          passengerPhone: e.passengerPhone,
          passengerName: e.passengerName,
          passangerDefault: e.passangerDefault,
          passengerType: e.passengerType,
          passengerIdCard: e.passengerIdCard
        }
      });
    },
    onclickdetele(e) {
      this.$dialog
        .confirm({
          title: "是否删除此乘客"
        })
        .then(() => {
          let m = {
            passengerIdCard: e
          };
          this.axios
            .delete(this.baseurl + "/deletePassenger", { data: m })
            .then(response => {
              window.console.log(response);
              window.location.reload();
            });
        })
        .catch(() => {
          // on cancel
        });
    },
    confirm(){
      let passenger ={"ps":this.card};
      sessionStorage.setItem("passenger", JSON.stringify(passenger));
          this.$router.push({
            path:'/payment',
            // query:{
            //   "ps":this.card
            // }
          })
    }
  },

  mounted: function() {},
  beforeMount: function() {
    let t = {tokenId:JSON.parse(localStorage.getItem("user")).tokenId}
    this.axios.post(this.baseurl + "/allPassenger",t).then(response => {
      // window.console.log(response);
      this.currentData = response.data;
    });
    
  },
   computed: {
    baseurl() {
      return this.$store.state.baseurl;
    }
  }
};
</script>
<style scoped>
.flex{
  display: flex;
  padding-left: 0.8rem;
  margin-bottom: 0.8rem;
  background-color: #ffffff;
  box-shadow: 0px 3px 3px #c8c8c8;
}
.content {
  display: flex;
  justify-content: space-between;
  font-size: 15px;
  height: 44px;
  position: absolute;
  bottom: 3rem;
  width: 100%;
  box-shadow: 0px 3px 3px #c8c8c8;
  color: #334ef9;
  font-weight: bolder;
  background-color: #ffffff;
}
/* .content div {
  display: flex;
  flex-direction: column;
  justify-content: center;
} */
.contenticon {
  /* display: flex; */
  flex-grow: 1;
  padding-top: 12px;
}
.button_div {
  flex-grow: 1;
  background-color: blue;
}
.van-icon {
  padding-right: 5px;
}
.input_div {
  display: flex;
  padding-left: 10px;
}
.header {
  display: flex;
  margin: 15px;
  height: 60px;
  /* box-shadow: 0px 3px 3px #c8c8c8;
  background-color: #ffffff; */
  /* justify-content: flex-end; */
  width: 300px;
}
.header_title {
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
}
</style>
