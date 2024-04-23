<template>
    <ion-page>
      <ion-header>
        <ion-toolbar>
          <ion-title>Lista de Productos</ion-title>
        </ion-toolbar>
      </ion-header>
      <ion-content class="ion-padding">
        <ion-list>
          <ion-item v-for="producto in productos" :key="producto.id">
            <ion-label>
              <h2>{{ producto.nombre }}</h2>
              <p>Precio: {{ producto.precio }}</p>
              <p>Categoría: {{ obtenerNombreCategoria(producto.categoriaId) }}</p>
            </ion-label>
          </ion-item>
        </ion-list>
  
        <!-- Botón de Regresar sin acción asociada -->
        <ion-button @click="goBack">Regresar</ion-button>
      </ion-content>
    </ion-page>
  </template>
  
  <script>
  import { defineComponent } from 'vue';
  
  export default defineComponent({
    data() {
      return {
        productos: [
          { id: 1, nombre: 'Producto A', precio: 20.99, categoriaId: 1 },
          { id: 2, nombre: 'Producto B', precio: 15.49, categoriaId: 2 },
          // Agrega más productos aquí...
        ],
        categorias: [
          { id: 1, nombre: 'Categoría 1', descripcion: 'Descripción de la categoría 1' },
          { id: 2, nombre: 'Categoría 2', descripcion: 'Descripción de la categoría 2' },
          // Agrega más categorías aquí...
        ],
      };
    },
    methods: {
      obtenerNombreCategoria(categoriaId) {
        const categoria = this.categorias.find(c => c.id === categoriaId);
        return categoria ? categoria.nombre : 'Desconocida';
      },
      goBack() {
        // Este método puede estar vacío si no quieres que haga nada al hacer clic en el botón
      },
    },
  });
  </script>
  
  