package com.sample.dtables;
public class DomainClassesMetadataB1795019E0BB21C81CEDB82F349EE62D {

    public static final org.drools.model.DomainClassMetadata com_sample_model_Message_Metadata_INSTANCE = new com_sample_model_Message_Metadata();
    private static class com_sample_model_Message_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return com.sample.model.Message.class;
        }

        @Override
        public int getPropertiesSize() {
            return 2;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "message": return 0;
                case "status": return 1;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class com.sample.model.Message");
        }
    }

}