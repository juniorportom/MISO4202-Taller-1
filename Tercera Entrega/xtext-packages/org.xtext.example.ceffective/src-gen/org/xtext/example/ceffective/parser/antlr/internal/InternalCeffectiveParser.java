package org.xtext.example.ceffective.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.ceffective.services.CeffectiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCeffectiveParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Ceffective'", "'{'", "'proveedorNube'", "'}'", "'ProveedorNube'", "'nombre'", "'ambientedespliegue'", "'('", "','", "')'", "'vpc'", "'autenticacionUsuario'", "'AutenticacionUsuario'", "'usuario'", "'correo'", "'ServidorAplicaciones'", "'zonaDisponibilidad'", "'zonaNombre'", "'tamano'", "'sistemaOperativo'", "'recursos'", "'Almacenamiento'", "'tamanoInicial'", "'ServidorBD'", "'tipo'", "'sistemaManejador'", "'Servidor'", "'-'", "'AutenticacionBasica'", "'password'", "'AutenticacionFirma'", "'certificado'", "'Subred'", "'cidrBlock'", "'InternetGateway'", "'GrupoSeguridad'", "'descripcion'", "'reglasSalida'", "'reglasEntrada'", "'IST'", "'QA'", "'NFT'", "'PRD'", "'Micro'", "'Small'", "'Medium'", "'Large'", "'Relacional'", "'NoSql'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCeffectiveParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCeffectiveParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCeffectiveParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCeffective.g"; }



     	private CeffectiveGrammarAccess grammarAccess;

        public InternalCeffectiveParser(TokenStream input, CeffectiveGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Ceffective";
       	}

       	@Override
       	protected CeffectiveGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCeffective"
    // InternalCeffective.g:65:1: entryRuleCeffective returns [EObject current=null] : iv_ruleCeffective= ruleCeffective EOF ;
    public final EObject entryRuleCeffective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCeffective = null;


        try {
            // InternalCeffective.g:65:51: (iv_ruleCeffective= ruleCeffective EOF )
            // InternalCeffective.g:66:2: iv_ruleCeffective= ruleCeffective EOF
            {
             newCompositeNode(grammarAccess.getCeffectiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCeffective=ruleCeffective();

            state._fsp--;

             current =iv_ruleCeffective; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCeffective"


    // $ANTLR start "ruleCeffective"
    // InternalCeffective.g:72:1: ruleCeffective returns [EObject current=null] : ( () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCeffective() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_proveedorNube_4_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:78:2: ( ( () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}' ) )
            // InternalCeffective.g:79:2: ( () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}' )
            {
            // InternalCeffective.g:79:2: ( () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}' )
            // InternalCeffective.g:80:3: () otherlv_1= 'Ceffective' otherlv_2= '{' (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )? otherlv_5= '}'
            {
            // InternalCeffective.g:80:3: ()
            // InternalCeffective.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCeffectiveAccess().getCeffectiveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCeffectiveAccess().getCeffectiveKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getCeffectiveAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:95:3: (otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCeffective.g:96:4: otherlv_3= 'proveedorNube' ( (lv_proveedorNube_4_0= ruleProveedorNube ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCeffectiveAccess().getProveedorNubeKeyword_3_0());
                    			
                    // InternalCeffective.g:100:4: ( (lv_proveedorNube_4_0= ruleProveedorNube ) )
                    // InternalCeffective.g:101:5: (lv_proveedorNube_4_0= ruleProveedorNube )
                    {
                    // InternalCeffective.g:101:5: (lv_proveedorNube_4_0= ruleProveedorNube )
                    // InternalCeffective.g:102:6: lv_proveedorNube_4_0= ruleProveedorNube
                    {

                    						newCompositeNode(grammarAccess.getCeffectiveAccess().getProveedorNubeProveedorNubeParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_proveedorNube_4_0=ruleProveedorNube();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCeffectiveRule());
                    						}
                    						set(
                    							current,
                    							"proveedorNube",
                    							lv_proveedorNube_4_0,
                    							"org.xtext.example.ceffective.Ceffective.ProveedorNube");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCeffectiveAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCeffective"


    // $ANTLR start "entryRuleAutenticacionUsuario"
    // InternalCeffective.g:128:1: entryRuleAutenticacionUsuario returns [EObject current=null] : iv_ruleAutenticacionUsuario= ruleAutenticacionUsuario EOF ;
    public final EObject entryRuleAutenticacionUsuario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutenticacionUsuario = null;


        try {
            // InternalCeffective.g:128:61: (iv_ruleAutenticacionUsuario= ruleAutenticacionUsuario EOF )
            // InternalCeffective.g:129:2: iv_ruleAutenticacionUsuario= ruleAutenticacionUsuario EOF
            {
             newCompositeNode(grammarAccess.getAutenticacionUsuarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutenticacionUsuario=ruleAutenticacionUsuario();

            state._fsp--;

             current =iv_ruleAutenticacionUsuario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutenticacionUsuario"


    // $ANTLR start "ruleAutenticacionUsuario"
    // InternalCeffective.g:135:1: ruleAutenticacionUsuario returns [EObject current=null] : (this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl | this_AutenticacionBasica_1= ruleAutenticacionBasica | this_AutenticacionFirma_2= ruleAutenticacionFirma ) ;
    public final EObject ruleAutenticacionUsuario() throws RecognitionException {
        EObject current = null;

        EObject this_AutenticacionUsuario_Impl_0 = null;

        EObject this_AutenticacionBasica_1 = null;

        EObject this_AutenticacionFirma_2 = null;



        	enterRule();

        try {
            // InternalCeffective.g:141:2: ( (this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl | this_AutenticacionBasica_1= ruleAutenticacionBasica | this_AutenticacionFirma_2= ruleAutenticacionFirma ) )
            // InternalCeffective.g:142:2: (this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl | this_AutenticacionBasica_1= ruleAutenticacionBasica | this_AutenticacionFirma_2= ruleAutenticacionFirma )
            {
            // InternalCeffective.g:142:2: (this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl | this_AutenticacionBasica_1= ruleAutenticacionBasica | this_AutenticacionFirma_2= ruleAutenticacionFirma )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 39:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCeffective.g:143:3: this_AutenticacionUsuario_Impl_0= ruleAutenticacionUsuario_Impl
                    {

                    			newCompositeNode(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionUsuario_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutenticacionUsuario_Impl_0=ruleAutenticacionUsuario_Impl();

                    state._fsp--;


                    			current = this_AutenticacionUsuario_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCeffective.g:152:3: this_AutenticacionBasica_1= ruleAutenticacionBasica
                    {

                    			newCompositeNode(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionBasicaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutenticacionBasica_1=ruleAutenticacionBasica();

                    state._fsp--;


                    			current = this_AutenticacionBasica_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCeffective.g:161:3: this_AutenticacionFirma_2= ruleAutenticacionFirma
                    {

                    			newCompositeNode(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionFirmaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AutenticacionFirma_2=ruleAutenticacionFirma();

                    state._fsp--;


                    			current = this_AutenticacionFirma_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutenticacionUsuario"


    // $ANTLR start "entryRuleProveedorNube"
    // InternalCeffective.g:173:1: entryRuleProveedorNube returns [EObject current=null] : iv_ruleProveedorNube= ruleProveedorNube EOF ;
    public final EObject entryRuleProveedorNube() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProveedorNube = null;


        try {
            // InternalCeffective.g:173:54: (iv_ruleProveedorNube= ruleProveedorNube EOF )
            // InternalCeffective.g:174:2: iv_ruleProveedorNube= ruleProveedorNube EOF
            {
             newCompositeNode(grammarAccess.getProveedorNubeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProveedorNube=ruleProveedorNube();

            state._fsp--;

             current =iv_ruleProveedorNube; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProveedorNube"


    // $ANTLR start "ruleProveedorNube"
    // InternalCeffective.g:180:1: ruleProveedorNube returns [EObject current=null] : (otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'ambientedespliegue' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'vpc' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'autenticacionUsuario' otherlv_17= '{' ( (lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario ) ) (otherlv_19= ',' ( (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleProveedorNube() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        EObject lv_autenticacionUsuario_18_0 = null;

        EObject lv_autenticacionUsuario_20_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:186:2: ( (otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'ambientedespliegue' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'vpc' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'autenticacionUsuario' otherlv_17= '{' ( (lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario ) ) (otherlv_19= ',' ( (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalCeffective.g:187:2: (otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'ambientedespliegue' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'vpc' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'autenticacionUsuario' otherlv_17= '{' ( (lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario ) ) (otherlv_19= ',' ( (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalCeffective.g:187:2: (otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'ambientedespliegue' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'vpc' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'autenticacionUsuario' otherlv_17= '{' ( (lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario ) ) (otherlv_19= ',' ( (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalCeffective.g:188:3: otherlv_0= 'ProveedorNube' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'ambientedespliegue' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'vpc' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= 'autenticacionUsuario' otherlv_17= '{' ( (lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario ) ) (otherlv_19= ',' ( (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProveedorNubeAccess().getProveedorNubeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCeffective.g:196:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCeffective.g:197:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getProveedorNubeAccess().getNombreKeyword_2_0());
                    			
                    // InternalCeffective.g:201:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalCeffective.g:202:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalCeffective.g:202:5: (lv_nombre_3_0= ruleEString )
                    // InternalCeffective.g:203:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:221:3: (otherlv_4= 'ambientedespliegue' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalCeffective.g:222:4: otherlv_4= 'ambientedespliegue' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getProveedorNubeAccess().getAmbientedespliegueKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getProveedorNubeAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalCeffective.g:230:4: ( ( ruleEString ) )
                    // InternalCeffective.g:231:5: ( ruleEString )
                    {
                    // InternalCeffective.g:231:5: ( ruleEString )
                    // InternalCeffective.g:232:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProveedorNubeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:246:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==19) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCeffective.g:247:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getProveedorNubeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalCeffective.g:251:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:252:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:252:6: ( ruleEString )
                    	    // InternalCeffective.g:253:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProveedorNubeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getProveedorNubeAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:273:3: (otherlv_10= 'vpc' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCeffective.g:274:4: otherlv_10= 'vpc' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getProveedorNubeAccess().getVpcKeyword_4_0());
                    			
                    otherlv_11=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getProveedorNubeAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalCeffective.g:282:4: ( ( ruleEString ) )
                    // InternalCeffective.g:283:5: ( ruleEString )
                    {
                    // InternalCeffective.g:283:5: ( ruleEString )
                    // InternalCeffective.g:284:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProveedorNubeRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:298:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCeffective.g:299:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getProveedorNubeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalCeffective.g:303:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:304:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:304:6: ( ruleEString )
                    	    // InternalCeffective.g:305:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProveedorNubeRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getProveedorNubeAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioKeyword_5());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_17, grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalCeffective.g:333:3: ( (lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario ) )
            // InternalCeffective.g:334:4: (lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario )
            {
            // InternalCeffective.g:334:4: (lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario )
            // InternalCeffective.g:335:5: lv_autenticacionUsuario_18_0= ruleAutenticacionUsuario
            {

            					newCompositeNode(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_autenticacionUsuario_18_0=ruleAutenticacionUsuario();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
            					}
            					add(
            						current,
            						"autenticacionUsuario",
            						lv_autenticacionUsuario_18_0,
            						"org.xtext.example.ceffective.Ceffective.AutenticacionUsuario");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCeffective.g:352:3: (otherlv_19= ',' ( (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCeffective.g:353:4: otherlv_19= ',' ( (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario ) )
            	    {
            	    otherlv_19=(Token)match(input,19,FOLLOW_14); 

            	    				newLeafNode(otherlv_19, grammarAccess.getProveedorNubeAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCeffective.g:357:4: ( (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario ) )
            	    // InternalCeffective.g:358:5: (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario )
            	    {
            	    // InternalCeffective.g:358:5: (lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario )
            	    // InternalCeffective.g:359:6: lv_autenticacionUsuario_20_0= ruleAutenticacionUsuario
            	    {

            	    						newCompositeNode(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_autenticacionUsuario_20_0=ruleAutenticacionUsuario();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProveedorNubeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"autenticacionUsuario",
            	    							lv_autenticacionUsuario_20_0,
            	    							"org.xtext.example.ceffective.Ceffective.AutenticacionUsuario");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_21=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_21, grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_22=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProveedorNube"


    // $ANTLR start "entryRuleEString"
    // InternalCeffective.g:389:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCeffective.g:389:47: (iv_ruleEString= ruleEString EOF )
            // InternalCeffective.g:390:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCeffective.g:396:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCeffective.g:402:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCeffective.g:403:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCeffective.g:403:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCeffective.g:404:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCeffective.g:412:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAutenticacionUsuario_Impl"
    // InternalCeffective.g:423:1: entryRuleAutenticacionUsuario_Impl returns [EObject current=null] : iv_ruleAutenticacionUsuario_Impl= ruleAutenticacionUsuario_Impl EOF ;
    public final EObject entryRuleAutenticacionUsuario_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutenticacionUsuario_Impl = null;


        try {
            // InternalCeffective.g:423:66: (iv_ruleAutenticacionUsuario_Impl= ruleAutenticacionUsuario_Impl EOF )
            // InternalCeffective.g:424:2: iv_ruleAutenticacionUsuario_Impl= ruleAutenticacionUsuario_Impl EOF
            {
             newCompositeNode(grammarAccess.getAutenticacionUsuario_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutenticacionUsuario_Impl=ruleAutenticacionUsuario_Impl();

            state._fsp--;

             current =iv_ruleAutenticacionUsuario_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutenticacionUsuario_Impl"


    // $ANTLR start "ruleAutenticacionUsuario_Impl"
    // InternalCeffective.g:430:1: ruleAutenticacionUsuario_Impl returns [EObject current=null] : ( () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAutenticacionUsuario_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_usuario_4_0 = null;

        AntlrDatatypeRuleToken lv_correo_6_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:436:2: ( ( () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalCeffective.g:437:2: ( () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalCeffective.g:437:2: ( () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalCeffective.g:438:3: () otherlv_1= 'AutenticacionUsuario' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalCeffective.g:438:3: ()
            // InternalCeffective.g:439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getAutenticacionUsuario_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:453:3: (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCeffective.g:454:4: otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioKeyword_3_0());
                    			
                    // InternalCeffective.g:458:4: ( (lv_usuario_4_0= ruleEString ) )
                    // InternalCeffective.g:459:5: (lv_usuario_4_0= ruleEString )
                    {
                    // InternalCeffective.g:459:5: (lv_usuario_4_0= ruleEString )
                    // InternalCeffective.g:460:6: lv_usuario_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_usuario_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionUsuario_ImplRule());
                    						}
                    						set(
                    							current,
                    							"usuario",
                    							lv_usuario_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:478:3: (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCeffective.g:479:4: otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoKeyword_4_0());
                    			
                    // InternalCeffective.g:483:4: ( (lv_correo_6_0= ruleEString ) )
                    // InternalCeffective.g:484:5: (lv_correo_6_0= ruleEString )
                    {
                    // InternalCeffective.g:484:5: (lv_correo_6_0= ruleEString )
                    // InternalCeffective.g:485:6: lv_correo_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_correo_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionUsuario_ImplRule());
                    						}
                    						set(
                    							current,
                    							"correo",
                    							lv_correo_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAutenticacionUsuario_ImplAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutenticacionUsuario_Impl"


    // $ANTLR start "entryRuleServidorAplicaciones"
    // InternalCeffective.g:511:1: entryRuleServidorAplicaciones returns [EObject current=null] : iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF ;
    public final EObject entryRuleServidorAplicaciones() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorAplicaciones = null;


        try {
            // InternalCeffective.g:511:61: (iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF )
            // InternalCeffective.g:512:2: iv_ruleServidorAplicaciones= ruleServidorAplicaciones EOF
            {
             newCompositeNode(grammarAccess.getServidorAplicacionesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorAplicaciones=ruleServidorAplicaciones();

            state._fsp--;

             current =iv_ruleServidorAplicaciones; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorAplicaciones"


    // $ANTLR start "ruleServidorAplicaciones"
    // InternalCeffective.g:518:1: ruleServidorAplicaciones returns [EObject current=null] : ( () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}' ) ;
    public final EObject ruleServidorAplicaciones() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_8_0 = null;

        Enumerator lv_tamano_10_0 = null;

        AntlrDatatypeRuleToken lv_sistemaOperativo_12_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:524:2: ( ( () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}' ) )
            // InternalCeffective.g:525:2: ( () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}' )
            {
            // InternalCeffective.g:525:2: ( () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}' )
            // InternalCeffective.g:526:3: () otherlv_1= 'ServidorAplicaciones' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )? (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )? (otherlv_19= 'vpc' ( ( ruleEString ) ) )? otherlv_21= '}'
            {
            // InternalCeffective.g:526:3: ()
            // InternalCeffective.g:527:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:541:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCeffective.g:542:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:546:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:547:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:547:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:548:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:566:3: (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCeffective.g:567:4: otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:571:4: ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    // InternalCeffective.g:572:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    {
                    // InternalCeffective.g:572:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    // InternalCeffective.g:573:6: lv_zonaDisponibilidad_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_zonaDisponibilidad_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:591:3: (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCeffective.g:592:4: otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getServidorAplicacionesAccess().getZonaNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:596:4: ( (lv_zonaNombre_8_0= ruleEString ) )
                    // InternalCeffective.g:597:5: (lv_zonaNombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:597:5: (lv_zonaNombre_8_0= ruleEString )
                    // InternalCeffective.g:598:6: lv_zonaNombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getZonaNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_zonaNombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:616:3: (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCeffective.g:617:4: otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidorAplicacionesAccess().getTamanoKeyword_6_0());
                    			
                    // InternalCeffective.g:621:4: ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    // InternalCeffective.g:622:5: (lv_tamano_10_0= ruleTamanoServidor )
                    {
                    // InternalCeffective.g:622:5: (lv_tamano_10_0= ruleTamanoServidor )
                    // InternalCeffective.g:623:6: lv_tamano_10_0= ruleTamanoServidor
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_tamano_10_0=ruleTamanoServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"tamano",
                    							lv_tamano_10_0,
                    							"org.xtext.example.ceffective.Ceffective.TamanoServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:641:3: (otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCeffective.g:642:4: otherlv_11= 'sistemaOperativo' ( (lv_sistemaOperativo_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_7_0());
                    			
                    // InternalCeffective.g:646:4: ( (lv_sistemaOperativo_12_0= ruleEString ) )
                    // InternalCeffective.g:647:5: (lv_sistemaOperativo_12_0= ruleEString )
                    {
                    // InternalCeffective.g:647:5: (lv_sistemaOperativo_12_0= ruleEString )
                    // InternalCeffective.g:648:6: lv_sistemaOperativo_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_sistemaOperativo_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorAplicacionesRule());
                    						}
                    						set(
                    							current,
                    							"sistemaOperativo",
                    							lv_sistemaOperativo_12_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:666:3: (otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCeffective.g:667:4: otherlv_13= 'recursos' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getServidorAplicacionesAccess().getRecursosKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalCeffective.g:675:4: ( ( ruleEString ) )
                    // InternalCeffective.g:676:5: ( ruleEString )
                    {
                    // InternalCeffective.g:676:5: ( ruleEString )
                    // InternalCeffective.g:677:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:691:4: (otherlv_16= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==19) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCeffective.g:692:5: otherlv_16= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_16=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalCeffective.g:696:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:697:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:697:6: ( ruleEString )
                    	    // InternalCeffective.g:698:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_18, grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:718:3: (otherlv_19= 'vpc' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCeffective.g:719:4: otherlv_19= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_19, grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_9_0());
                    			
                    // InternalCeffective.g:723:4: ( ( ruleEString ) )
                    // InternalCeffective.g:724:5: ( ruleEString )
                    {
                    // InternalCeffective.g:724:5: ( ruleEString )
                    // InternalCeffective.g:725:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorAplicacionesRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorAplicaciones"


    // $ANTLR start "entryRuleAlmacenamiento"
    // InternalCeffective.g:748:1: entryRuleAlmacenamiento returns [EObject current=null] : iv_ruleAlmacenamiento= ruleAlmacenamiento EOF ;
    public final EObject entryRuleAlmacenamiento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlmacenamiento = null;


        try {
            // InternalCeffective.g:748:55: (iv_ruleAlmacenamiento= ruleAlmacenamiento EOF )
            // InternalCeffective.g:749:2: iv_ruleAlmacenamiento= ruleAlmacenamiento EOF
            {
             newCompositeNode(grammarAccess.getAlmacenamientoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlmacenamiento=ruleAlmacenamiento();

            state._fsp--;

             current =iv_ruleAlmacenamiento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlmacenamiento"


    // $ANTLR start "ruleAlmacenamiento"
    // InternalCeffective.g:755:1: ruleAlmacenamiento returns [EObject current=null] : ( () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleAlmacenamiento() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_8_0 = null;

        AntlrDatatypeRuleToken lv_tamanoInicial_10_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:761:2: ( ( () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' ) )
            // InternalCeffective.g:762:2: ( () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' )
            {
            // InternalCeffective.g:762:2: ( () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' )
            // InternalCeffective.g:763:3: () otherlv_1= 'Almacenamiento' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}'
            {
            // InternalCeffective.g:763:3: ()
            // InternalCeffective.g:764:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAlmacenamientoAccess().getAlmacenamientoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAlmacenamientoAccess().getAlmacenamientoKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getAlmacenamientoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:778:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCeffective.g:779:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlmacenamientoAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:783:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:784:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:784:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:785:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:803:3: (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCeffective.g:804:4: otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:808:4: ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    // InternalCeffective.g:809:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    {
                    // InternalCeffective.g:809:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    // InternalCeffective.g:810:6: lv_zonaDisponibilidad_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_zonaDisponibilidad_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:828:3: (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalCeffective.g:829:4: otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlmacenamientoAccess().getZonaNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:833:4: ( (lv_zonaNombre_8_0= ruleEString ) )
                    // InternalCeffective.g:834:5: (lv_zonaNombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:834:5: (lv_zonaNombre_8_0= ruleEString )
                    // InternalCeffective.g:835:6: lv_zonaNombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getZonaNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_zonaNombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:853:3: (otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCeffective.g:854:4: otherlv_9= 'tamanoInicial' ( (lv_tamanoInicial_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getAlmacenamientoAccess().getTamanoInicialKeyword_6_0());
                    			
                    // InternalCeffective.g:858:4: ( (lv_tamanoInicial_10_0= ruleEInt ) )
                    // InternalCeffective.g:859:5: (lv_tamanoInicial_10_0= ruleEInt )
                    {
                    // InternalCeffective.g:859:5: (lv_tamanoInicial_10_0= ruleEInt )
                    // InternalCeffective.g:860:6: lv_tamanoInicial_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getTamanoInicialEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_tamanoInicial_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlmacenamientoRule());
                    						}
                    						set(
                    							current,
                    							"tamanoInicial",
                    							lv_tamanoInicial_10_0,
                    							"org.xtext.example.ceffective.Ceffective.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:878:3: (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCeffective.g:879:4: otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getAlmacenamientoAccess().getRecursosKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getAlmacenamientoAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalCeffective.g:887:4: ( ( ruleEString ) )
                    // InternalCeffective.g:888:5: ( ruleEString )
                    {
                    // InternalCeffective.g:888:5: ( ruleEString )
                    // InternalCeffective.g:889:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlmacenamientoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:903:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==19) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCeffective.g:904:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getAlmacenamientoAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCeffective.g:908:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:909:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:909:6: ( ruleEString )
                    	    // InternalCeffective.g:910:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAlmacenamientoRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getAlmacenamientoAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:930:3: (otherlv_17= 'vpc' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCeffective.g:931:4: otherlv_17= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getAlmacenamientoAccess().getVpcKeyword_8_0());
                    			
                    // InternalCeffective.g:935:4: ( ( ruleEString ) )
                    // InternalCeffective.g:936:5: ( ruleEString )
                    {
                    // InternalCeffective.g:936:5: ( ruleEString )
                    // InternalCeffective.g:937:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAlmacenamientoRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAlmacenamientoAccess().getVpcVPCCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAlmacenamientoAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlmacenamiento"


    // $ANTLR start "entryRuleServidorBD"
    // InternalCeffective.g:960:1: entryRuleServidorBD returns [EObject current=null] : iv_ruleServidorBD= ruleServidorBD EOF ;
    public final EObject entryRuleServidorBD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidorBD = null;


        try {
            // InternalCeffective.g:960:51: (iv_ruleServidorBD= ruleServidorBD EOF )
            // InternalCeffective.g:961:2: iv_ruleServidorBD= ruleServidorBD EOF
            {
             newCompositeNode(grammarAccess.getServidorBDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidorBD=ruleServidorBD();

            state._fsp--;

             current =iv_ruleServidorBD; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidorBD"


    // $ANTLR start "ruleServidorBD"
    // InternalCeffective.g:967:1: ruleServidorBD returns [EObject current=null] : ( () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}' ) ;
    public final EObject ruleServidorBD() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_8_0 = null;

        Enumerator lv_tamano_10_0 = null;

        Enumerator lv_tipo_12_0 = null;

        AntlrDatatypeRuleToken lv_sistemaManejador_14_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:973:2: ( ( () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}' ) )
            // InternalCeffective.g:974:2: ( () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}' )
            {
            // InternalCeffective.g:974:2: ( () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}' )
            // InternalCeffective.g:975:3: () otherlv_1= 'ServidorBD' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )? (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )? (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )? (otherlv_21= 'vpc' ( ( ruleEString ) ) )? otherlv_23= '}'
            {
            // InternalCeffective.g:975:3: ()
            // InternalCeffective.g:976:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidorBDAccess().getServidorBDAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServidorBDAccess().getServidorBDKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getServidorBDAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:990:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCeffective.g:991:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getServidorBDAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:995:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:996:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:996:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:997:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1015:3: (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCeffective.g:1016:4: otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getServidorBDAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:1020:4: ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    // InternalCeffective.g:1021:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1021:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    // InternalCeffective.g:1022:6: lv_zonaDisponibilidad_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_zonaDisponibilidad_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1040:3: (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalCeffective.g:1041:4: otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getServidorBDAccess().getZonaNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:1045:4: ( (lv_zonaNombre_8_0= ruleEString ) )
                    // InternalCeffective.g:1046:5: (lv_zonaNombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1046:5: (lv_zonaNombre_8_0= ruleEString )
                    // InternalCeffective.g:1047:6: lv_zonaNombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getZonaNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_zonaNombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1065:3: (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCeffective.g:1066:4: otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidorBDAccess().getTamanoKeyword_6_0());
                    			
                    // InternalCeffective.g:1070:4: ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    // InternalCeffective.g:1071:5: (lv_tamano_10_0= ruleTamanoServidor )
                    {
                    // InternalCeffective.g:1071:5: (lv_tamano_10_0= ruleTamanoServidor )
                    // InternalCeffective.g:1072:6: lv_tamano_10_0= ruleTamanoServidor
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_tamano_10_0=ruleTamanoServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"tamano",
                    							lv_tamano_10_0,
                    							"org.xtext.example.ceffective.Ceffective.TamanoServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1090:3: (otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCeffective.g:1091:4: otherlv_11= 'tipo' ( (lv_tipo_12_0= ruleTipoBaseDatos ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_36); 

                    				newLeafNode(otherlv_11, grammarAccess.getServidorBDAccess().getTipoKeyword_7_0());
                    			
                    // InternalCeffective.g:1095:4: ( (lv_tipo_12_0= ruleTipoBaseDatos ) )
                    // InternalCeffective.g:1096:5: (lv_tipo_12_0= ruleTipoBaseDatos )
                    {
                    // InternalCeffective.g:1096:5: (lv_tipo_12_0= ruleTipoBaseDatos )
                    // InternalCeffective.g:1097:6: lv_tipo_12_0= ruleTipoBaseDatos
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getTipoTipoBaseDatosEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_tipo_12_0=ruleTipoBaseDatos();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"tipo",
                    							lv_tipo_12_0,
                    							"org.xtext.example.ceffective.Ceffective.TipoBaseDatos");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1115:3: (otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCeffective.g:1116:4: otherlv_13= 'sistemaManejador' ( (lv_sistemaManejador_14_0= ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getServidorBDAccess().getSistemaManejadorKeyword_8_0());
                    			
                    // InternalCeffective.g:1120:4: ( (lv_sistemaManejador_14_0= ruleEString ) )
                    // InternalCeffective.g:1121:5: (lv_sistemaManejador_14_0= ruleEString )
                    {
                    // InternalCeffective.g:1121:5: (lv_sistemaManejador_14_0= ruleEString )
                    // InternalCeffective.g:1122:6: lv_sistemaManejador_14_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getSistemaManejadorEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_sistemaManejador_14_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidorBDRule());
                    						}
                    						set(
                    							current,
                    							"sistemaManejador",
                    							lv_sistemaManejador_14_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1140:3: (otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCeffective.g:1141:4: otherlv_15= 'recursos' otherlv_16= '(' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getServidorBDAccess().getRecursosKeyword_9_0());
                    			
                    otherlv_16=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getServidorBDAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalCeffective.g:1149:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1150:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1150:5: ( ruleEString )
                    // InternalCeffective.g:1151:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorBDRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:1165:4: (otherlv_18= ',' ( ( ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==19) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalCeffective.g:1166:5: otherlv_18= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getServidorBDAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalCeffective.g:1170:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:1171:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:1171:6: ( ruleEString )
                    	    // InternalCeffective.g:1172:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidorBDRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_20, grammarAccess.getServidorBDAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:1192:3: (otherlv_21= 'vpc' ( ( ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCeffective.g:1193:4: otherlv_21= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getServidorBDAccess().getVpcKeyword_10_0());
                    			
                    // InternalCeffective.g:1197:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1198:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1198:5: ( ruleEString )
                    // InternalCeffective.g:1199:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidorBDRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidorBDAccess().getVpcVPCCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getServidorBDAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidorBD"


    // $ANTLR start "entryRuleServidor_Impl"
    // InternalCeffective.g:1222:1: entryRuleServidor_Impl returns [EObject current=null] : iv_ruleServidor_Impl= ruleServidor_Impl EOF ;
    public final EObject entryRuleServidor_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServidor_Impl = null;


        try {
            // InternalCeffective.g:1222:54: (iv_ruleServidor_Impl= ruleServidor_Impl EOF )
            // InternalCeffective.g:1223:2: iv_ruleServidor_Impl= ruleServidor_Impl EOF
            {
             newCompositeNode(grammarAccess.getServidor_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServidor_Impl=ruleServidor_Impl();

            state._fsp--;

             current =iv_ruleServidor_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServidor_Impl"


    // $ANTLR start "ruleServidor_Impl"
    // InternalCeffective.g:1229:1: ruleServidor_Impl returns [EObject current=null] : ( () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleServidor_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_8_0 = null;

        Enumerator lv_tamano_10_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1235:2: ( ( () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' ) )
            // InternalCeffective.g:1236:2: ( () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' )
            {
            // InternalCeffective.g:1236:2: ( () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}' )
            // InternalCeffective.g:1237:3: () otherlv_1= 'Servidor' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )? (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )? (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )? (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? (otherlv_17= 'vpc' ( ( ruleEString ) ) )? otherlv_19= '}'
            {
            // InternalCeffective.g:1237:3: ()
            // InternalCeffective.g:1238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServidor_ImplAccess().getServidorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getServidor_ImplAccess().getServidorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getServidor_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1252:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCeffective.g:1253:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getServidor_ImplAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:1257:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:1258:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1258:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:1259:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1277:3: (otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCeffective.g:1278:4: otherlv_5= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:1282:4: ( (lv_zonaDisponibilidad_6_0= ruleEString ) )
                    // InternalCeffective.g:1283:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1283:5: (lv_zonaDisponibilidad_6_0= ruleEString )
                    // InternalCeffective.g:1284:6: lv_zonaDisponibilidad_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_zonaDisponibilidad_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1302:3: (otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCeffective.g:1303:4: otherlv_7= 'zonaNombre' ( (lv_zonaNombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getServidor_ImplAccess().getZonaNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:1307:4: ( (lv_zonaNombre_8_0= ruleEString ) )
                    // InternalCeffective.g:1308:5: (lv_zonaNombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1308:5: (lv_zonaNombre_8_0= ruleEString )
                    // InternalCeffective.g:1309:6: lv_zonaNombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getZonaNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_zonaNombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1327:3: (otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCeffective.g:1328:4: otherlv_9= 'tamano' ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getServidor_ImplAccess().getTamanoKeyword_6_0());
                    			
                    // InternalCeffective.g:1332:4: ( (lv_tamano_10_0= ruleTamanoServidor ) )
                    // InternalCeffective.g:1333:5: (lv_tamano_10_0= ruleTamanoServidor )
                    {
                    // InternalCeffective.g:1333:5: (lv_tamano_10_0= ruleTamanoServidor )
                    // InternalCeffective.g:1334:6: lv_tamano_10_0= ruleTamanoServidor
                    {

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_tamano_10_0=ruleTamanoServidor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServidor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"tamano",
                    							lv_tamano_10_0,
                    							"org.xtext.example.ceffective.Ceffective.TamanoServidor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1352:3: (otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==31) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCeffective.g:1353:4: otherlv_11= 'recursos' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getServidor_ImplAccess().getRecursosKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getServidor_ImplAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalCeffective.g:1361:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1362:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1362:5: ( ruleEString )
                    // InternalCeffective.g:1363:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidor_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCeffective.g:1377:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==19) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalCeffective.g:1378:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getServidor_ImplAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalCeffective.g:1382:5: ( ( ruleEString ) )
                    	    // InternalCeffective.g:1383:6: ( ruleEString )
                    	    {
                    	    // InternalCeffective.g:1383:6: ( ruleEString )
                    	    // InternalCeffective.g:1384:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getServidor_ImplRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,20,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getServidor_ImplAccess().getRightParenthesisKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalCeffective.g:1404:3: (otherlv_17= 'vpc' ( ( ruleEString ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==21) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCeffective.g:1405:4: otherlv_17= 'vpc' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getServidor_ImplAccess().getVpcKeyword_8_0());
                    			
                    // InternalCeffective.g:1409:4: ( ( ruleEString ) )
                    // InternalCeffective.g:1410:5: ( ruleEString )
                    {
                    // InternalCeffective.g:1410:5: ( ruleEString )
                    // InternalCeffective.g:1411:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getServidor_ImplRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getServidor_ImplAccess().getVpcVPCCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getServidor_ImplAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServidor_Impl"


    // $ANTLR start "entryRuleEInt"
    // InternalCeffective.g:1434:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCeffective.g:1434:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCeffective.g:1435:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCeffective.g:1441:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCeffective.g:1447:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCeffective.g:1448:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCeffective.g:1448:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCeffective.g:1449:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCeffective.g:1449:3: (kw= '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==38) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCeffective.g:1450:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAutenticacionBasica"
    // InternalCeffective.g:1467:1: entryRuleAutenticacionBasica returns [EObject current=null] : iv_ruleAutenticacionBasica= ruleAutenticacionBasica EOF ;
    public final EObject entryRuleAutenticacionBasica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutenticacionBasica = null;


        try {
            // InternalCeffective.g:1467:60: (iv_ruleAutenticacionBasica= ruleAutenticacionBasica EOF )
            // InternalCeffective.g:1468:2: iv_ruleAutenticacionBasica= ruleAutenticacionBasica EOF
            {
             newCompositeNode(grammarAccess.getAutenticacionBasicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutenticacionBasica=ruleAutenticacionBasica();

            state._fsp--;

             current =iv_ruleAutenticacionBasica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutenticacionBasica"


    // $ANTLR start "ruleAutenticacionBasica"
    // InternalCeffective.g:1474:1: ruleAutenticacionBasica returns [EObject current=null] : ( () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleAutenticacionBasica() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_usuario_4_0 = null;

        AntlrDatatypeRuleToken lv_correo_6_0 = null;

        AntlrDatatypeRuleToken lv_password_8_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1480:2: ( ( () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalCeffective.g:1481:2: ( () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalCeffective.g:1481:2: ( () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalCeffective.g:1482:3: () otherlv_1= 'AutenticacionBasica' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalCeffective.g:1482:3: ()
            // InternalCeffective.g:1483:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getAutenticacionBasicaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1497:3: (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCeffective.g:1498:4: otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutenticacionBasicaAccess().getUsuarioKeyword_3_0());
                    			
                    // InternalCeffective.g:1502:4: ( (lv_usuario_4_0= ruleEString ) )
                    // InternalCeffective.g:1503:5: (lv_usuario_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1503:5: (lv_usuario_4_0= ruleEString )
                    // InternalCeffective.g:1504:6: lv_usuario_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionBasicaAccess().getUsuarioEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_usuario_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionBasicaRule());
                    						}
                    						set(
                    							current,
                    							"usuario",
                    							lv_usuario_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1522:3: (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==25) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCeffective.g:1523:4: otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutenticacionBasicaAccess().getCorreoKeyword_4_0());
                    			
                    // InternalCeffective.g:1527:4: ( (lv_correo_6_0= ruleEString ) )
                    // InternalCeffective.g:1528:5: (lv_correo_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1528:5: (lv_correo_6_0= ruleEString )
                    // InternalCeffective.g:1529:6: lv_correo_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionBasicaAccess().getCorreoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_correo_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionBasicaRule());
                    						}
                    						set(
                    							current,
                    							"correo",
                    							lv_correo_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1547:3: (otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCeffective.g:1548:4: otherlv_7= 'password' ( (lv_password_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAutenticacionBasicaAccess().getPasswordKeyword_5_0());
                    			
                    // InternalCeffective.g:1552:4: ( (lv_password_8_0= ruleEString ) )
                    // InternalCeffective.g:1553:5: (lv_password_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1553:5: (lv_password_8_0= ruleEString )
                    // InternalCeffective.g:1554:6: lv_password_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionBasicaAccess().getPasswordEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_password_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionBasicaRule());
                    						}
                    						set(
                    							current,
                    							"password",
                    							lv_password_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAutenticacionBasicaAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutenticacionBasica"


    // $ANTLR start "entryRuleAutenticacionFirma"
    // InternalCeffective.g:1580:1: entryRuleAutenticacionFirma returns [EObject current=null] : iv_ruleAutenticacionFirma= ruleAutenticacionFirma EOF ;
    public final EObject entryRuleAutenticacionFirma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAutenticacionFirma = null;


        try {
            // InternalCeffective.g:1580:59: (iv_ruleAutenticacionFirma= ruleAutenticacionFirma EOF )
            // InternalCeffective.g:1581:2: iv_ruleAutenticacionFirma= ruleAutenticacionFirma EOF
            {
             newCompositeNode(grammarAccess.getAutenticacionFirmaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAutenticacionFirma=ruleAutenticacionFirma();

            state._fsp--;

             current =iv_ruleAutenticacionFirma; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAutenticacionFirma"


    // $ANTLR start "ruleAutenticacionFirma"
    // InternalCeffective.g:1587:1: ruleAutenticacionFirma returns [EObject current=null] : ( () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleAutenticacionFirma() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_usuario_4_0 = null;

        AntlrDatatypeRuleToken lv_correo_6_0 = null;

        AntlrDatatypeRuleToken lv_nombre_8_0 = null;

        AntlrDatatypeRuleToken lv_certificado_10_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1593:2: ( ( () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalCeffective.g:1594:2: ( () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalCeffective.g:1594:2: ( () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalCeffective.g:1595:3: () otherlv_1= 'AutenticacionFirma' otherlv_2= '{' (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )? (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )? (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )? (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalCeffective.g:1595:3: ()
            // InternalCeffective.g:1596:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getAutenticacionFirmaAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1610:3: (otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==24) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCeffective.g:1611:4: otherlv_3= 'usuario' ( (lv_usuario_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getAutenticacionFirmaAccess().getUsuarioKeyword_3_0());
                    			
                    // InternalCeffective.g:1615:4: ( (lv_usuario_4_0= ruleEString ) )
                    // InternalCeffective.g:1616:5: (lv_usuario_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1616:5: (lv_usuario_4_0= ruleEString )
                    // InternalCeffective.g:1617:6: lv_usuario_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionFirmaAccess().getUsuarioEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_usuario_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionFirmaRule());
                    						}
                    						set(
                    							current,
                    							"usuario",
                    							lv_usuario_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1635:3: (otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCeffective.g:1636:4: otherlv_5= 'correo' ( (lv_correo_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getAutenticacionFirmaAccess().getCorreoKeyword_4_0());
                    			
                    // InternalCeffective.g:1640:4: ( (lv_correo_6_0= ruleEString ) )
                    // InternalCeffective.g:1641:5: (lv_correo_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1641:5: (lv_correo_6_0= ruleEString )
                    // InternalCeffective.g:1642:6: lv_correo_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionFirmaAccess().getCorreoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_correo_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionFirmaRule());
                    						}
                    						set(
                    							current,
                    							"correo",
                    							lv_correo_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1660:3: (otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==16) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCeffective.g:1661:4: otherlv_7= 'nombre' ( (lv_nombre_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getAutenticacionFirmaAccess().getNombreKeyword_5_0());
                    			
                    // InternalCeffective.g:1665:4: ( (lv_nombre_8_0= ruleEString ) )
                    // InternalCeffective.g:1666:5: (lv_nombre_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1666:5: (lv_nombre_8_0= ruleEString )
                    // InternalCeffective.g:1667:6: lv_nombre_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionFirmaAccess().getNombreEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_nombre_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionFirmaRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1685:3: (otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCeffective.g:1686:4: otherlv_9= 'certificado' ( (lv_certificado_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,42,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getAutenticacionFirmaAccess().getCertificadoKeyword_6_0());
                    			
                    // InternalCeffective.g:1690:4: ( (lv_certificado_10_0= ruleEString ) )
                    // InternalCeffective.g:1691:5: (lv_certificado_10_0= ruleEString )
                    {
                    // InternalCeffective.g:1691:5: (lv_certificado_10_0= ruleEString )
                    // InternalCeffective.g:1692:6: lv_certificado_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAutenticacionFirmaAccess().getCertificadoEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_certificado_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAutenticacionFirmaRule());
                    						}
                    						set(
                    							current,
                    							"certificado",
                    							lv_certificado_10_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAutenticacionFirmaAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAutenticacionFirma"


    // $ANTLR start "entryRuleSubred"
    // InternalCeffective.g:1718:1: entryRuleSubred returns [EObject current=null] : iv_ruleSubred= ruleSubred EOF ;
    public final EObject entryRuleSubred() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubred = null;


        try {
            // InternalCeffective.g:1718:47: (iv_ruleSubred= ruleSubred EOF )
            // InternalCeffective.g:1719:2: iv_ruleSubred= ruleSubred EOF
            {
             newCompositeNode(grammarAccess.getSubredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubred=ruleSubred();

            state._fsp--;

             current =iv_ruleSubred; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubred"


    // $ANTLR start "ruleSubred"
    // InternalCeffective.g:1725:1: ruleSubred returns [EObject current=null] : ( () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleSubred() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_8_0 = null;

        AntlrDatatypeRuleToken lv_cidrBlock_10_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1731:2: ( ( () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalCeffective.g:1732:2: ( () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalCeffective.g:1732:2: ( () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalCeffective.g:1733:3: () otherlv_1= 'Subred' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalCeffective.g:1733:3: ()
            // InternalCeffective.g:1734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubredAccess().getSubredAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubredAccess().getSubredKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1748:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==16) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCeffective.g:1749:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubredAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:1753:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:1754:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1754:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:1755:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1773:3: (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==28) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCeffective.g:1774:4: otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubredAccess().getZonaNombreKeyword_4_0());
                    			
                    // InternalCeffective.g:1778:4: ( (lv_zonaNombre_6_0= ruleEString ) )
                    // InternalCeffective.g:1779:5: (lv_zonaNombre_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1779:5: (lv_zonaNombre_6_0= ruleEString )
                    // InternalCeffective.g:1780:6: lv_zonaNombre_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getZonaNombreEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_zonaNombre_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1798:3: (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==27) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCeffective.g:1799:4: otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_5_0());
                    			
                    // InternalCeffective.g:1803:4: ( (lv_zonaDisponibilidad_8_0= ruleEString ) )
                    // InternalCeffective.g:1804:5: (lv_zonaDisponibilidad_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1804:5: (lv_zonaDisponibilidad_8_0= ruleEString )
                    // InternalCeffective.g:1805:6: lv_zonaDisponibilidad_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_zonaDisponibilidad_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1823:3: (otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCeffective.g:1824:4: otherlv_9= 'cidrBlock' ( (lv_cidrBlock_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubredAccess().getCidrBlockKeyword_6_0());
                    			
                    // InternalCeffective.g:1828:4: ( (lv_cidrBlock_10_0= ruleEString ) )
                    // InternalCeffective.g:1829:5: (lv_cidrBlock_10_0= ruleEString )
                    {
                    // InternalCeffective.g:1829:5: (lv_cidrBlock_10_0= ruleEString )
                    // InternalCeffective.g:1830:6: lv_cidrBlock_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSubredAccess().getCidrBlockEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_cidrBlock_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubredRule());
                    						}
                    						set(
                    							current,
                    							"cidrBlock",
                    							lv_cidrBlock_10_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubred"


    // $ANTLR start "entryRuleInternetGateway"
    // InternalCeffective.g:1856:1: entryRuleInternetGateway returns [EObject current=null] : iv_ruleInternetGateway= ruleInternetGateway EOF ;
    public final EObject entryRuleInternetGateway() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInternetGateway = null;


        try {
            // InternalCeffective.g:1856:56: (iv_ruleInternetGateway= ruleInternetGateway EOF )
            // InternalCeffective.g:1857:2: iv_ruleInternetGateway= ruleInternetGateway EOF
            {
             newCompositeNode(grammarAccess.getInternetGatewayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInternetGateway=ruleInternetGateway();

            state._fsp--;

             current =iv_ruleInternetGateway; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInternetGateway"


    // $ANTLR start "ruleInternetGateway"
    // InternalCeffective.g:1863:1: ruleInternetGateway returns [EObject current=null] : ( () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleInternetGateway() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_nombre_4_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_6_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_8_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1869:2: ( ( () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalCeffective.g:1870:2: ( () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalCeffective.g:1870:2: ( () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalCeffective.g:1871:3: () otherlv_1= 'InternetGateway' otherlv_2= '{' (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )? (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )? (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalCeffective.g:1871:3: ()
            // InternalCeffective.g:1872:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInternetGatewayAccess().getInternetGatewayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCeffective.g:1886:3: (otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==16) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCeffective.g:1887:4: otherlv_3= 'nombre' ( (lv_nombre_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getInternetGatewayAccess().getNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:1891:4: ( (lv_nombre_4_0= ruleEString ) )
                    // InternalCeffective.g:1892:5: (lv_nombre_4_0= ruleEString )
                    {
                    // InternalCeffective.g:1892:5: (lv_nombre_4_0= ruleEString )
                    // InternalCeffective.g:1893:6: lv_nombre_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_nombre_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternetGatewayRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_4_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1911:3: (otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==28) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCeffective.g:1912:4: otherlv_5= 'zonaNombre' ( (lv_zonaNombre_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getInternetGatewayAccess().getZonaNombreKeyword_4_0());
                    			
                    // InternalCeffective.g:1916:4: ( (lv_zonaNombre_6_0= ruleEString ) )
                    // InternalCeffective.g:1917:5: (lv_zonaNombre_6_0= ruleEString )
                    {
                    // InternalCeffective.g:1917:5: (lv_zonaNombre_6_0= ruleEString )
                    // InternalCeffective.g:1918:6: lv_zonaNombre_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getZonaNombreEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_zonaNombre_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternetGatewayRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_6_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:1936:3: (otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==27) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCeffective.g:1937:4: otherlv_7= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadKeyword_5_0());
                    			
                    // InternalCeffective.g:1941:4: ( (lv_zonaDisponibilidad_8_0= ruleEString ) )
                    // InternalCeffective.g:1942:5: (lv_zonaDisponibilidad_8_0= ruleEString )
                    {
                    // InternalCeffective.g:1942:5: (lv_zonaDisponibilidad_8_0= ruleEString )
                    // InternalCeffective.g:1943:6: lv_zonaDisponibilidad_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_zonaDisponibilidad_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInternetGatewayRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_8_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInternetGateway"


    // $ANTLR start "entryRuleGrupoSeguridad"
    // InternalCeffective.g:1969:1: entryRuleGrupoSeguridad returns [EObject current=null] : iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF ;
    public final EObject entryRuleGrupoSeguridad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrupoSeguridad = null;


        try {
            // InternalCeffective.g:1969:55: (iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF )
            // InternalCeffective.g:1970:2: iv_ruleGrupoSeguridad= ruleGrupoSeguridad EOF
            {
             newCompositeNode(grammarAccess.getGrupoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrupoSeguridad=ruleGrupoSeguridad();

            state._fsp--;

             current =iv_ruleGrupoSeguridad; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrupoSeguridad"


    // $ANTLR start "ruleGrupoSeguridad"
    // InternalCeffective.g:1976:1: ruleGrupoSeguridad returns [EObject current=null] : (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= 'reglasSalida' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'reglasEntrada' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}' ) ;
    public final EObject ruleGrupoSeguridad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_nombre_3_0 = null;

        AntlrDatatypeRuleToken lv_zonaNombre_5_0 = null;

        AntlrDatatypeRuleToken lv_zonaDisponibilidad_7_0 = null;

        AntlrDatatypeRuleToken lv_descripcion_9_0 = null;



        	enterRule();

        try {
            // InternalCeffective.g:1982:2: ( (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= 'reglasSalida' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'reglasEntrada' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}' ) )
            // InternalCeffective.g:1983:2: (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= 'reglasSalida' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'reglasEntrada' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}' )
            {
            // InternalCeffective.g:1983:2: (otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= 'reglasSalida' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'reglasEntrada' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}' )
            // InternalCeffective.g:1984:3: otherlv_0= 'GrupoSeguridad' otherlv_1= '{' (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )? (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )? (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )? (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )? otherlv_10= 'reglasSalida' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= 'reglasEntrada' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_1, grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCeffective.g:1992:3: (otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==16) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCeffective.g:1993:4: otherlv_2= 'nombre' ( (lv_nombre_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0());
                    			
                    // InternalCeffective.g:1997:4: ( (lv_nombre_3_0= ruleEString ) )
                    // InternalCeffective.g:1998:5: (lv_nombre_3_0= ruleEString )
                    {
                    // InternalCeffective.g:1998:5: (lv_nombre_3_0= ruleEString )
                    // InternalCeffective.g:1999:6: lv_nombre_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_nombre_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"nombre",
                    							lv_nombre_3_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2017:3: (otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==28) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCeffective.g:2018:4: otherlv_4= 'zonaNombre' ( (lv_zonaNombre_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,28,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getGrupoSeguridadAccess().getZonaNombreKeyword_3_0());
                    			
                    // InternalCeffective.g:2022:4: ( (lv_zonaNombre_5_0= ruleEString ) )
                    // InternalCeffective.g:2023:5: (lv_zonaNombre_5_0= ruleEString )
                    {
                    // InternalCeffective.g:2023:5: (lv_zonaNombre_5_0= ruleEString )
                    // InternalCeffective.g:2024:6: lv_zonaNombre_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getZonaNombreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_zonaNombre_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"zonaNombre",
                    							lv_zonaNombre_5_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2042:3: (otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==27) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCeffective.g:2043:4: otherlv_6= 'zonaDisponibilidad' ( (lv_zonaDisponibilidad_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadKeyword_4_0());
                    			
                    // InternalCeffective.g:2047:4: ( (lv_zonaDisponibilidad_7_0= ruleEString ) )
                    // InternalCeffective.g:2048:5: (lv_zonaDisponibilidad_7_0= ruleEString )
                    {
                    // InternalCeffective.g:2048:5: (lv_zonaDisponibilidad_7_0= ruleEString )
                    // InternalCeffective.g:2049:6: lv_zonaDisponibilidad_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_zonaDisponibilidad_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"zonaDisponibilidad",
                    							lv_zonaDisponibilidad_7_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCeffective.g:2067:3: (otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==47) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCeffective.g:2068:4: otherlv_8= 'descripcion' ( (lv_descripcion_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_5_0());
                    			
                    // InternalCeffective.g:2072:4: ( (lv_descripcion_9_0= ruleEString ) )
                    // InternalCeffective.g:2073:5: (lv_descripcion_9_0= ruleEString )
                    {
                    // InternalCeffective.g:2073:5: (lv_descripcion_9_0= ruleEString )
                    // InternalCeffective.g:2074:6: lv_descripcion_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_descripcion_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGrupoSeguridadRule());
                    						}
                    						set(
                    							current,
                    							"descripcion",
                    							lv_descripcion_9_0,
                    							"org.xtext.example.ceffective.Ceffective.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_6());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_7());
            		
            // InternalCeffective.g:2100:3: ( ( ruleEString ) )
            // InternalCeffective.g:2101:4: ( ruleEString )
            {
            // InternalCeffective.g:2101:4: ( ruleEString )
            // InternalCeffective.g:2102:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_8_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCeffective.g:2116:3: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==19) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalCeffective.g:2117:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_13, grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalCeffective.g:2121:4: ( ( ruleEString ) )
            	    // InternalCeffective.g:2122:5: ( ruleEString )
            	    {
            	    // InternalCeffective.g:2122:5: ( ruleEString )
            	    // InternalCeffective.g:2123:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FOLLOW_62); 

            			newLeafNode(otherlv_15, grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_10());
            		
            otherlv_16=(Token)match(input,49,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_11());
            		
            otherlv_17=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_12());
            		
            // InternalCeffective.g:2150:3: ( ( ruleEString ) )
            // InternalCeffective.g:2151:4: ( ruleEString )
            {
            // InternalCeffective.g:2151:4: ( ruleEString )
            // InternalCeffective.g:2152:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            					}
            				

            					newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_13_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCeffective.g:2166:3: (otherlv_19= ',' ( ( ruleEString ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==19) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalCeffective.g:2167:4: otherlv_19= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_19, grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalCeffective.g:2171:4: ( ( ruleEString ) )
            	    // InternalCeffective.g:2172:5: ( ruleEString )
            	    {
            	    // InternalCeffective.g:2172:5: ( ruleEString )
            	    // InternalCeffective.g:2173:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getGrupoSeguridadRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_14_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_21=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_21, grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_15());
            		
            otherlv_22=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrupoSeguridad"


    // $ANTLR start "ruleTipoAmbiente"
    // InternalCeffective.g:2200:1: ruleTipoAmbiente returns [Enumerator current=null] : ( (enumLiteral_0= 'IST' ) | (enumLiteral_1= 'QA' ) | (enumLiteral_2= 'NFT' ) | (enumLiteral_3= 'PRD' ) ) ;
    public final Enumerator ruleTipoAmbiente() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCeffective.g:2206:2: ( ( (enumLiteral_0= 'IST' ) | (enumLiteral_1= 'QA' ) | (enumLiteral_2= 'NFT' ) | (enumLiteral_3= 'PRD' ) ) )
            // InternalCeffective.g:2207:2: ( (enumLiteral_0= 'IST' ) | (enumLiteral_1= 'QA' ) | (enumLiteral_2= 'NFT' ) | (enumLiteral_3= 'PRD' ) )
            {
            // InternalCeffective.g:2207:2: ( (enumLiteral_0= 'IST' ) | (enumLiteral_1= 'QA' ) | (enumLiteral_2= 'NFT' ) | (enumLiteral_3= 'PRD' ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt64=1;
                }
                break;
            case 51:
                {
                alt64=2;
                }
                break;
            case 52:
                {
                alt64=3;
                }
                break;
            case 53:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalCeffective.g:2208:3: (enumLiteral_0= 'IST' )
                    {
                    // InternalCeffective.g:2208:3: (enumLiteral_0= 'IST' )
                    // InternalCeffective.g:2209:4: enumLiteral_0= 'IST'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTipoAmbienteAccess().getISTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoAmbienteAccess().getISTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:2216:3: (enumLiteral_1= 'QA' )
                    {
                    // InternalCeffective.g:2216:3: (enumLiteral_1= 'QA' )
                    // InternalCeffective.g:2217:4: enumLiteral_1= 'QA'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTipoAmbienteAccess().getQAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoAmbienteAccess().getQAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:2224:3: (enumLiteral_2= 'NFT' )
                    {
                    // InternalCeffective.g:2224:3: (enumLiteral_2= 'NFT' )
                    // InternalCeffective.g:2225:4: enumLiteral_2= 'NFT'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTipoAmbienteAccess().getNFTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoAmbienteAccess().getNFTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCeffective.g:2232:3: (enumLiteral_3= 'PRD' )
                    {
                    // InternalCeffective.g:2232:3: (enumLiteral_3= 'PRD' )
                    // InternalCeffective.g:2233:4: enumLiteral_3= 'PRD'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTipoAmbienteAccess().getPRDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoAmbienteAccess().getPRDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoAmbiente"


    // $ANTLR start "ruleTamanoServidor"
    // InternalCeffective.g:2243:1: ruleTamanoServidor returns [Enumerator current=null] : ( (enumLiteral_0= 'Micro' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Large' ) ) ;
    public final Enumerator ruleTamanoServidor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCeffective.g:2249:2: ( ( (enumLiteral_0= 'Micro' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Large' ) ) )
            // InternalCeffective.g:2250:2: ( (enumLiteral_0= 'Micro' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Large' ) )
            {
            // InternalCeffective.g:2250:2: ( (enumLiteral_0= 'Micro' ) | (enumLiteral_1= 'Small' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Large' ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt65=1;
                }
                break;
            case 55:
                {
                alt65=2;
                }
                break;
            case 56:
                {
                alt65=3;
                }
                break;
            case 57:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalCeffective.g:2251:3: (enumLiteral_0= 'Micro' )
                    {
                    // InternalCeffective.g:2251:3: (enumLiteral_0= 'Micro' )
                    // InternalCeffective.g:2252:4: enumLiteral_0= 'Micro'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTamanoServidorAccess().getMicroEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTamanoServidorAccess().getMicroEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:2259:3: (enumLiteral_1= 'Small' )
                    {
                    // InternalCeffective.g:2259:3: (enumLiteral_1= 'Small' )
                    // InternalCeffective.g:2260:4: enumLiteral_1= 'Small'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTamanoServidorAccess().getSmallEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTamanoServidorAccess().getSmallEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:2267:3: (enumLiteral_2= 'Medium' )
                    {
                    // InternalCeffective.g:2267:3: (enumLiteral_2= 'Medium' )
                    // InternalCeffective.g:2268:4: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTamanoServidorAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTamanoServidorAccess().getMediumEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCeffective.g:2275:3: (enumLiteral_3= 'Large' )
                    {
                    // InternalCeffective.g:2275:3: (enumLiteral_3= 'Large' )
                    // InternalCeffective.g:2276:4: enumLiteral_3= 'Large'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTamanoServidorAccess().getLargeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTamanoServidorAccess().getLargeEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTamanoServidor"


    // $ANTLR start "ruleTipoBaseDatos"
    // InternalCeffective.g:2286:1: ruleTipoBaseDatos returns [Enumerator current=null] : ( (enumLiteral_0= 'Relacional' ) | (enumLiteral_1= 'NoSql' ) ) ;
    public final Enumerator ruleTipoBaseDatos() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalCeffective.g:2292:2: ( ( (enumLiteral_0= 'Relacional' ) | (enumLiteral_1= 'NoSql' ) ) )
            // InternalCeffective.g:2293:2: ( (enumLiteral_0= 'Relacional' ) | (enumLiteral_1= 'NoSql' ) )
            {
            // InternalCeffective.g:2293:2: ( (enumLiteral_0= 'Relacional' ) | (enumLiteral_1= 'NoSql' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==58) ) {
                alt66=1;
            }
            else if ( (LA66_0==59) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalCeffective.g:2294:3: (enumLiteral_0= 'Relacional' )
                    {
                    // InternalCeffective.g:2294:3: (enumLiteral_0= 'Relacional' )
                    // InternalCeffective.g:2295:4: enumLiteral_0= 'Relacional'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTipoBaseDatosAccess().getRelacionalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoBaseDatosAccess().getRelacionalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:2302:3: (enumLiteral_1= 'NoSql' )
                    {
                    // InternalCeffective.g:2302:3: (enumLiteral_1= 'NoSql' )
                    // InternalCeffective.g:2303:4: enumLiteral_1= 'NoSql'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTipoBaseDatosAccess().getNoSqlEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoBaseDatosAccess().getNoSqlEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoBaseDatos"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000630000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000028000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000F8214000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000F8204000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000F0204000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000E0204000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x03C0000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0204000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080204000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000298214000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000298204000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000290204000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000280204000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000018B8214000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000018B8204000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000018B0204000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000018A0204000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001880204000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001080204000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000B8214000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000B8204000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000B0204000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000000A0204000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000010003004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010002004000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000040003014000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040002014000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040000014000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000040000004000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100018014000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000100018004000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000100008004000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000018014000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000018004000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0001800018010000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0001800018000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001800008000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002000000000000L});

}