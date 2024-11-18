<script setup>
  import Header from  './components/Header.vue'
  import Content from  './components/Content.vue'
  import Navigator from  './components/Navigator.vue'
  import {ref} from "vue"

let message = ref("")

// app.vue发送到content.vue
let menu = ref("")

function reveiver(data){
  message.value =data
}

</script>

<template>
  <div>

    {{message}}
    <hr>
    <Header class="header"></Header>
    <Content class="navigator":message = "message"></Content>
    <Navigator @sendMenu ="reveiver" class = "content"></Navigator>
  </div>
</template>

<style scoped>
  .header{
    height: 80px;
    border: 1px dolid read;
  }
  .navigator{
    height: 800px;
    border:1px solid green;
    float:left;
  }


  .content{
    width:83%;
    height: 800px;
    border: 1px solid blue;
    float:right;
  }
</style>
