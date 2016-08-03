package com.jyt.retrofitdemo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by OFFICE on 2016/8/2.
 */
public class Teacher implements Serializable {

    /**
     * JPJS : [{"summary":"山西财经大学是一所以经济学、管理学、法学为主干学科。为国家教育部 \u201c中西部高校基础能力建设工程\u201d 高校， 山西老八所高校之一。始建于1951年， 是新中国成立后建校最早的财经院校之一。","logo":"http://file.daydayacc.com/f1/201605271126549485.jpg","stucount":"30","status":"1","referid":"82e776de-cce1-47be-85be-fb63f2b0d7b1","parentid":"ddacc_app_cj_allteachers_top","nodeid":"3e5ecd4a-6ec9-403d-919d-4df5f1716b9f","title":"杨石磊","addtime":"2016-05-27 11:30:26","price":"30","level":"高级讲师","school":"山西财经大学","nodetype":"13"},{"summary":"中国人民大学商学院会计学专业自1950年建立以来，取得了国内领先的成果，保持并巩固了在国内大学会计教育界的一流水平和名牌地位。创立了具有中国特色的会计管理理论流派，取得了一批重要的科研成果，对中国会计理论与实务的贡献得到国内同行的工人","logo":"http://file.daydayacc.com/f1/201605271140203029.jpg","stucount":"23","status":"1","referid":"77782b83-04a4-458f-bfd8-3e74be11cb16","parentid":"ddacc_app_cj_allteachers_top","nodeid":"0acc44d7-482d-4119-ab86-53cdb794494e","addtime":"2016-05-27 11:45:45","title":"杨菠","school":"中国人民大学","price":"30","level":"中国注册会计师、注册会计师","nodetype":"13"},{"summary":"中国政法大学是一所以法学为特色和优势、兼有文学、历史学、哲学、经济学、管理学、教育学、理学等多学科的\u201c211工程\u201d重点建设大学，\u201c985工程\u201d优势学科创新平台和\u201c2011计划\u201d项目重点建设高校，直属于国家教育部。","vcr":"http://file1.daydayacc.com/group1/M00/00/04/rBAeFVeCHJKAc5c0DaB9iKGvqLg626.mp4","logo":"","teachstyle":"123456","stucount":"1000","status":"1","referid":"c3f715b2-0e8d-4c98-ab44-3b2f640e1acc","parentid":"ddacc_app_cj_allteachers_top","nodeid":"c4ab47e6-b560-456e-8abe-297b3c3a6282","title":"蔡影","addtime":"2016-05-27 11:52:02","level":"","school":"中国政法大学","price":"30","nodetype":"13"},{"summary":"中国人民大学法律系成立于1950年，是新中国诞生后创立的第一所正规的高等法律法学教育机构，被誉为中国法学教育的\u201c工作母机\u201d和\u201c法学家的摇篮\u201d，成为引领法学教育的重镇、凝聚国内优秀法律人才的平台和沟通中外法学交流的窗口。","logo":"http://file.daydayacc.com/f1/201605271134076834.jpg","stucount":"12","status":"1","referid":"de2afd3e-1250-4a89-bc06-d16de83ce51b","parentid":"ddacc_app_cj_allteachers_top","nodeid":"866cb346-b01b-41f5-a1ee-d8027a0e2621","addtime":"2016-05-27 11:39:48","title":"丁奎山","school":"中国人民大学","level":"中国注册会计师、中国注册税务师","price":"30","nodetype":"13"}]
     * DSTD : [{"summary":"法律系成立于1950年， 是新中国诞生后创立的第一所正规的高等法学教育机构，被誉为中国法学教育的\u201c工作母机\u201d和\u201c法学家的摇篮\u201d， 成为引领法学教育的重镇、凝聚国内优秀法律人才的平台和沟通中外法学交流的窗口。","logo":"http://file.daydayacc.com/f1/201605191844375086.jpg","stucount":"30","status":"1","referid":"f435e604-b2d2-4b66-8d87-c6f9d0730e13","parentid":"ddacc_app_cj_allteachers_wide","nodeid":"f6408d43-f6e7-432b-9645-58b49febd007","addtime":"2016-05-19 18:46:41","title":"高老师","school":"中国人民大学","price":"30","level":"中国注册会计师","nodetype":"13"},{"summary":"中国人民大学商学院会计学专业自1950年建立以来，取得了国内领先的成果，保持并巩固了在国内大学会计教育界的一流水平和名牌地位。创立了具有中国特色的会计管理理论流派，取得了一批重要的科研成果，对中国会计理论与实务的贡献得到国内同行的工人","logo":"http://file.daydayacc.com/f1/201605271140203029.jpg","stucount":"23","status":"1","referid":"77782b83-04a4-458f-bfd8-3e74be11cb16","parentid":"ddacc_app_cj_allteachers_wide","nodeid":"1dfde856-1eaa-4e13-865b-a3e03c40418f","addtime":"2016-05-27 11:45:45","title":"杨菠","school":"中国人民大学","price":"30","level":"中国注册会计师、注册会计师","nodetype":"13"},{"summary":"中国人民大学法律系成立于1950年，是新中国诞生后创立的第一所正规的高等法律法学教育机构，被誉为中国法学教育的\u201c工作母机\u201d和\u201c法学家的摇篮\u201d，成为引领法学教育的重镇、凝聚国内优秀法律人才的平台和沟通中外法学交流的窗口。","logo":"http://file.daydayacc.com/f1/201605271134076834.jpg","stucount":"12","status":"1","referid":"de2afd3e-1250-4a89-bc06-d16de83ce51b","parentid":"ddacc_app_cj_allteachers_wide","nodeid":"a80eb92d-94ec-4cfd-bc5b-9c889e8cd4fd","addtime":"2016-05-27 11:39:48","title":"丁奎山","school":"中国人民大学","level":"中国注册会计师、中国注册税务师","price":"30","nodetype":"13"},{"vcr":"","summary":"长期从事财务、会计、税务问题的教学和研究，承担的课程主要包括《财务报告分析》《中级财务管理》《财务管理学》《管理会计》等。在过去几年，一次获得课堂教学评估二等奖，多次获得本校青年教师讲课比赛二等奖，两次获得MBA案例教学优秀奖。","teachstyle":"","logo":"http://file1.daydayacc.com/group1/M00/00/05/rBAeFVeH62mAVh-dAACJ5RXSots056.jpg","stucount":"12","status":"1","referid":"e9d609ab-50be-4eab-857a-8771151c14f1","parentid":"ddacc_app_cj_allteachers_wide","nodeid":"c327ca5e-7122-40c0-8f1a-0545c5f6a66e","title":"张艺","addtime":"2016-07-06 17:36:15","school":"中国人民大学","price":"30","level":"高级讲师","nodetype":"13"},{"summary":"专业","vcr":"http://file1.daydayacc.com/group1/M00/00/05/rBAeFVeJl82AAytzAAF_-kofqJQ943.jpg","logo":"http://file1.daydayacc.com/group1/M00/00/05/rBAeFVeJl6aAIR6SAACyZQNLL8A913.jpg","teachstyle":"222","stucount":"10000","status":"1","referid":"3f574210-c4f5-42e2-b1ea-b8947e136cf0","parentid":"ddacc_app_cj_allteachers_wide","nodeid":"b0efbae9-c949-42e4-8be1-29dbb2ec0df8","addtime":"2016-07-07 16:09:52","title":"尹文巧","level":"会计","school":"1","price":"1","nodetype":"13"}]
     * MXGW : [{"summary":"","logo":"http://file.daydayacc.com/f1/201605271347503978.png","addtime":"2016-05-27 13:48:03","title":"刘诗诗","school":"","level":"","nodetype":"13","status":"1","referid":"ff1fb4f2-936f-4af1-9bc5-73646f684770","parentid":"ddacc_app_cj_allteachers_star","nodeid":"48bb471f-4b95-4d38-9175-e1d5604a17fd"},{"summary":"","logo":"http://file.daydayacc.com/f1/201605271348151548.jpg","title":"钟汉良","addtime":"2016-05-27 13:48:26","level":"","school":"","nodetype":"13","status":"1","referid":"f0cd0d05-6672-4cbf-b0dc-a2c34a8c6d2a","parentid":"ddacc_app_cj_allteachers_star","nodeid":"39486f45-2a38-41b2-95e1-eedcc4ed7fa6"},{"title":"王力宏","nodetype":"13","status":"1","referid":"8b9a6eda-a335-4134-8d8a-90cd4a30e46c","parentid":"ddacc_app_cj_allteachers_star","nodeid":"26a5e23c-cd7d-4a7a-84ba-1980e343631e"},{"summary":"","logo":"http://file.daydayacc.com/f1/201605271347059280.jpg","addtime":"2016-05-27 13:47:21","title":"杜鹃","school":"","level":"","nodetype":"13","status":"1","referid":"3346dbda-e8c3-4f86-88ba-2f0d990327ed","parentid":"ddacc_app_cj_allteachers_star","nodeid":"04b7b3a4-0c31-4b14-aa73-f24107c2ad79"}]
     * status : 0
     */

    private String status;
    /**
     * summary : 山西财经大学是一所以经济学、管理学、法学为主干学科。为国家教育部 “中西部高校基础能力建设工程” 高校， 山西老八所高校之一。始建于1951年， 是新中国成立后建校最早的财经院校之一。
     * logo : http://file.daydayacc.com/f1/201605271126549485.jpg
     * stucount : 30
     * status : 1
     * referid : 82e776de-cce1-47be-85be-fb63f2b0d7b1
     * parentid : ddacc_app_cj_allteachers_top
     * nodeid : 3e5ecd4a-6ec9-403d-919d-4df5f1716b9f
     * title : 杨石磊
     * addtime : 2016-05-27 11:30:26
     * price : 30
     * level : 高级讲师
     * school : 山西财经大学
     * nodetype : 13
     */

    private List<JPJSBean> JPJS;
    /**
     * summary : 法律系成立于1950年， 是新中国诞生后创立的第一所正规的高等法学教育机构，被誉为中国法学教育的“工作母机”和“法学家的摇篮”， 成为引领法学教育的重镇、凝聚国内优秀法律人才的平台和沟通中外法学交流的窗口。
     * logo : http://file.daydayacc.com/f1/201605191844375086.jpg
     * stucount : 30
     * status : 1
     * referid : f435e604-b2d2-4b66-8d87-c6f9d0730e13
     * parentid : ddacc_app_cj_allteachers_wide
     * nodeid : f6408d43-f6e7-432b-9645-58b49febd007
     * addtime : 2016-05-19 18:46:41
     * title : 高老师
     * school : 中国人民大学
     * price : 30
     * level : 中国注册会计师
     * nodetype : 13
     */

    private List<DSTDBean> DSTD;
    /**
     * summary :
     * logo : http://file.daydayacc.com/f1/201605271347503978.png
     * addtime : 2016-05-27 13:48:03
     * title : 刘诗诗
     * school :
     * level :
     * nodetype : 13
     * status : 1
     * referid : ff1fb4f2-936f-4af1-9bc5-73646f684770
     * parentid : ddacc_app_cj_allteachers_star
     * nodeid : 48bb471f-4b95-4d38-9175-e1d5604a17fd
     */

    private List<MXGWBean> MXGW;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<JPJSBean> getJPJS() {
        return JPJS;
    }

    public void setJPJS(List<JPJSBean> JPJS) {
        this.JPJS = JPJS;
    }

    public List<DSTDBean> getDSTD() {
        return DSTD;
    }

    public void setDSTD(List<DSTDBean> DSTD) {
        this.DSTD = DSTD;
    }

    public List<MXGWBean> getMXGW() {
        return MXGW;
    }

    public void setMXGW(List<MXGWBean> MXGW) {
        this.MXGW = MXGW;
    }

    public static class JPJSBean implements Serializable{
        private String summary;
        private String logo;
        private String stucount;
        private String status;
        private String referid;
        private String parentid;
        private String nodeid;
        private String title;
        private String addtime;
        private String price;
        private String level;
        private String school;
        private String nodetype;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getStucount() {
            return stucount;
        }

        public void setStucount(String stucount) {
            this.stucount = stucount;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getReferid() {
            return referid;
        }

        public void setReferid(String referid) {
            this.referid = referid;
        }

        public String getParentid() {
            return parentid;
        }

        public void setParentid(String parentid) {
            this.parentid = parentid;
        }

        public String getNodeid() {
            return nodeid;
        }

        public void setNodeid(String nodeid) {
            this.nodeid = nodeid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getNodetype() {
            return nodetype;
        }

        public void setNodetype(String nodetype) {
            this.nodetype = nodetype;
        }
    }

    public static class DSTDBean implements Serializable{
        private String summary;
        private String logo;
        private String stucount;
        private String status;
        private String referid;
        private String parentid;
        private String nodeid;
        private String addtime;
        private String title;
        private String school;
        private String price;
        private String level;
        private String nodetype;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getStucount() {
            return stucount;
        }

        public void setStucount(String stucount) {
            this.stucount = stucount;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getReferid() {
            return referid;
        }

        public void setReferid(String referid) {
            this.referid = referid;
        }

        public String getParentid() {
            return parentid;
        }

        public void setParentid(String parentid) {
            this.parentid = parentid;
        }

        public String getNodeid() {
            return nodeid;
        }

        public void setNodeid(String nodeid) {
            this.nodeid = nodeid;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getNodetype() {
            return nodetype;
        }

        public void setNodetype(String nodetype) {
            this.nodetype = nodetype;
        }
    }

    public static class MXGWBean implements Serializable{
        private String summary;
        private String logo;
        private String addtime;
        private String title;
        private String school;
        private String level;
        private String nodetype;
        private String status;
        private String referid;
        private String parentid;
        private String nodeid;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getNodetype() {
            return nodetype;
        }

        public void setNodetype(String nodetype) {
            this.nodetype = nodetype;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getReferid() {
            return referid;
        }

        public void setReferid(String referid) {
            this.referid = referid;
        }

        public String getParentid() {
            return parentid;
        }

        public void setParentid(String parentid) {
            this.parentid = parentid;
        }

        public String getNodeid() {
            return nodeid;
        }

        public void setNodeid(String nodeid) {
            this.nodeid = nodeid;
        }
    }
}
