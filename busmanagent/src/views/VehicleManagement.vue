<template>
  <div class>
    <div class="header">
      <div>
        车辆管理：
        <el-button type="primary" @click="addBusButtom">
          新增车辆
          <i class="el-icon-upload el-icon--right"></i>
        </el-button>
      </div>
      <el-dialog title="新增车辆" :visible.sync="addBus" width="30%"
      :close-on-click-modal=false>
        <div>
          <div class="text-align-left">
            <span>车牌号</span>
          </div>
          <el-input v-model="bus.busNumbers" placeholder="请输入车牌号" clearable></el-input>
        </div>
        <div class="margin-top-6">
          <div class="text-align-left">
            <span>车辆颜色</span>
          </div>
          <el-input v-model="bus.busColor" placeholder="请输入车辆颜色" clearable></el-input>
        </div>
        <div class="margin-top-6">
          <div class="text-align-left">
            <span>车位</span>
          </div>
          <el-input v-model="bus.seatNumber" placeholder="请输入车位" clearable></el-input>
        </div>
        <div class="margin-top-6">
          <div class="text-align-left">
            <span>车辆详情</span>
          </div>
          <el-input v-model="bus.busDetail" placeholder="请输入车辆详情" clearable></el-input>
        </div>
        <span slot="footer" class="dialog-footer">
          <el-button @click="addBus = false">取 消</el-button>
          <el-button type="primary" @click="addBusProject(bus)">确 定</el-button>
        </span>
      </el-dialog>
      <div class>时间：{{time}}</div>
    </div>
    <div class="table">
      <el-table :data="tableData" style="width: 100%">
        <el-table-column label="巴士编号" width="90">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.busId }}</span>
          </template>
        </el-table-column>
        <el-table-column label="车牌号" width="180">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.busNumbers }}</span>
          </template>
        </el-table-column>
        <el-table-column label="车辆颜色" width="90">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.busColor }}</span>
          </template>
        </el-table-column>
        <el-table-column label="车辆车位" width="120">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.seatNumber }}</span>
          </template>
        </el-table-column>
        <el-table-column label="车辆详情" width="240">
          <template slot-scope="scope">
            <span style="margin-left: 10px">{{ scope.row.busDetail }}</span>
          </template>
        </el-table-column>
        <el-table-column label="操作">
          <template slot-scope="scope">
            <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
            <el-button size="mini" type="danger" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
          </template>
        </el-table-column>
      </el-table>

      <!--修改弹窗-->
      <el-dialog title="修改车辆" :visible.sync="updateBusButton" width="30%" :close-on-click-modal=false>
        <div>
          <div class="text-align-left">
            <span>车牌号</span>
          </div>
          <el-input v-model="updateBusProject.busNumbers" placeholder="请输入车牌号" clearable></el-input>
        </div>
        <div class="margin-top-6">
          <div class="text-align-left">
            <span>车辆颜色</span>
          </div>
          <el-input v-model="updateBusProject.busColor" placeholder="请输入车辆颜色" clearable></el-input>
        </div>
        <div class="margin-top-6">
          <div class="text-align-left">
            <span>车位</span>
          </div>
          <el-input v-model="updateBusProject.seatNumber" placeholder="请输入车位" clearable></el-input>
        </div>
        <div class="margin-top-6">
          <div class="text-align-left">
            <span>车辆详情</span>
          </div>
          <el-input v-model="updateBusProject.busDetail" placeholder="请输入车辆详情" clearable></el-input>
        </div>
        <span slot="footer" class="dialog-footer">
          <el-button @click="addBus = false">取 消</el-button>
          <el-button type="primary" @click="updateBus(updateBusProject)">确 定</el-button>
        </span>
      </el-dialog>
    </div>
    <!-- /admin/selectBus/{positionBegin}/{len} -->
    <div class="bottom">
      <el-pagination
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"
        :current-page="currentPage4"
        :page-sizes="[pagesize]"
        :page-size="pagesize"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total"
      ></el-pagination>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      addBus: false,
      updateBusButton: false,
      deleteBus: false,
      bus: {
        busNumbers: "粤a55454",
        busColor: "红",
        seatNumber: "50",
        busDetail: "大巴车"
      },
      updateBusProject: {
        busId: "",
        busNumbers: "",
        busColor: "",
        seatNumber: "",
        busDetail: ""
      },
      time: "",
      currentPage4: 1,
      pagesize: 3,
      total: 0,
      baseurl: "http://localhost:8888/admin/selectBus/",
      counturl: "http://localhost:8888/admin/sumSelectBus",
      tableData: [
        {
          busId: 1,
          busNumbers: "粤A3030P",
          busDetail: "无印花",
          busColor: "白色",
          seatNumber: 40
        },
        {
          busId: 2,
          busNumbers: "粤A30450",
          busDetail: "无印花",
          busColor: "红色",
          seatNumber: 50
        },
        {
          busId: 3,
          busNumbers: "粤A98655",
          busDetail: "无印花",
          busColor: "白色",
          seatNumber: 45
        },
        {
          busId: 4,
          busNumbers: "粤A75311",
          busDetail: "无印花",
          busColor: "白色",
          seatNumber: 30
        }
      ]
    };
  },
  methods: {
    handleEdit(index, row) {
      this.updateBusProject = row;
      window.console.log(row);
      this.updateBusButton = true;
    },
    handleDelete(index, row) {
      window.console.log(index, row);
      this.axios
        .post("http://localhost:8888/admin/deleteBus", row)
        .then(response => {
          window.console.log(response);
        });
    },
    addBusButtom() {
      window.console.log("1");
      this.addBus = true;
    },
    updateBus(e) {
      window.console.log(e);
      this.axios
        .post("http://localhost:8888/admin/updateBus", e)
        .then(response => {
          window.console.log(response);
        });
      this.updateBusButton = false;
    },
    addBusProject(e) {
      window.console.log(e);
      this.axios
        .post("http://localhost:8888/admin/addBus", e)
        .then(response => {
          window.console.log(response);
        });
      this.addBus = false;
    },
    handleSizeChange(val) {
      window.console.log(`每页 ${val} 条`);
    },
    handleCurrentChange(val) {
      this.currentPage4 = val;
      this.ajaxLoadData(this.currentPage4, this.pagesize);
      window.console.log(`当前页: ${val}`);
    },
    ajaxLoadData(positionBegin, len) {
      let url = this.baseurl + positionBegin + "/" + len;
      this.axios.get(url).then(res => {
        this.tableData = [];
        console.info(res);
        this.tableData = res.data;
      });
      this.axios.get(this.counturl).then(res => {
        window.console.log(res);
        this.total = res.data;
      });
    }
  },
  beforeMount() {
    this.ajaxLoadData(0,this.pagesize)
    setInterval(() => {
      this.time = new Date().toLocaleString();
    }, 1000);
  }
};
</script>

<style scoped>
.header {
  display: flex;
  justify-content: space-between;
  padding: 0.5rem 2rem 1rem 5rem;
  /* border-bottom: 1px solid #f2f4f6; */
}
.table {
  margin: 0rem 2rem 0rem 2rem;
  text-align: left;
  border-radius: 0.5rem;
  background-color: #ffffff;
  box-shadow: 0px 3px 3px #c8c8c8;
  border-top: 1px solid #f2f4f6;
}
.text-align-left {
  text-align: left;
}
.margin-top-6 {
  margin-top: 6px;
}
.bottom {
  display: flex;
  justify-content: center;
  margin-top: 1rem;
  margin-left: 1rem;
}
</style>