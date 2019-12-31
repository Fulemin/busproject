<template>
  <div id="container">
    <div class="orderheader">
      <div>订单管理</div>
      <div class>时间：{{time}}</div>
    </div>
    <!-- <div class="dateselect">
      <div class="block">
        <span class="demonstration">订单时间：</span>
        <el-date-picker
          v-model="value2"
          type="daterange"
          align="right"
          unlink-panels
          range-separator="至"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
          :picker-options="pickerOptions"
        ></el-date-picker>
      </div>
      <div class="block">
        <span>订单状态：</span>
        <el-select v-model="value" placeholder="请选择">
          <el-option
            v-for="item in options"
            :key="item.value"
            :label="item.label"
            :value="item.label"
          ></el-option>
        </el-select>
      </div>
      <div class="block">
        <el-button type="primary" @click="onSearch(value,value2)">查询</el-button>
      </div>
      <div class="block">
        <el-button>重置</el-button>
      </div>
    </div>-->
    <div class="search">
      <div class="searchContent">
        <el-input v-model="input" placeholder="请输入内容" clearable :maxlength=10 />
      </div>
      <div class="searchBu">
        <el-button type="primary"
        @click="onSearch(input)">查询</el-button>
      </div>
    </div>
    <div class="hidden"></div>
    <div class="table">
      <el-table :data="tableData" style="width: 100%">
        <el-table-column prop="orderId" label="订单编号" width="100"></el-table-column>
        <el-table-column prop="userName" label="用户名" width="100"></el-table-column>
        <el-table-column prop="origin" label="起点"></el-table-column>
        <el-table-column prop="destination" label="终点"></el-table-column>
        <el-table-column prop="getOn" label="上车点"></el-table-column>
        <el-table-column prop="getOff" label="下车点"></el-table-column>
        <el-table-column prop="time" label="车次时间"></el-table-column>
        <el-table-column prop="date" :formatter="format" label="车票时间"></el-table-column>
        <el-table-column prop="createTime" label="下单时间"></el-table-column>
        <el-table-column prop="payment" :formatter="formatPayState" label="支付状态"></el-table-column>
      </el-table>
    </div>
    <div class="pages">
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage4"
        :page-sizes="[pagesize]"
        :page-size="pagesize"
        layout=" total,sizes, prev, pager, next, jumper"
        :total="total"
      ></el-pagination>
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      // pickerOptions: {
      //   shortcuts: [
      //     {
      //       text: "最近一周",
      //       onClick(picker) {
      //         const end = new Date();
      //         const start = new Date();
      //         start.setTime(start.getTime() - 3600 * 1000 * 24 * 7);
      //         picker.$emit("pick", [start, end]);
      //       }
      //     },
      //     {
      //       text: "最近一个月",
      //       onClick(picker) {
      //         const end = new Date();
      //         const start = new Date();
      //         start.setTime(start.getTime() - 3600 * 1000 * 24 * 30);
      //         picker.$emit("pick", [start, end]);
      //       }
      //     },
      //     {
      //       text: "最近三个月",
      //       onClick(picker) {
      //         const end = new Date();
      //         const start = new Date();
      //         start.setTime(start.getTime() - 3600 * 1000 * 24 * 90);
      //         picker.$emit("pick", [start, end]);
      //       }
      //     }
      //   ]
      // },
      options: [
        {
          value: "选项1",
          label: "未支付"
        },
        {
          value: "选项2",
          label: "已支付"
        },
        {
          value: "选项3",
          label: "已退款"
        }
      ],
      value: "",
      label: "",
      input:"",
      // value2: "",
      tableData: [
        {
          orderId: 1,
          userName: "张三",
          origin: "中海誉城/爱特城",
          destination: "华师/岗顶/石牌桥/体育西路/动物园/区庄",
          geton: "中海誉城",
          getoff: "爱特城",
          lineTime: "06:30",
          ticketDate: [],
          createTime: "2019-12-30 15:55:06",
          paymentState: "未支付"
        }
      ],
      currentPage4: 1,
      pagesize: 5,
      time: "",
      total: 0,
      baseurl: "http://localhost:8888/getOrderToAdmin/",
      counturl: "http://localhost:8888/sumOrderToAdmin"
    };
  },
  filters: {
    formatDate: function(value) {
      return value.join("|");
    }
  },
  beforeMount() {
    this.ajaxLoadData(0, this.pagesize);
    setInterval(() => {
      this.time = new Date().toLocaleString();
    }, 1000);
  },
  methods: {
    /**
     * 格式化内容
     */
    format(row, column) {
      console.info(column);
      return this._.join(row.date, ",");
    },
    formatPayState(row, column) {
      let str = "";
      console.info(row, column);
      switch (row.payment) {
        case 0:
          str = "未支付";
          break;
        case 1:
          str = "已支付";
          break;
        default:
          str = "已退款";
      }
      return str;
    },
    /**
     * 更换页数
     */
    handleSizeChange(val) {
      window.console.log(`每页 ${val} 条`);
    },
    handleCurrentChange(val) {
      this.currentPage4 = val;
      this.ajaxLoadData(this.currentPage4, this.pagesize);
    },
    /**
     *异步请求
     */
    ajaxLoadData(positionBegin, len) {
      let url = this.baseurl + positionBegin + "/" + len;
      this.axios.get(url).then(res => {
        this.tableData = [];
        this.tableData = res.data;
      });
      this.axios.get(this.counturl).then(res => {
        this.total = res.data;
      });
    },
    // onSearch(e, k) {
    //   var array = [];
    //   window.console.log("array.length");
    //   for (var i = 0; i < this.tableData.length; i++) {
    //     if (e == this.tableData[i].payment) {
    //       array.push(this.tableData[i]);
    //     }
    //   }
    //   window.console.log(array);
    //   this.tableData = array;
    // }
    onSearch(e){
      console.log(e)
      this.ajaxLoadData()
    }
  }
};
</script>
<style scoped>
#container {
  display: flex;
  flex-direction: column;
}
.orderheader {
  display: flex;
  justify-content: space-between;
  padding: 0.5rem 2rem 1rem 5rem;
  border-bottom: 1px solid #f2f4f6;
}
/* .block {
  text-align: left;
  padding: 0.5rem;
} */
/* .dateselect {
  display: flex;
  margin-left: 1rem;
  margin-top: 0.5rem;
} */
/* .demonstration {
  margin-right: 0.5rem;
} */
.search{
  display: flex;
  justify-content: center;
  margin: 1rem 0rem 1rem 0rem 
}
.searchContent{
  width: 30%;
  margin-right: 1rem
}
.hidden {
  background-color: #f2f4f6;
  height: 1rem;
  width: 99%;
  margin-left: 1rem;
}
.table {
  margin-left: 1rem;
  box-shadow: 0px 3px 3px #c8c8c8
}
.pages {
  display: flex;
  justify-content: center;
  margin-top: 1rem;
  margin-left: 1rem;
}
.pagescount {
  padding-top: 0.2rem;
  padding-right: 0.5rem;
}
</style>