const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm3957q/",
            name: "ssm3957q",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm3957q/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "公交信息在线查询系统小程序"
        } 
    }
}
export default base
