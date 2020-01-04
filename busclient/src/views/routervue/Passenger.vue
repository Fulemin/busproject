<template>
  <div>
    <van-nav-bar left-text="返回" left-arrow @click-left="onClickLeft" />
    <div class="header" v-for="(item,index) in currentData" :key="index">
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
    <div class="content" @click="onclick">
      <div class="contenticon">
        <van-icon name="add-o" />添加新乘客
      </div>
      <!-- <div class="contenttext">添加新乘客</div> -->
    </div>
  </div>
</template>
<script>
import iconA from "@/icon/edit.png";
import iconB from "@/icon/delete.png";
export default {
  data() {
    return {
      currentData: [],
      iconA: iconA,
      iconB: iconB,
      carObj: [
        {
          user: "张三",
          default: "默认",
          adult: "成人",
          id: "*****2222"
        }
      ]
    };
  },
  methods: {
    onClickLeft() {
      // window.history.back(-1);
      this.$router.replace({
        path: "/mine"
      });
    },
    onclick() {
      this.$router.push({
        path: "/addpassenger"
      });
    },
    onclickedit(e) {
      this.$router.push({
        path: 
          '/editpassenger', 
        query: 
          {
            passengerPhone:e.passengerPhone,
            passengerName: e.passengerName, 
            passangerDefault:e.passangerDefault,
            passengerType:e.passengerType,
            passengerIdCard:e.passengerIdCard
          }
      })
    },
    onclickdetele(e) {
      this.$dialog
        .confirm({
          title: "是否删除此乘客"
          // message: "弹窗内容"
        })
        .then(() => {
         let m={
           "passengerIdCard":e
         }
          this.axios
            .delete(this.baseurl + "/deletePassenger",{data:m})
            .then(response=> {
              window.console.log(response);
              window.location.reload();
            });
            // this.reload();
        })
        .catch(() => {
          // on cancel
        });
    }
  },
  
  mounted: function() {
    
  },
  beforeMount: function() {
    let userObject= localStorage.getItem("user")
    if(userObject==null||userObject==undefined){
        this.currentData = this.carObj;
    }else{
    let t = {tokenId:JSON.parse(userObject).tokenId}
    this.axios.post(this.baseurl + "/allPassenger",t).then(response => {
      window.console.log(response);
      this.currentData = response.data;
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
.content {
  display: flex;
  justify-content: center;
  font-size: 15px;
  margin: 15px;
  height: 40px;
  flex-direction: column;
  box-shadow: 0px 3px 3px #c8c8c8;
  color: #334ef9;
  font-weight: bolder;
  background-color: #ffffff;
}
.van-icon {
  padding-right: 5px;
}
.header {
  display: flex;
  margin: 15px;
  height: 60px;
  box-shadow: 0px 3px 3px #c8c8c8;
  background-color: #ffffff;
  /* justify-content: flex-end; */
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
