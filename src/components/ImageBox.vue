<template>
  <div class="image-box">
    <img :src="imageSrc" alt="Imagen" />
    <h3>{{ title }}</h3>
    <p>{{ description }}</p>
  </div>
</template>

<script setup>
defineProps({
  title: String,
  description: String,
  imageSrc: String
})
</script>

<style scoped>
.image-box {
  text-align: center;
  border: 1px solid #ddd;
  padding: 15px;
  margin-top: 20px;
}
img {
  width: 150px;
  height: 150px;
  border-radius: 10px;
}
</style>

