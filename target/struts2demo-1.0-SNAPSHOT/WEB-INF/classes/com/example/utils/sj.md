##'用户表'
user(
- id                  (int 11)
- name            (varchar 20)
- password      (varchar 16)
- type              (int 0,1,2)                                '0——admin，1——老师，2——学生'
- user_img       (int 11 foreign myFile)
- create_time
- update_time
- deleted
)

##'成员表'
member(
- id                                  (int 11)
- name                            (varchar 20)
- email                             (varchar 20 null)
- remark                          (varchar 1000 null)
- graduated                     (tinyint 1 null)
- type                              (int 0,1,2,3,4,5,6)                      '0——硕士，1——博士，2——博士后，3——兼职研究员，4——讲师，5——副教授，6——教授'
- research_direction        (varchar 255 null)                    '研究方向'
- achievement                (json{"id"} foreign essay null)   '研究成果，设置外键参考essay表'
- url                                 (varchar 255 null)                     '个人主页'
- member_img                (int 11 foreign myFile null)            '头像'
- create_time
- update_time
- deleted
)

##'新闻表'
news(
- id                       (int 11)
- title                    (varchar 255)
- writer                 (varchar 20)
- text                    (text)
- img                    (json{"id","position"} foreign myFile null)
- create_time
- update_time
- deleted     (0-表示未审核，1-表示审核未通过，2-表示审核通过)
)

##'项目表'
project(
- id                        (int 11)
- name                  (varchar 255)
- auth_num           (varchar 50)                       '批准号'
- start_time            (datetime)
- end_time             (datetime)
- principal              (int 11 foreign member)
- create_time
- update_time
- deleted
)

##'文件表'
myFile(
- id                      (int 11)
- url                     (varchar 255)
- type                  (tinyint 1)
- create_time
- update_time
- deleted
)

##'论文表'
essay(
- id                           (int 11)
- myFile                         (int 11 foreign myFile)
- title                        (varchar 255)
- writer                     (varchar 50)
- member                (json{"id"})
- time                       (datetime)
- type                       (char 4)
- publisher               (varchar 50)
- create_time
- update_time
- `~~_**``**``_~~`deleted
)

##'权限表'
perm()

##'角色表'
role()

role_perm()

user_role()
