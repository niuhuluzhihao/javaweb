<script setup>
  import {useRoute} from "vue-router"
  import {ref,onUpdated} from "vue"

  let languageId = ref(0)
  let languageName = ref("")
  let route = useRoute()

  languageId.value = route.params.id
  languageName.value = route.params.language

  onUpdated(()=>{
      languageId.value = route.params.id
      languageName.value = route.params.language
  })

</script>

<template>
  <div>
     <h1>showDetai接受路径参数</h1>
     <h3>{{languageId}}{{languageName}}是世界上最好的语言</h3>
 </div>
</template>

<style scoped>

</style>
