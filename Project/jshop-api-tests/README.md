Auto-generated mapped tests for J-Shop.
Detected endpoints (from your backend):
- POST  /admin/saveAdmin  (body: Admin)
- GET   /admin/loginAdmin/{email}/{password}
- GET   /admin/getAllProductOwner
- GET   /admin/getProductOwnerById/{productOwnerId}
- PUT   /admin/verifyProductOwner/{productOwnerId}
- PUT   /admin/verifyProductByAdmin/{productId}
- POST  /product/saveProduct  (body: Product)
- PUT   /product/updateProduct  (body: Product)
- DELETE /product/deleteProduct/{id}
- PUT   /order/productOrder/{productId}/{quantity}/{address}
- POST  /productOwner/saveProductOwner  (body: ProductOwner)
- GET   /productOwner/loginWithOwner/{email}/{password}
- PUT   /productOwner/updateProductOwner  (body: ProductOwner)
- POST  /userCart/userCartInsert/{productQuantity}/{productId}
- POST  /user/saveUserDetails  (body: User)
- GET   /user/loginUser/{email}/{password}
- PUT   /user/updateUser  (body: User)

Import this folder into Eclipse as an Existing Maven Project and run testng.xml.
Adjust payload fields and endpoints if tests return 400/500 - send logs, I will patch.
