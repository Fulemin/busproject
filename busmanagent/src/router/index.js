import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Order from '../views/Order.vue'
import VehicleManagement from '../views/VehicleManagement.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/order',
    name: 'order',
    component: Order
  },
  {
    path: '/vehicleManagement',
    name: 'vehicleManagement',
    component: VehicleManagement
  },
  // {
  //   path: '/lineManagement',
  //   name: 'lineManagement',
  //   component: () => import('../views/LineManagement.vue')
  // },
]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router
