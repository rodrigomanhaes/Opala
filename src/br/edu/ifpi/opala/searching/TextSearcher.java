package br.edu.ifpi.opala.searching;

import java.util.List;
import java.util.Map;

/**
 * Interface que dita os métodos necessários para realização de busca de
 * documentos de texto
 * 
 * @author Mônica
 * 
 */
public interface TextSearcher {

	/**
	 * Faz uma busca no índice nos campos informados, retornando um
	 * {@link SearchResult}. <code>batchStart</code> e <code>batchSize</code>
	 * informam a partir de que resultado e até quantos serão retornados,
	 * respectivamente. O <code>sortOn</code> indica que campo os resultados
	 * serão ordenados (em caso de nulo, os resultados serão ordenados por
	 * relevência). O <code>reverse</code> diz se os resultados estarão
	 * invertidos ou não.
	 * 
	 * @param fields
	 *            campos e valores a serem buscados
	 * @param returnedFields
	 *            campos que serão retornados
	 * @param batchStart
	 *            a partir de que documento será retornado
	 * @param batchSize
	 *            quantos documentos serão retornados
	 * @param sortOn
	 *            campo em que a busca será ordenada
	 * @param reverse
	 *            se os resultados virão na ordem inversa
	 * @return um objeto <code>SearchResult</code>
	 * 
	 * @see SearchResult
	 */
	public SearchResult search(	Map<String, String> fields,
								List<String> returnedFields,
								int batchStart,
								int batchSize,
								String sortOn,
								boolean reverse);
	
	/**
	 * Faz uma busca no índice nos campos informados, retornando um
	 * {@link SearchResult}. <code>batchStart</code> e <code>batchSize</code>
	 * informam a partir de que resultado e até quantos serão retornados,
	 * respectivamente. O <code>sortOn</code> indica que campo os resultados
	 * serão ordenados (em caso de nulo, os resultados serão ordenados por
	 * relevência). O <code>reverse</code> diz se os resultados estarão
	 * invertidos ou não.
	 * 
	 * @param fields
	 *            campos e valores a serem buscados
	 * @param returnedFields
	 *            campos que serão retornados
	 * @param batchStart
	 *            a partir de que documento será retornado
	 * @param batchSize
	 *            quantos documentos serão retornados
	 * @param sortOn
	 *            campo em que a busca será ordenada
	 *            
	 * @return um objeto <code>SearchResult</code>
	 * 
	 * @see SearchResult
	 */
	public SearchResult search(	Map<String, String> fields,
								List<String> returnedFields,
								int batchStart,
								int batchSize,
								String sortOn);

}