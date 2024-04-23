import { createRouter, createWebHistory } from '@ionic/vue-router';
import HomePage from '../views/HomePage.vue';
import Productos from '../views/Productos.vue';
import Categorias from '../views/Categorias.vue';

const routes = [
  {
    path: '/',
    redirect: '/home'
  },
  {
    path: '/home',
    name: 'Home',
    component: HomePage
  },
  {
    path: '/productos',
    component: Productos
  },
  {
    path: '/categorias',
    component: Categorias
  }
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;
