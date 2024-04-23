<template>
    <ion-page>
      <ion-header>
        <ion-toolbar>
          <ion-title>Administración de Categorías</ion-title>
        </ion-toolbar>
      </ion-header>
      <ion-content class="ion-padding">
        <ion-list>
          <ion-item v-for="categoria in categorias" :key="categoria.id">
            <ion-label>
              <h2>{{ categoria.nombre }}</h2>
              <p>{{ categoria.descripcion }}</p>
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
        categorias: [
          { id: 1, nombre: 'Categoría 1', descripcion: 'Descripción de la categoría 1' },
          { id: 2, nombre: 'Categoría 2', descripcion: 'Descripción de la categoría 2' },
          // Agrega más categorías aquí...
        ],
      };
    },
    methods: {
      goBack() {
        // Este método puede estar vacío si no quieres que haga nada al hacer clic en el botón
      },
    },
  });
  </script>
  