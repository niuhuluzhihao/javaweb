<script setup>
   import  axios from "axios"

    function getLoveMessage(){
      let promise = axios({
        method:"get",
        url:"https://",
        data:{}
      })
    }

    prompt.then(
      function(response){
        console.log(response)
      }
    ).catch(
      function(){

      }
    )


</script>




<template>
  <div>
    <h1></h1>
    <button @click="getLoveMessage()"></button>
  </div>
</template>

<style scoped>

</style>
