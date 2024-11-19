<script setup>
</script>

<template>
 <div>
   // 该标签会被替换出具体的.vue
   <router-link to="/add">add</router-link><br>
   <router-link to="/update">update</router-link><br>
   <router-link to="/list">list</router-link><br>
   <router-link to="/home">home</router-link><br>
   <router-view></router-view>
 </div>
</template>

<style scoped>

</style>
