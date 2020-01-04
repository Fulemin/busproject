<template>
  <div>
    <van-nav-bar title="添加新乘客" left-arrow @click-left="onClickLeft" />
    <div class="line"></div>
    <div class="content">
      <div class="contenttext">
        <div class="contentexttype">
          <div class="contentexttype_A">购票类型</div>
          <div class="contentexttype_B">
            <div>{{type}}</div>
            <div class="contentexttype_B_icon">
              <van-icon name="arrow" @click="onclickticket" />
              <van-action-sheet
                v-model="showticket"
                :actions="actionsticket"
                cancel-text="取消"
                @select="onSelectticket"
                @cancel="onCancelticket"
              />
            </div>
          </div>
        </div>
        <div>
          <van-cell-group>
            <van-field v-model="passengerName" required clearable label="姓名" placeholder />
          </van-cell-group>
        </div>
        <div>
          <van-cell-group>
            <van-field
              v-model="phone"
              value="phone2"
              required
              clearable
              label="手机号"
              placeholder="请输入您的手机号"
            />
          </van-cell-group>
        </div>
        <div class="contentexttype">
          <div class="contentexttype_A">证件类型</div>
          <div class="contentexttype_B">
            <div>居名身份证</div>
            <div class="contentexttype_B_icon">
              <van-icon name="arrow" @click="onclickid" />
              <van-action-sheet
                v-model="showid"
                :actions="actionsid"
                cancel-text="取消"
                @select="onSelectid"
                @cancel="onCancelid"
              />
            </div>
          </div>
        </div>
        <div>
          <van-cell-group>
            <van-field v-model="idCard" required clearable label="证件号码" placeholder="请输入您的证件号码" />
          </van-cell-group>
        </div>
        <div>
          <van-cell-group>
            <van-switch-cell v-model="checked" title="设置为默认乘客" />
          </van-cell-group>
        </div>
      </div>
      <div class="contentissave">
        <div class="contentissave_canel" @click="cancel">取消</div>
        <div class="contentissave_save" @click="save">保存</div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      type: "成人",
      passengerName: "",
      phone: "",
      idCard: "",
      checked: true,
      showticket: false,
      showid: false,
      actionsticket: [{ name: "成人" }, { name: "儿童1.5米以下" }],
      actionsid: [{ name: "居民身份证" }]
    };
  },
  methods: {
    save() {
      let m = {
        passengerName: this.passengerName,
        passengerPhone: this.phone,
        passengerIdCard: this.idCard,
        passengerType: this.type
      };
      let t = this;
      t.axios
        .put(this.baseurl + "/updatePassenger", m)
        .then(function(response) {
          // let mes = response.data
          t.$router.replace({
            path: "/passenger"
          });

          window.console.log(response);
        });

      // });
    },
    cancel() {
      window.history.back(-1);
    },
    onClickLeft() {
      window.history.back(-1);
    },
    onclickticket() {
      this.showticket = true;
    },
    onclickid() {
      this.showid = true;
    },
    onSelectid() {},
    onCancelid() {},
    onSelectticket(type) {
      // 默认情况下，点击选项时不会自动关闭菜单
      // 可以通过 close-on-click-action 属性开启自动关闭
      this.showticket = false;
      this.type = type.name;
    },
    onCancelticket() {
      this.showticket = false;
    }
  },
  beforeMount: function() {
    this.phone = this.$route.query.passengerPhone;
    this.idCard = this.$route.query.passengerIdCard;
    this.type = this.$route.query.passengerType;
    this.passengerName = this.$route.query.passengerName;
  },
   computed: {
    baseurl() {
      return this.$store.state.baseurl;
    }
  }
};
</script>
<style scoped>
.contentissave {
  position: absolute;
  bottom: 30px;
  width: 100%;
  height: 60px;
  display: flex;
  justify-content: space-between;
  padding-bottom: 30px;
  display: flex;
}
.contentissave div {
  display: flex;
  flex-direction: column;
  justify-content: center;
}
.contentissave_canel {
  flex-grow: 1;
}
.contentissave_save {
  flex-grow: 1;
  background-color: #334ef9;
  color: #ffffff;
}
.line {
  height: 15px;
  background-color: #f3f8fb;
}
.contenttext {
  background-color: #ffffff;
  text-align: left;
}
.contentexttype {
  display: flex;
  flex-direction: row;
  padding-bottom: 5px;
  padding-top: 5px;
}
.contentexttype_A {
  margin-left: 15px;
  width: 30%;
  font-size: 15px;
}
.contentexttype_B {
  display: flex;
  flex-direction: row;
  flex-grow: 1;
  justify-content: space-between;
  padding-left: 30px;
  font-size: 15px;
}
.contentexttype_B_icon {
  padding-top: 3px;
  padding-right: 20px;
}
</style>
