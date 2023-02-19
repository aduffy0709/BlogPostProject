package com.techtalentsouth.techtalentblog.blogposts;

import org.springframework.data.repository.CrudRepository;

//How do we signal to the JPA that this is a repository?
//We do sign a lot of thing like something 
//is a controller by using annotation like @controller

//But in this case the thing that will signify that this 
//is a repository is what it inherits from. 

public interface BlogPostRepository extends CrudRepository<BlogPosts, Long>{

}
