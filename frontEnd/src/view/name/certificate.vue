<template>
  <div class="certificate">
    <div class="card">
      <!-- <h3>{{register.name}}的信息卡</h3> -->
      <van-row class="row">
          <van-col span="14" ><h3>{{register.name}}的信息卡</h3></van-col>
          <van-col span="10" style="color:#1989fa;" @click="to2">
            <b>>>>我的凭证</b>
            </van-col>
      </van-row>
      
      <van-divider />
      <van-row class="row">
          <van-col span="8" ><b>手机号</b></van-col>
          <van-col span="16" >{{register.tel}}</van-col>
      </van-row>
      <van-row class="row">
          <van-col span="8" ><b>身份证号</b></van-col>
          <van-col span="16" >5130271971123412345632</van-col>
      </van-row>
      <van-row class="row">
          <van-col span="8" ><b>所属公司</b></van-col>
          <van-col span="16" >Fly996 Co. Ltd.</van-col>
      </van-row>
      <van-row class="row">
          <van-col span="8" ><b>所在部门</b></van-col>
          <van-col span="16" >基础架构研发部</van-col>
      </van-row>
      <van-row class="row">
          <van-col span="8" ><b>直属领导</b></van-col>
          <van-col span="16" >李四</van-col>
      </van-row>
      <van-row class="row">
          <van-col span="8" ><b>WeID</b></van-col>
          <van-col span="16" autosize rows="2" style="
            word-wrap:break-word; 
            word-break:break-all; 
            overflow: hidden;">did:weid:1:0x0086eb1f712ebc6f1c276e12ec21</van-col>
      </van-row>
    </div>
  </div>
</template>

<script>
import { Field, Button, Col, Row, Divider } from "vant";

export default {
  components: {
    [Field.name]: Field,
    [Row.name]: Row,
    [Col.name]: Col,
    [Button.name]: Button,
    [Divider.name]: Divider
  },

  data() {
    return {
    };
  },

  computed:{
    register:function(){
      
      return this.$route.params.register
    }
  },
  methods: {
    to2() {
      this.$router.push({ name: "warrant/list", params: { userId: "123" } });
      // this.$router.push({path: '/resourceManagement'})
    }
  }
};
</script>

<style lang="less">
.certificate {
  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: row wrap;
  justify-content: center;
  align-items: center;
  position: relative;

  h3{
    margin: 0%;
  }

  .card {
    width: 100%;
    // height: 30em;
    margin: 0 1em;
    background-color: #2e343b;
    box-sizing: border-box;
    color: white;
    border-radius: 10px ;
    padding: 1em; 
    .txt-size {
      font-size: 1.2em;
    }
    .row {
      margin: 1em 0;
    }
  }

  .btn {
    width: 100%;
    height: 100%;
    display: flex;
    flex-flow: row wrap;
    justify-content: center;
    position: relative;
    margin-top:50%;

    .btn-tj {
      width: 80%;
    }
  }

}
</style>
