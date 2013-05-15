Solr Tokenizer

This is custom tokenizer for Solr.


How to use?

Step 1: Make is available

 Checking out and building the project will create product-tokenizer-1.0-SNAPSHOT.jar. Please add this jar to your Solr home /lib directory (same level as /conf).


Step 2:

  <fieldType name="product" class="solr.TextField" positionIncrementGap="100">
   <analyzer type="index">
      <tokenizer class="org.apache.lucene.analysis.core.ProductTokenizerFactory"/>
      <filter class="solr.EdgeNGramFilterFactory" minGramSize="2" maxGramSize="15" side="front"/>
   </analyzer>
   <analyzer type="query">
      <tokenizer class="org.apache.lucene.analysis.core.ProductTokenizerFactory"/>
   </analyzer>
   </fieldType>
