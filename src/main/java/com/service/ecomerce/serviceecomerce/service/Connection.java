package com.service.ecomerce.serviceecomerce.service;

import com.service.ecomerce.serviceecomerce.model.AllPost;
import com.service.ecomerce.serviceecomerce.model.Post;
import com.service.ecomerce.serviceecomerce.model.SinglePostInfo;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Connection {
    private RestTemplate restTemplate;
    public Connection() {
        RestTemplateBuilder restTemplateBuilder=new RestTemplateBuilder();
        this.restTemplate = restTemplateBuilder.basicAuthorization("b8f6da89-9c7b-45c8-bf04-c800ae3cf7bf-bluemix",
                "b93005b207e08293e0d41dd394c59f7bc4ea4737e49ddde92f83fa77d0352220").build();

    }

    public Post get(String id){
        return restTemplate.getForObject("https://b8f6da89-9c7b-45c8-bf04-c800ae3cf7bf-bluemix.cloudant.com/produit/"+id,Post.class);
    }

    public Post[] getAll(){
        AllPost allPost=  restTemplate.getForObject("https://b8f6da89-9c7b-45c8-bf04-c800ae3cf7bf-bluemix.cloudant.com/produit/_all_docs?include_docs=true",AllPost.class);
        Post[] tabPost=new  Post[allPost.getTotal_rows()];
        SinglePostInfo[] tabInfo=allPost.getRows();
        for(int i=0;i<tabPost.length;i++){
            tabPost[i]=(tabInfo[i].getDoc());
        }
        return tabPost;
    }

    public String post(Post post){
        return restTemplate.postForObject("https://b8f6da89-9c7b-45c8-bf04-c800ae3cf7bf-bluemix.cloudant.com/produit",post,String.class);

    }

}
