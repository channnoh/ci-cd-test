package com.unity.cicd.es;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class GoodsSearchService {

  private final ElasticsearchOperations elasticsearchOperations;
  private final GoodsSearchRepository goodsSearchRepository;

  private static final double SEARCH_DISTANCE = 2.0;



}
