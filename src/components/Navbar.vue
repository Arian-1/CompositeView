<template>
  <nav class="navbar">
    <div class="brand">Hola maestro</div>
    <ul>
      <li><a href="#" @click.prevent="navigateTo('/')">Inicio</a></li>
      <li><a href="#" @click.prevent="navigateTo('/about')">Acerca de</a></li>
    </ul>
  </nav>
</template>

<script setup>
const navigateTo = (path) => {
  window.location.href = path
}
</script>

<style scoped>
.navbar {
  background-color: #3498db;
  padding: 15px;
  color: white;
  display: flex;
  justify-content: space-between;
}
ul {
  list-style: none;
  display: flex;
  gap: 15px;
}
ul li a {
  color: white;
  text-decoration: none;
}
</style>
