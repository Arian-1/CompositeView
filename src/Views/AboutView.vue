<template>
  <div class="container">
    <h1>Acerca de</h1>
    <p>Esta es la página sobre nosotros.</p>
    <ImageBox
        title="Imagen de Información"
        description="Este es un gatito bebé."
        imageSrc="https://www.miau.com.mx/wp-content/uploads/2014/09/gatito.jpg"
    />
  </div>
</template>

<script setup>
import ImageBox from '../components/ImageBox.vue'
</script>

<style scoped>
.container {
  padding: 20px;
}
</style>

