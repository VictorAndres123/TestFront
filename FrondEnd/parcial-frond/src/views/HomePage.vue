<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Inicio</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content class="ion-padding">
      <div class="content-container">
        <strong>¡Listo para crear una aplicación?</strong>
        <p>Comienza con los <a target="_blank" rel="noopener noreferrer" href="https://ionicframework.com/docs/components">Componentes UI de Ionic</a></p>

        <!-- Botones de navegación -->
        <div class="button-container">
          <ion-button expand="block" @click="goToProductos">Ver Productos</ion-button>
          <ion-button expand="block" @click="goToCategorias">Ver Categorías</ion-button>
        </div>
      </div>
    </ion-content>
  </ion-page>
</template>

<script setup>
import { useRouter } from 'vue-router';

const $router = useRouter();

// Método para navegar a la vista de Productos
const goToProductos = () => {
  $router.push('/productos');
};

// Método para navegar a la vista de Categorías
const goToCategorias = () => {
  $router.push('/categorias');
};
</script>

<style scoped>
.content-container {
  text-align: center;
  padding: 50px 20px;
}

.content-container strong {
  font-size: 24px;
  line-height: 30px;
  margin-bottom: 20px;
}

.content-container p {
  font-size: 16px;
  line-height: 22px;
  color: #8c8c8c;
}

.button-container {
  margin-top: 30px;
}

ion-button {
  --border-radius: 8px;
  --background: #3880ff;
  --color: #ffffff;
  font-weight: bold;
  margin-bottom: 10px;
}
</style>
