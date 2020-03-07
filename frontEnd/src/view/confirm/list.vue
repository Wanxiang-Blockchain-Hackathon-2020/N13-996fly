<template>
  <div class="list">
      <div class="card">
            <van-row class="row" >
                <van-col span="24" style="text-align:center; font-size:1.2em;">请求授权</van-col>
            </van-row>
            <van-divider></van-divider>
            <van-row class="row" >
                <van-col span="12" >授权企业</van-col>
                <van-col span="12" >AA 有限责任公司</van-col>
            </van-row>

            <van-row class="row">
                <van-col span="12" >姓名</van-col>
                <van-col span="12" >张三</van-col>
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
                <van-col span="12" >校验状态</van-col>
                <van-col span="12" >
                  <van-progress
                      class="progressCss"
                      stroke-width="5"
                      :pivot-text='pivotText'
                      :percentage='percentage'
                    />
                </van-col>
            </van-row>
            <van-row class="row">
                <van-col span="24">
                    <van-button type="info" block @click="toConfirm">授权派出企业</van-button>
                </van-col>
            </van-row>
      </div>

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
  Progress,
  Dialog,
  Divider
} from 'vant';
export default {
  components: {
      [Field.name]:Field,
      [Button.name]: Button,
      [Row.name]:Row,
      [Col.name]:Col,
      [ActionSheet.name]:ActionSheet,
      [Toast.name]:Toast ,
      [Progress.name]:Progress ,
      [Dialog.name]:Dialog ,
      [Divider.name]:Divider ,
  },

  data() {
    return {
      show: false,
      actions: [
        { name: '确认'},
      ],
      pivotText:'本人已签名',
      percentage:66
    };
  },
  mounted:function(){
          // 自定义加载图标
      Toast.loading({
        message: '第三方签名中...',
        forbidClick: true,
        loadingType: 'spinner',
        overlay: true,
        onClose:this.toChangeProgress
      });
  },
  methods: {
    toConfirm(){
      var _this = this
        Dialog.alert({
          title: '授权状态',
          message: '授权成功！'
        }).then(() => {
          // on close
          _this.$router.push({ name: 'confirm/end', params: { userId: '123' }})
        });
    },
    toChangeProgress(){
      this.pivotText = "第三方已签名",
      this.percentage = 100
    }
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
