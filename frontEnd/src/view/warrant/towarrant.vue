<template>
  <div class="towarrant">
    <div class="card">
          <van-row class="row" >
                <van-col span="24" style="text-align:center; font-size:1.2em;">派遣凭证</van-col>
            </van-row>
            <van-divider></van-divider>
          <van-row class="row">
              <van-col span="12" >姓名</van-col>
              <van-col span="12" >张三</van-col>
          </van-row>
            <van-row class="row">
                <van-col span="12" >派出企业信息</van-col>
                <van-col span="12" >AA 有限责任公司</van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >派出时间</van-col>
                <van-col span="12" >2020年3月3日</van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >截止时间</van-col>
                <van-col span="12" >2020年6月6日</van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >项目合同编号</van-col>
                <van-col span="12" >20200303115</van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >合同详情</van-col>
                <van-col span="12" >
                    <a href="#" style="color:blue;">《关于派出**员工到**企业的协议》</a>
                    </van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >校验状态(共3方)</van-col>
                <van-col span="12" >
                  <van-progress
                      class="progressCss"
                      stroke-width="5"
                      :pivot-text="pivotText"
                      :percentage="percentage"
                    />
                </van-col>
            </van-row>
    </div>

    <div class="btn">
      <van-button round class="btn-tj" type="info" block @click="to3">去使用派出凭证</van-button>
    </div>
  </div>
</template>

<script>
import { Field, Button, Col, Row, Divider, Progress,Toast } from "vant";

export default {
  components: {
    [Field.name]: Field,
    [Row.name]: Row,
    [Col.name]: Col,
    [Button.name]: Button,
    [Divider.name]: Divider,
    [Progress.name]: Progress,
    [Toast.name]: Toast,
  },

  data() {
    return {
      pivotText:'本人已签名',
      percentage:33
    };
  },

  mounted:function(){
    Toast.loading({
        message: '验证本人签名',
        forbidClick: true,
        loadingType: 'spinner',
        overlay: true,
        onClose:this.toChangeProgress
      });
  },
  methods: {
    to3() {
      this.$router.push({ name: "confirm/list", params: { userId: "123" } });
      // this.$router.push({path: '/resourceManagement'})
    },
    toChangeProgress(){
      this.pivotText = "本人已签名",
      this.percentage = 66
    }
  }
};
</script>

<style lang="less">
.towarrant {
  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: row wrap;
  justify-content: center;
  align-items: center;
  position: relative;

  .card {
    width: 100%;
    // height: 30em;
    margin: 0 2em;
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
    .progressCss{
      margin-top: 5%;
    }
  }

  .btn {
    width: 100%;
    height: 100%;
    display: flex;
    flex-flow: row wrap;
    justify-content: center;
    position: relative;
    margin-top:30%;

    .btn-tj {
      width: 80%;
    }
  }

}
</style>
