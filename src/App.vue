<template>
  <div class="app">
    <Sidebar />
    <div class="main">
      <Navbar />
      <div class="content">
        <router-view />
      </div>
    </div>
  </div>
</template>

<script setup>
import Navbar from './components/Navbar.vue'
import Sidebar from './components/Sidebar.vue'
</script>

<style>
.app {
  display: flex;
  height: 100vh;
}
.main {
  flex: 1;
  display: flex;
  flex-direction: column;
}
.content {
  flex: 1;
  padding: 20px;
}
</style>


