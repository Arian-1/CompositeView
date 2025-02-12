<template>
  <aside class="sidebar">
    <h2>Menú</h2>
    <ul>
      <li><a href="#" @click.prevent="navigateTo('/')">Dashboard</a></li>
      <li><a href="#" @click.prevent="navigateTo('/about')">Info</a></li>
    </ul>
  </aside>
</template>

<script setup>
const navigateTo = (path) => {
  window.location.href = path
}
</script>

<style scoped>
.sidebar {
  width: 200px;
  background-color: #2c3e50;
  color: white;
  padding: 20px;
  height: 100vh;
}
ul {
  list-style: none;
  padding: 0;
}
ul li a {
  color: white;
  text-decoration: none;
  display: block;
  padding: 10px 0;
}
</style>
