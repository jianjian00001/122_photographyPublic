const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot808t0/",
            name: "springboot808t0",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot808t0/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "摄影跟拍预定管理系统"
        } 
    }
}
export default base
