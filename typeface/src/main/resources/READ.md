Problem:
1. Comment-service:
   1. CRUD operations
   2. Update API idempotent
   

2. Function requirement:
   1. A user can comment multiple on a post
   2. A user can reply multiple to the comment
   3. A user delete his comment
   

3. Actor, actions
   1. Post
      1. postId
      2. description
   2. Comment
      1. commentId
      2. text
      3. createdBy
      4. createdAt
      5. updateAt
   3. commentMapping
   4. commentId, id
   5. Reply
      1. commentId
      2. replyId
      3. text
      4. createdBy
      5. createdAt
      6. updatedAt

4. Data schema
   1. comment-table:
      1. Id
      2. postId
      3. text
      4. createdBy
      5. createdAt
      6. updatedAt
   2. reply-table:
      1. Id
      2. commentId
      3. text
      4. createdBy
      5. createdAt
      6. updatedAt
      
5. 1 - NF, 2-NF
6. APIs
- CRUD
- Create: POST
  - local:8080/nirvana-service/public/v1/comment
- Create: GET
   - local:8080/nirvana-service/public/v1/comment
- Create: PUT 
  - local:8080/nirvana-service/public/v1/comment
- Create: PATCH
  - local:8080/nirvana-service/public/v1/comment

Tables -> RDMS


Document -> Mongo

K, V -> data



graph -> 



Trie -> data

