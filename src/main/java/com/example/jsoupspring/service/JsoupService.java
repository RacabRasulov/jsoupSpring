package com.example.jsoupspring.service;


import com.example.jsoupspring.dao.JsoupEntity;
import com.example.jsoupspring.repository.JsoupRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
@Slf4j
@AllArgsConstructor
public class JsoupService {

    public final JsoupRepository jsoupRepository;


    public String getTitle(String url) throws IOException {
        log.info("Save url started with Jsoup:{} ",url);
        Document doc = Jsoup.connect(url).get();

        JsoupEntity entity = new JsoupEntity();
        entity.setTitle(doc.title());

        jsoupRepository.save(entity);

        log.info("After Save url entity:{} ",entity);
        return doc.title();
    }


    public void delete(Long id) {

        log.info("Delete url started with id:{}", id);
        jsoupRepository.deleteById(id);
        log.info(" After Delete url  id:{}", id);
    }




}
