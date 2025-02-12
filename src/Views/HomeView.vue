<template>
  <div class="container">
    <h1>Inicio</h1>
    <p>Bienvenido a la página principal.</p>
    <ImageBox
        title="Imagen de Inicio"
        description="Este es un gatito sorprendido"
        imageSrc="https://ichef.bbci.co.uk/ace/ws/800/cpsprodpb/10E9B/production/_109757296_gettyimages-1128004359.jpg.webp"
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
