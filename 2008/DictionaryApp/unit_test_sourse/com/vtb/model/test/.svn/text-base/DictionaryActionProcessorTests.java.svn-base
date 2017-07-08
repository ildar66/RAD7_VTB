/*
 * Created on 30.07.2007
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.vtb.model.test;

import junit.framework.TestCase;

import com.vtb.domain.AuthorizedBody;
import com.vtb.domain.BaseRate;
import com.vtb.domain.CommissionType;
import com.vtb.domain.ContractorType;
import com.vtb.domain.DocumentGroup;
import com.vtb.domain.DocumentsType;
import com.vtb.domain.Industry;
import com.vtb.domain.LimitType;
import com.vtb.domain.OpportunityType;
import com.vtb.domain.PatternPaidPercentType;
import com.vtb.domain.PunitiveMeasure;
import com.vtb.domain.RatingType;
import com.vtb.domain.Region;
import com.vtb.domain.TargetType;
import com.vtb.exception.MappingException;
import com.vtb.model.ActionProcessorFactory;
import com.vtb.model.DictionaryActionProcessor;
import com.vtb.util.ApplProperties;

/**
 * @author IShaffigulin
 * 
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class DictionaryActionProcessorTests extends TestCase {
	/**
	 * Constructor for NriActionProcessorTests.
	 * 
	 * @param arg0
	 */
	public DictionaryActionProcessorTests(String arg0) {
		super(arg0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		if (ApplProperties.getCurrentMapperName().equals("EJB")) {
			// deleteAllRows();
		}
		if (ApplProperties.getCurrentMapperName().equals("MEMORY")) {
			deleteAllCache();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		if (ApplProperties.getCurrentMapperName().equals("EJB")) {
			// deleteAllRows();
		}
		if (ApplProperties.getCurrentMapperName().equals("MEMORY")) {
			deleteAllCache();
		}
	}

	/**
	 * Method deleteAllCache.
	 */
	private void deleteAllCache() {
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
		processor.clearInMemoryCaches();
	}

	/**
	 * test for "Комиссии".
	 * 
	 */
	public void testAddFindDeleteCommissionType() {

		// test adding, finding and removing a CommissionType from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");

		try {
			Integer key = new Integer("-1");
			String name = new String("CommissionName");

			CommissionType purple = new CommissionType(key);
			purple.setName(name);

			processor.addCommissionType(purple);

			CommissionType clone = processor.findCommissionTypeByKey(key);
			assertEquals("Name don't Match for CommissionType", purple.getName(), clone.getName());

			processor.removeCommissionType(key);

			try {
				processor.findCommissionTypeByKey(key);
				fail("Should have raised NoSuchCommissionTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}

		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "рейтинги"
	 * 
	 */
	public void testAddFindDeleteRatingType() {

		// test adding, finding and removing a RatingType from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");

		try {
			Integer key = new Integer("-1");
			String name = new String("RatingTypeName");

			RatingType purple = new RatingType(key);
			purple.setName(name);

			processor.addRatingType(purple);

			RatingType clone = processor.findRatingTypeByKey(key);
			assertEquals("Name don't Match for RatingType", purple.getName(), clone.getName());

			processor.removeRatingType(key);

			try {
				processor.findRatingTypeByKey(key);
				fail("Should have raised NoSuchRatingTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}

		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "типов контрагентов "
	 * 
	 */
	public void testAddFindDeleteContractorType() {
	
		// test adding, finding and removing a ContractorType from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("сontractorTypeName");
	
			ContractorType purple = new ContractorType(key);
			purple.setName(name);
	
			processor.addContractorType(purple);
	
			ContractorType clone = processor.findContractorTypeByKey(key);
			assertEquals("Name don't Match for ContractorType", purple.getName(), clone.getName());
	
			processor.removeContractorType(key);
	
			try {
				processor.findContractorTypeByKey(key);
				fail("Should have raised NoSuchContractorTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "группы документов"
	 * 
	 */
	public void testAddFindDeleteDocumentGroup() {
	
		// test adding, finding and removing a DocumentGroup from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("DocumentGroupName");
	
			DocumentGroup purple = new DocumentGroup(key);
			purple.setName_document_group(name);
	
			processor.addDocumentGroup(purple);
	
			DocumentGroup clone = processor.findDocumentGroupByKey(key);
			assertEquals("Name don't Match for DocumentGroup", purple.getName_document_group(), clone.getName_document_group());
	
			processor.removeDocumentGroup(key);
	
			try {
				processor.findDocumentGroupByKey(key);
				fail("Should have raised NoSuchDocumentGroupException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "типов документов"
	 * 
	 */
	public void testAddFindDeleteDocumentsType() {
	
		// test adding, finding and removing a DocumentsType from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("DocumentsTypeName");
	
			DocumentsType purple = new DocumentsType(key);
			purple.setName(name);
	
			processor.addDocumentsType(purple);
	
			DocumentsType clone = processor.findDocumentsTypeByKey(key);
			assertEquals("Name don't Match for DocumentsType", purple.getName(), clone.getName());
	
			processor.removeDocumentsType(key);
	
			try {
				processor.findDocumentsTypeByKey(key);
				fail("Should have raised NoSuchDocumentsTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "лимиты"
	 * 
	 */
	public void testAddFindDeleteLimitType() {
	
		// test adding, finding and removing a RatingType from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("LimitTypeName");
	
			LimitType purple = new LimitType(key);
			purple.setName(name);
	
			processor.addLimitType(purple);
	
			LimitType clone = processor.findLimitTypeByKey(key);
			assertEquals("Name don't Match for LimitType", purple.getName(), clone.getName());
	
			processor.removeLimitType(key);
	
			try {
				processor.findLimitTypeByKey(key);
				fail("Should have raised NoSuchLimitTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "целей кредитования "
	 * 
	 */
	public void testAddFindDeleteTargetType() {
	
		// test adding, finding and removing a TargetType from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("TargetTypeName");
	
			TargetType purple = new TargetType(key);
			purple.setName(name);
	
			processor.addTargetType(purple);
	
			TargetType clone = processor.findTargetTypeByKey(key);
			assertEquals("Name don't Match for TargetType", purple.getName(), clone.getName());
	
			processor.removeTargetType(key);
	
			try {
				processor.findTargetTypeByKey(key);
				fail("Should have raised NoSuchTargetTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "вида сделок"
	 * 
	 */
	public void testAddFindDeleteOpportunityType() {
	
		// test adding, finding and removing a OpportunityType from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("OpportunityTypeName");
	
			OpportunityType purple = new OpportunityType(key);
			purple.setName(name);
	
			processor.addOpportunityType(purple);
	
			OpportunityType clone = processor.findOpportunityTypeByKey(key);
			assertEquals("Name don't Match for OpportunityType", purple.getName(), clone.getName());
	
			processor.removeOpportunityType(key);
	
			try {
				processor.findOpportunityTypeByKey(key);
				fail("Should have raised NoSuchOpportunityTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "отраслей"
	 * 
	 */
	public void testAddFindDeleteIndustry() {
	
		// test adding, finding and removing a Industry from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("IndustryName");
	
			Industry purple = new Industry(key);
			purple.setName(name);
			purple.setType("P");
	
			processor.addIndustry(purple);
	
			Industry clone = processor.findIndustryByKey(key);
			assertEquals("Name don't Match for Industry", purple.getName(), clone.getName());
	
			processor.removeIndustry(key);
	
			try {
				processor.findIndustryByKey(key);
				fail("Should have raised NoSuchIndustryException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "регионов"
	 * 
	 */
	public void testAddFindDeleteRegion() {
	
		// test adding, finding and removing a Region from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("RegionName");
	
			Region purple = new Region(key);
			purple.setName(name);
	
			processor.addRegion(purple);
	
			Region clone = processor.findRegionByKey(key);
			assertEquals("Name don't Match for Region", purple.getName(), clone.getName());
	
			processor.removeRegion(key);
	
			try {
				processor.findRegionByKey(key);
				fail("Should have raised NoSuchRegionException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "уплаты процентов"
	 * 
	 */
	public void testAddFindDeletePatternPaidPercentType() {
	
		// test adding, finding and removing a PatternPaidPercentType from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("PatternPaidPercentTypeName");
	
			PatternPaidPercentType purple = new PatternPaidPercentType(key);
			purple.setName(name);
	
			processor.addPatternPaidPercentType(purple);
	
			PatternPaidPercentType clone = processor.findPatternPaidPercentTypeByKey(key);
			assertEquals("Name don't Match for PatternPaidPercentType", purple.getName(), clone.getName());
	
			processor.removePatternPaidPercentType(key);
	
			try {
				processor.findPatternPaidPercentTypeByKey(key);
				fail("Should have raised NoSuchPatternPaidPercentTypeException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "базовых ставок"
	 * 
	 */
	public void testAddFindDeleteBaseRate() {
	
		// test adding, finding and removing a BaseRate from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("BaseRateName");
			Integer code = key;
	
			BaseRate purple = new BaseRate(key);
			purple.setName(name);
			purple.setCode(code);
	
			processor.addBaseRate(purple);
	
			BaseRate clone = processor.findBaseRateByKey(key);
			assertEquals("Name don't Match for BaseRate", purple.getName(), clone.getName());
	
			processor.removeBaseRate(key);
	
			try {
				processor.findBaseRateByKey(key);
				fail("Should have raised NoSuchBaseRateException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "Штрафных санкций"
	 * 
	 */
	public void testAddFindDeletePunitiveMeasure() {
	
		// test adding, finding and removing a PunitiveMeasure from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("PunitiveMeasureName");
	
			PunitiveMeasure purple = new PunitiveMeasure(key);
			purple.setName(name);
	
			processor.addPunitiveMeasure(purple);
	
			PunitiveMeasure clone = processor.findPunitiveMeasureByKey(key);
			assertEquals("Name don't Match for PunitiveMeasure", purple.getName(), clone.getName());
	
			processor.removePunitiveMeasure(key);
	
			try {
				processor.findPunitiveMeasureByKey(key);
				fail("Should have raised NoSuchPunitiveMeasureException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}

	/**
	 * test for "Уполномоченных органов"
	 * 
	 */
	public void testAddFindDeleteAuthorizedBody() {
	
		// test adding, finding and removing a AuthorizedBody from the model
		DictionaryActionProcessor processor = (DictionaryActionProcessor) ActionProcessorFactory
				.getActionProcessor("Dictionary");
	
		try {
			Integer key = new Integer("-1");
			String name = new String("AuthorizedBodyName");
	
			AuthorizedBody purple = new AuthorizedBody(key);
			purple.setName(name);
	
			processor.addAuthorizedBody(purple);
	
			AuthorizedBody clone = processor.findAuthorizedBodyByKey(key);
			assertEquals("Name don't Match for AuthorizedBody", purple.getName(), clone.getName());
	
			processor.removeAuthorizedBody(key);
	
			try {
				processor.findAuthorizedBodyByKey(key);
				fail("Should have raised NoSuchAuthorizedBodyException");
			} catch (Exception e) {
				// Eat it -- it should fail
			}
	
		} catch (MappingException e) {
			fail("MappingException caught " + e);
		}
	}
}
