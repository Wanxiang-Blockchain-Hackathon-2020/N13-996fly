<template>
  <div class="list">
          <h3>派遣凭证列表</h3>
      <div class="card">
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
                      pivot-text="公司已签名"
                      :percentage="33"
                    />
                </van-col>
            </van-row>
            <van-row class="row">
                <van-col span="24">
                    <van-button type="info" block @click="toConfirmCareer">待本人签名</van-button>
                </van-col>
            </van-row>
      </div>

      <h3>财务凭证列表</h3>
      <div class="card" style="margin-bottom: 2em;">
            <van-row class="row">
                <van-col span="12" >姓名</van-col>
                <van-col span="12" >张三</van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >派出企业信息</van-col>
                <van-col span="12" >BB 有限责任公司</van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >凭证日期</van-col>
                <van-col span="12" >2020年3月3日</van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >工商保险费</van-col>
                <van-col span="8" >3488</van-col>
                <van-col span="4" >元</van-col>
            </van-row>
            <van-row class="row">
                <van-col span="12" >校验状态(共3方)</van-col>
                <van-col span="12" >
                  <van-progress
                      class="progressCss"
                      stroke-width="5"
                      pivot-text="第三方已签名"
                      :percentage="100"
                    />
                </van-col>
            </van-row>
            <van-row class="row" style="margin-bottom:2em;">
                <van-col span="24">
                    <van-button type="info" disabled block @click="toConfirmFinance">已报销</van-button>
                </van-col>
                <van-col span="24" style="font-size: 0.5em; text-align: center; margin-top:1em;">
                    此凭证已使用，如有疑问可以查看区块网络哟
                </van-col>
            </van-row>
      </div>

    <van-action-sheet
        v-model="show"
        :actions="actions"
        description="是否确认派遣并签名授权？"
        cancel-text="取消"
        @select="onSelectCareer"
        />
  </div>
</template>

<script>
import { 
  Field,
  Button,
  Row,
  Col,
  ActionSheet,
  Toast,
  Progress
} from 'vant';
export default {
  components: {
      [Field.name]:Field,
      [Button.name]: Button,
      [Row.name]:Row,
      [Col.name]:Col,
      [ActionSheet.name]:ActionSheet,
      [Toast .name]:Toast ,
      [Progress.name]:Progress ,
  },

  data() {
    return {
      show: false,
      actions: [
        { name: '确认'},
      ]
    };
  },

  methods: {
    toConfirmCareer(){
      this.show=true;
        // this.$router.push({ name: 'warrant/towarrant', params: { userId: '123' }})
    },
    onSelectCareer(item){
      Toast(item.name);
      this.$router.push({ name: 'warrant/towarrant'})
    },
    toConfirmFinance(){
      this.$router.push({ name: 'warrant/towarrant'})
    },
  }
};
</script>

<style lang="less">
.list {
  width: 100%;
  height: 100%;
  display: flex;
  flex-flow: row wrap;
  justify-content: center;
  position: relative;

  .card {
    width: 100%;
    // height: 30em;
    margin: 0 2em;
    background-color: #2e343b;
    box-sizing: border-box;
    color: white;
    // border-radius: 10px  10px 0 0;
    border-radius: 10px;
    padding: 1em; 
    .row {
      margin: 1em 0;
    }
    .progressCss{
      margin-top: 5%;
    }
  }
}
</style>
