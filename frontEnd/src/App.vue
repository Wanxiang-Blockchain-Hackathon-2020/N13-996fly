<template>
  <div id="app">
    <Header />
    <router-view />
  </div>
</template>

<script>
import Header from './common/header'

export default {
  components:{
    Header
  }
};
</script>

<style>
body {
  font-size: 16px;
  background-color: #f8f8f8;
  -webkit-font-smoothing: antialiased;
}
</style>
