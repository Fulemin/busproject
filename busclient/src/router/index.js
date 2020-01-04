import Vue from 'vue'
import VueRouter from 'vue-router'
// import Home from '../views/Home.vue'
import Mine from '../views/Mine.vue'
import Ticket from '../views/Ticket.vue'
import BuyTicket from '../views/BuyTicket.vue'
import Passenger from '../views/routervue/Passenger.vue'
import Address from '../views/routervue/Address.vue'
import Addpassenger from '../views/routervue/Addpassenger.vue'
import BuyTicketDetail from '../views/BuyTicketDetails.vue'
import Payment from '../views/routervue/Payment.vue'
import Editpassenger from '../views/routervue/Editpassenger.vue'
import APassenger from '../views/routervue/APassenger.vue'

Vue.use(VueRouter)

const routes = [
  // {
  //   path: '/',
  //   name: 'home',
  //   component: Home
  // },
  // {
  //   path: '/about',
  //   name: 'about',
  //   // route level code-splitting
  //   // this generates a separate chunk (about.[hash].js) for this route
  //   // which is lazy-loaded when the route is visited.
  //   component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  // },




  
  /**
   * /buyticket就是/home
   */
  {
    path: '/buyticket',
    name: 'buyticket',
    component: BuyTicket
  },
  {
    path: '/',
    name: 'buyticket',
    component: BuyTicket
  },
  {
    path: '/mine',
    name: 'mine',
    component: Mine
  },
  {
    path: '/ticket',
    name: 'ticket',
    component: Ticket
  },
  
  {
    path: '/passenger',
    name: 'passenger',
    component: Passenger
  },
  {
    path: '/address',
    name: 'address',
    component: Address
  },
  {
    path: '/addpassenger',
    name: 'addpassenger',
    component: Addpassenger
  },
  {
    path: '/buyticketdetails',
    name: 'buyticketdetails',
    component: BuyTicketDetail
  },
  {
    path: '/payment',
    name: 'payment',
    component: Payment
  },
  {
    path: '/editpassenger',
    name: 'editpassenger',
    component: Editpassenger
  },
  {
    path: '/apassenger',
    name: 'apassenger',
    component: APassenger
  }
]

const router = new VueRouter({
  mode: 'history',
  routes
})

export default router
