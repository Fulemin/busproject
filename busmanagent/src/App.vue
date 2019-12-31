<template>
  <div id="app">
    <el-container style="height:100%">
      <el-header>欢迎进入码神巴士管理系统</el-header>
      <el-container>
        <el-aside width="15%">
          <el-row class="tac">
            <el-col :span="24" style="height:100%">
              <!-- <h5>自定义颜色</h5> -->
              <el-menu
                default-active="1"
                class="el-menu-vertical-demo"
                @open="handleOpen"
                @close="handleClose"
                background-color="#545c64"
                text-color="#fff"
                active-text-color="#ffd04b"
                style="height:100%"
                :router="true"
              >
                <el-menu-item index="/">
                  <i class="el-icon-s-home"></i>
                  <span slot="title">首页</span>
                </el-menu-item>
                <el-menu-item index="/vehicleManagement">
                  <i class="el-icon-menu"></i>
                  <span slot="title">车辆管理</span>
                </el-menu-item>
                <el-menu-item index="3">
                  <i class="el-icon-guide"></i>
                  <span slot="title">线路管理</span>
                </el-menu-item>
                <el-menu-item index="/order">
                  <i class="el-icon-document"></i>
                  <span slot="title">订单管理</span>
                </el-menu-item>
                <el-menu-item index="5">
                  <i class="el-icon-house"></i>
                  <span slot="title">小区管理</span>
                </el-menu-item>
                <el-menu-item index="6">
                  <i class="el-icon-setting"></i>
                  <span slot="title">用户管理</span>
                </el-menu-item>
              </el-menu>
            </el-col>
          </el-row>
        </el-aside>
        <el-main width="80%">
          <router-view />
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>


<script>
export default {
  data() {
    return {
      height: ""
    };
  },
  methods: {
    handleOpen(key, keyPath) {
      window.console.log(key, keyPath);
    },
    handleClose(key, keyPath) {
      window.console.log(key, keyPath);
    }
  },
  beforeMount() {
    this.height = window.innerHeight;
  }
};
</script>
<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  height: 100%;
}
html,
body {
  margin: 0px;
  height: 100%;
}
.tac {
  height: 100%;
}
#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
.el-header {
  background-color: #545c64;
  color: white;
  display: flex;
  align-items: center;
}
</style>
