<template>
  <div class="Alert">
    <div class="Alert_left">温馨提示</div>
    <div class="Alert_right">
      <div class="Alert_right_A">车票仅有效于当前班次，请对号入座，发车前一小时可改签</div>
      <div class="Alert_right_B" @click="onclick_contact">联系客服</div>
    </div>
    <van-overlay :show="show" @click="show = false">
      <div class="wrapper">
        <div class="block">
          <div class="block_text">入驻小区成功</div>
        </div>
      </div>
    </van-overlay>
  </div>
</template>
<style scoped>
.Alert {
  background-color: #f6f7fb;
  left: 0px;
  height: 40px;
  width: 100%;
  display: flex;
  flex-direction: row;
  font-size: 10px;
}
.Alert_left {
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 25px;
  margin-right: 5px;
}
.Alert_right {
  flex-grow: 1;
  display: flex;
}
.Alert_right div {
  display: flex;
  flex-direction: column;
  justify-content: center;
}
.Alert_right_A {
  flex-grow: 1;
}
.Alert_right_B {
  color: #334ef9;
  margin-right: 12px;
  width: 25px;
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
  color: #0000ff;
}
</style>
<script>
export default {
     data() {
    return {
      show: false
    };
  },
  methods: {
    onclick_contact() {
      this.show = true;
    }
  }
}
</script>