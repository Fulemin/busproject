import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)
const store = new Vuex.Store({
    state: {
      count: 0,
      baseurl:'http://192.168.1.106:8888'
    },
    mutations: {
      increment (state) {
        state.count++
      }
    }
  })

  export default store