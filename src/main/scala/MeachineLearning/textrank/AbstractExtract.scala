package MeachineLearning.textrank

import org.graphstream.graph.implementations.SingleGraph

import scala.collection.mutable.ListBuffer

/**
  * Created by li on 16/6/23.
  */
class AbstractExtract (val graphName: String, val segWord: ListBuffer[ListBuffer[(String)]] ){

  var graph = new SingleGraph(graphName)

  // 获取文本网络的句子节点
  segWord.foreach {
    sentenceList => {
      val sentence = sentenceList.toString
      if (graph.getNode(sentence) == null) graph.addNode(sentence)
    }
  }

  // 边的获取,通过计算句子的相似度



}
