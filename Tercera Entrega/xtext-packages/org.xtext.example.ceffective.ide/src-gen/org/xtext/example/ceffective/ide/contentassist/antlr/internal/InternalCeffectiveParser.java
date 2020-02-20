package org.xtext.example.ceffective.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.ceffective.services.CeffectiveGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCeffectiveParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'IST'", "'QA'", "'NFT'", "'PRD'", "'Micro'", "'Small'", "'Medium'", "'Large'", "'Relacional'", "'NoSql'", "'Ceffective'", "'{'", "'}'", "'proveedorNube'", "'ProveedorNube'", "'autenticacionUsuario'", "'nombre'", "'ambientedespliegue'", "'('", "')'", "','", "'vpc'", "'AutenticacionUsuario'", "'usuario'", "'correo'", "'ServidorAplicaciones'", "'zonaDisponibilidad'", "'zonaNombre'", "'tamano'", "'sistemaOperativo'", "'recursos'", "'Almacenamiento'", "'tamanoInicial'", "'ServidorBD'", "'tipo'", "'sistemaManejador'", "'Servidor'", "'-'", "'AutenticacionBasica'", "'password'", "'AutenticacionFirma'", "'certificado'", "'Subred'", "'cidrBlock'", "'InternetGateway'", "'GrupoSeguridad'", "'reglasSalida'", "'reglasEntrada'", "'descripcion'"
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

    	public void setGrammarAccess(CeffectiveGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCeffective"
    // InternalCeffective.g:53:1: entryRuleCeffective : ruleCeffective EOF ;
    public final void entryRuleCeffective() throws RecognitionException {
        try {
            // InternalCeffective.g:54:1: ( ruleCeffective EOF )
            // InternalCeffective.g:55:1: ruleCeffective EOF
            {
             before(grammarAccess.getCeffectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleCeffective();

            state._fsp--;

             after(grammarAccess.getCeffectiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCeffective"


    // $ANTLR start "ruleCeffective"
    // InternalCeffective.g:62:1: ruleCeffective : ( ( rule__Ceffective__Group__0 ) ) ;
    public final void ruleCeffective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:66:2: ( ( ( rule__Ceffective__Group__0 ) ) )
            // InternalCeffective.g:67:2: ( ( rule__Ceffective__Group__0 ) )
            {
            // InternalCeffective.g:67:2: ( ( rule__Ceffective__Group__0 ) )
            // InternalCeffective.g:68:3: ( rule__Ceffective__Group__0 )
            {
             before(grammarAccess.getCeffectiveAccess().getGroup()); 
            // InternalCeffective.g:69:3: ( rule__Ceffective__Group__0 )
            // InternalCeffective.g:69:4: rule__Ceffective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCeffectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCeffective"


    // $ANTLR start "entryRuleAutenticacionUsuario"
    // InternalCeffective.g:78:1: entryRuleAutenticacionUsuario : ruleAutenticacionUsuario EOF ;
    public final void entryRuleAutenticacionUsuario() throws RecognitionException {
        try {
            // InternalCeffective.g:79:1: ( ruleAutenticacionUsuario EOF )
            // InternalCeffective.g:80:1: ruleAutenticacionUsuario EOF
            {
             before(grammarAccess.getAutenticacionUsuarioRule()); 
            pushFollow(FOLLOW_1);
            ruleAutenticacionUsuario();

            state._fsp--;

             after(grammarAccess.getAutenticacionUsuarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutenticacionUsuario"


    // $ANTLR start "ruleAutenticacionUsuario"
    // InternalCeffective.g:87:1: ruleAutenticacionUsuario : ( ( rule__AutenticacionUsuario__Alternatives ) ) ;
    public final void ruleAutenticacionUsuario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:91:2: ( ( ( rule__AutenticacionUsuario__Alternatives ) ) )
            // InternalCeffective.g:92:2: ( ( rule__AutenticacionUsuario__Alternatives ) )
            {
            // InternalCeffective.g:92:2: ( ( rule__AutenticacionUsuario__Alternatives ) )
            // InternalCeffective.g:93:3: ( rule__AutenticacionUsuario__Alternatives )
            {
             before(grammarAccess.getAutenticacionUsuarioAccess().getAlternatives()); 
            // InternalCeffective.g:94:3: ( rule__AutenticacionUsuario__Alternatives )
            // InternalCeffective.g:94:4: rule__AutenticacionUsuario__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionUsuarioAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutenticacionUsuario"


    // $ANTLR start "entryRuleProveedorNube"
    // InternalCeffective.g:103:1: entryRuleProveedorNube : ruleProveedorNube EOF ;
    public final void entryRuleProveedorNube() throws RecognitionException {
        try {
            // InternalCeffective.g:104:1: ( ruleProveedorNube EOF )
            // InternalCeffective.g:105:1: ruleProveedorNube EOF
            {
             before(grammarAccess.getProveedorNubeRule()); 
            pushFollow(FOLLOW_1);
            ruleProveedorNube();

            state._fsp--;

             after(grammarAccess.getProveedorNubeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProveedorNube"


    // $ANTLR start "ruleProveedorNube"
    // InternalCeffective.g:112:1: ruleProveedorNube : ( ( rule__ProveedorNube__Group__0 ) ) ;
    public final void ruleProveedorNube() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:116:2: ( ( ( rule__ProveedorNube__Group__0 ) ) )
            // InternalCeffective.g:117:2: ( ( rule__ProveedorNube__Group__0 ) )
            {
            // InternalCeffective.g:117:2: ( ( rule__ProveedorNube__Group__0 ) )
            // InternalCeffective.g:118:3: ( rule__ProveedorNube__Group__0 )
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup()); 
            // InternalCeffective.g:119:3: ( rule__ProveedorNube__Group__0 )
            // InternalCeffective.g:119:4: rule__ProveedorNube__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProveedorNube"


    // $ANTLR start "entryRuleEString"
    // InternalCeffective.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCeffective.g:129:1: ( ruleEString EOF )
            // InternalCeffective.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCeffective.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCeffective.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCeffective.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalCeffective.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCeffective.g:144:3: ( rule__EString__Alternatives )
            // InternalCeffective.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAutenticacionUsuario_Impl"
    // InternalCeffective.g:153:1: entryRuleAutenticacionUsuario_Impl : ruleAutenticacionUsuario_Impl EOF ;
    public final void entryRuleAutenticacionUsuario_Impl() throws RecognitionException {
        try {
            // InternalCeffective.g:154:1: ( ruleAutenticacionUsuario_Impl EOF )
            // InternalCeffective.g:155:1: ruleAutenticacionUsuario_Impl EOF
            {
             before(grammarAccess.getAutenticacionUsuario_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleAutenticacionUsuario_Impl();

            state._fsp--;

             after(grammarAccess.getAutenticacionUsuario_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutenticacionUsuario_Impl"


    // $ANTLR start "ruleAutenticacionUsuario_Impl"
    // InternalCeffective.g:162:1: ruleAutenticacionUsuario_Impl : ( ( rule__AutenticacionUsuario_Impl__Group__0 ) ) ;
    public final void ruleAutenticacionUsuario_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:166:2: ( ( ( rule__AutenticacionUsuario_Impl__Group__0 ) ) )
            // InternalCeffective.g:167:2: ( ( rule__AutenticacionUsuario_Impl__Group__0 ) )
            {
            // InternalCeffective.g:167:2: ( ( rule__AutenticacionUsuario_Impl__Group__0 ) )
            // InternalCeffective.g:168:3: ( rule__AutenticacionUsuario_Impl__Group__0 )
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup()); 
            // InternalCeffective.g:169:3: ( rule__AutenticacionUsuario_Impl__Group__0 )
            // InternalCeffective.g:169:4: rule__AutenticacionUsuario_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutenticacionUsuario_Impl"


    // $ANTLR start "entryRuleServidorAplicaciones"
    // InternalCeffective.g:178:1: entryRuleServidorAplicaciones : ruleServidorAplicaciones EOF ;
    public final void entryRuleServidorAplicaciones() throws RecognitionException {
        try {
            // InternalCeffective.g:179:1: ( ruleServidorAplicaciones EOF )
            // InternalCeffective.g:180:1: ruleServidorAplicaciones EOF
            {
             before(grammarAccess.getServidorAplicacionesRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorAplicaciones();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorAplicaciones"


    // $ANTLR start "ruleServidorAplicaciones"
    // InternalCeffective.g:187:1: ruleServidorAplicaciones : ( ( rule__ServidorAplicaciones__Group__0 ) ) ;
    public final void ruleServidorAplicaciones() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:191:2: ( ( ( rule__ServidorAplicaciones__Group__0 ) ) )
            // InternalCeffective.g:192:2: ( ( rule__ServidorAplicaciones__Group__0 ) )
            {
            // InternalCeffective.g:192:2: ( ( rule__ServidorAplicaciones__Group__0 ) )
            // InternalCeffective.g:193:3: ( rule__ServidorAplicaciones__Group__0 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup()); 
            // InternalCeffective.g:194:3: ( rule__ServidorAplicaciones__Group__0 )
            // InternalCeffective.g:194:4: rule__ServidorAplicaciones__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorAplicaciones"


    // $ANTLR start "entryRuleAlmacenamiento"
    // InternalCeffective.g:203:1: entryRuleAlmacenamiento : ruleAlmacenamiento EOF ;
    public final void entryRuleAlmacenamiento() throws RecognitionException {
        try {
            // InternalCeffective.g:204:1: ( ruleAlmacenamiento EOF )
            // InternalCeffective.g:205:1: ruleAlmacenamiento EOF
            {
             before(grammarAccess.getAlmacenamientoRule()); 
            pushFollow(FOLLOW_1);
            ruleAlmacenamiento();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlmacenamiento"


    // $ANTLR start "ruleAlmacenamiento"
    // InternalCeffective.g:212:1: ruleAlmacenamiento : ( ( rule__Almacenamiento__Group__0 ) ) ;
    public final void ruleAlmacenamiento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:216:2: ( ( ( rule__Almacenamiento__Group__0 ) ) )
            // InternalCeffective.g:217:2: ( ( rule__Almacenamiento__Group__0 ) )
            {
            // InternalCeffective.g:217:2: ( ( rule__Almacenamiento__Group__0 ) )
            // InternalCeffective.g:218:3: ( rule__Almacenamiento__Group__0 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup()); 
            // InternalCeffective.g:219:3: ( rule__Almacenamiento__Group__0 )
            // InternalCeffective.g:219:4: rule__Almacenamiento__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlmacenamiento"


    // $ANTLR start "entryRuleServidorBD"
    // InternalCeffective.g:228:1: entryRuleServidorBD : ruleServidorBD EOF ;
    public final void entryRuleServidorBD() throws RecognitionException {
        try {
            // InternalCeffective.g:229:1: ( ruleServidorBD EOF )
            // InternalCeffective.g:230:1: ruleServidorBD EOF
            {
             before(grammarAccess.getServidorBDRule()); 
            pushFollow(FOLLOW_1);
            ruleServidorBD();

            state._fsp--;

             after(grammarAccess.getServidorBDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidorBD"


    // $ANTLR start "ruleServidorBD"
    // InternalCeffective.g:237:1: ruleServidorBD : ( ( rule__ServidorBD__Group__0 ) ) ;
    public final void ruleServidorBD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:241:2: ( ( ( rule__ServidorBD__Group__0 ) ) )
            // InternalCeffective.g:242:2: ( ( rule__ServidorBD__Group__0 ) )
            {
            // InternalCeffective.g:242:2: ( ( rule__ServidorBD__Group__0 ) )
            // InternalCeffective.g:243:3: ( rule__ServidorBD__Group__0 )
            {
             before(grammarAccess.getServidorBDAccess().getGroup()); 
            // InternalCeffective.g:244:3: ( rule__ServidorBD__Group__0 )
            // InternalCeffective.g:244:4: rule__ServidorBD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidorBD"


    // $ANTLR start "entryRuleServidor_Impl"
    // InternalCeffective.g:253:1: entryRuleServidor_Impl : ruleServidor_Impl EOF ;
    public final void entryRuleServidor_Impl() throws RecognitionException {
        try {
            // InternalCeffective.g:254:1: ( ruleServidor_Impl EOF )
            // InternalCeffective.g:255:1: ruleServidor_Impl EOF
            {
             before(grammarAccess.getServidor_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleServidor_Impl();

            state._fsp--;

             after(grammarAccess.getServidor_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServidor_Impl"


    // $ANTLR start "ruleServidor_Impl"
    // InternalCeffective.g:262:1: ruleServidor_Impl : ( ( rule__Servidor_Impl__Group__0 ) ) ;
    public final void ruleServidor_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:266:2: ( ( ( rule__Servidor_Impl__Group__0 ) ) )
            // InternalCeffective.g:267:2: ( ( rule__Servidor_Impl__Group__0 ) )
            {
            // InternalCeffective.g:267:2: ( ( rule__Servidor_Impl__Group__0 ) )
            // InternalCeffective.g:268:3: ( rule__Servidor_Impl__Group__0 )
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup()); 
            // InternalCeffective.g:269:3: ( rule__Servidor_Impl__Group__0 )
            // InternalCeffective.g:269:4: rule__Servidor_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServidor_Impl"


    // $ANTLR start "entryRuleEInt"
    // InternalCeffective.g:278:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalCeffective.g:279:1: ( ruleEInt EOF )
            // InternalCeffective.g:280:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCeffective.g:287:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:291:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalCeffective.g:292:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalCeffective.g:292:2: ( ( rule__EInt__Group__0 ) )
            // InternalCeffective.g:293:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalCeffective.g:294:3: ( rule__EInt__Group__0 )
            // InternalCeffective.g:294:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleAutenticacionBasica"
    // InternalCeffective.g:303:1: entryRuleAutenticacionBasica : ruleAutenticacionBasica EOF ;
    public final void entryRuleAutenticacionBasica() throws RecognitionException {
        try {
            // InternalCeffective.g:304:1: ( ruleAutenticacionBasica EOF )
            // InternalCeffective.g:305:1: ruleAutenticacionBasica EOF
            {
             before(grammarAccess.getAutenticacionBasicaRule()); 
            pushFollow(FOLLOW_1);
            ruleAutenticacionBasica();

            state._fsp--;

             after(grammarAccess.getAutenticacionBasicaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutenticacionBasica"


    // $ANTLR start "ruleAutenticacionBasica"
    // InternalCeffective.g:312:1: ruleAutenticacionBasica : ( ( rule__AutenticacionBasica__Group__0 ) ) ;
    public final void ruleAutenticacionBasica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:316:2: ( ( ( rule__AutenticacionBasica__Group__0 ) ) )
            // InternalCeffective.g:317:2: ( ( rule__AutenticacionBasica__Group__0 ) )
            {
            // InternalCeffective.g:317:2: ( ( rule__AutenticacionBasica__Group__0 ) )
            // InternalCeffective.g:318:3: ( rule__AutenticacionBasica__Group__0 )
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getGroup()); 
            // InternalCeffective.g:319:3: ( rule__AutenticacionBasica__Group__0 )
            // InternalCeffective.g:319:4: rule__AutenticacionBasica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionBasicaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutenticacionBasica"


    // $ANTLR start "entryRuleAutenticacionFirma"
    // InternalCeffective.g:328:1: entryRuleAutenticacionFirma : ruleAutenticacionFirma EOF ;
    public final void entryRuleAutenticacionFirma() throws RecognitionException {
        try {
            // InternalCeffective.g:329:1: ( ruleAutenticacionFirma EOF )
            // InternalCeffective.g:330:1: ruleAutenticacionFirma EOF
            {
             before(grammarAccess.getAutenticacionFirmaRule()); 
            pushFollow(FOLLOW_1);
            ruleAutenticacionFirma();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAutenticacionFirma"


    // $ANTLR start "ruleAutenticacionFirma"
    // InternalCeffective.g:337:1: ruleAutenticacionFirma : ( ( rule__AutenticacionFirma__Group__0 ) ) ;
    public final void ruleAutenticacionFirma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:341:2: ( ( ( rule__AutenticacionFirma__Group__0 ) ) )
            // InternalCeffective.g:342:2: ( ( rule__AutenticacionFirma__Group__0 ) )
            {
            // InternalCeffective.g:342:2: ( ( rule__AutenticacionFirma__Group__0 ) )
            // InternalCeffective.g:343:3: ( rule__AutenticacionFirma__Group__0 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup()); 
            // InternalCeffective.g:344:3: ( rule__AutenticacionFirma__Group__0 )
            // InternalCeffective.g:344:4: rule__AutenticacionFirma__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAutenticacionFirma"


    // $ANTLR start "entryRuleSubred"
    // InternalCeffective.g:353:1: entryRuleSubred : ruleSubred EOF ;
    public final void entryRuleSubred() throws RecognitionException {
        try {
            // InternalCeffective.g:354:1: ( ruleSubred EOF )
            // InternalCeffective.g:355:1: ruleSubred EOF
            {
             before(grammarAccess.getSubredRule()); 
            pushFollow(FOLLOW_1);
            ruleSubred();

            state._fsp--;

             after(grammarAccess.getSubredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubred"


    // $ANTLR start "ruleSubred"
    // InternalCeffective.g:362:1: ruleSubred : ( ( rule__Subred__Group__0 ) ) ;
    public final void ruleSubred() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:366:2: ( ( ( rule__Subred__Group__0 ) ) )
            // InternalCeffective.g:367:2: ( ( rule__Subred__Group__0 ) )
            {
            // InternalCeffective.g:367:2: ( ( rule__Subred__Group__0 ) )
            // InternalCeffective.g:368:3: ( rule__Subred__Group__0 )
            {
             before(grammarAccess.getSubredAccess().getGroup()); 
            // InternalCeffective.g:369:3: ( rule__Subred__Group__0 )
            // InternalCeffective.g:369:4: rule__Subred__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubred"


    // $ANTLR start "entryRuleInternetGateway"
    // InternalCeffective.g:378:1: entryRuleInternetGateway : ruleInternetGateway EOF ;
    public final void entryRuleInternetGateway() throws RecognitionException {
        try {
            // InternalCeffective.g:379:1: ( ruleInternetGateway EOF )
            // InternalCeffective.g:380:1: ruleInternetGateway EOF
            {
             before(grammarAccess.getInternetGatewayRule()); 
            pushFollow(FOLLOW_1);
            ruleInternetGateway();

            state._fsp--;

             after(grammarAccess.getInternetGatewayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInternetGateway"


    // $ANTLR start "ruleInternetGateway"
    // InternalCeffective.g:387:1: ruleInternetGateway : ( ( rule__InternetGateway__Group__0 ) ) ;
    public final void ruleInternetGateway() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:391:2: ( ( ( rule__InternetGateway__Group__0 ) ) )
            // InternalCeffective.g:392:2: ( ( rule__InternetGateway__Group__0 ) )
            {
            // InternalCeffective.g:392:2: ( ( rule__InternetGateway__Group__0 ) )
            // InternalCeffective.g:393:3: ( rule__InternetGateway__Group__0 )
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup()); 
            // InternalCeffective.g:394:3: ( rule__InternetGateway__Group__0 )
            // InternalCeffective.g:394:4: rule__InternetGateway__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInternetGateway"


    // $ANTLR start "entryRuleGrupoSeguridad"
    // InternalCeffective.g:403:1: entryRuleGrupoSeguridad : ruleGrupoSeguridad EOF ;
    public final void entryRuleGrupoSeguridad() throws RecognitionException {
        try {
            // InternalCeffective.g:404:1: ( ruleGrupoSeguridad EOF )
            // InternalCeffective.g:405:1: ruleGrupoSeguridad EOF
            {
             before(grammarAccess.getGrupoSeguridadRule()); 
            pushFollow(FOLLOW_1);
            ruleGrupoSeguridad();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrupoSeguridad"


    // $ANTLR start "ruleGrupoSeguridad"
    // InternalCeffective.g:412:1: ruleGrupoSeguridad : ( ( rule__GrupoSeguridad__Group__0 ) ) ;
    public final void ruleGrupoSeguridad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:416:2: ( ( ( rule__GrupoSeguridad__Group__0 ) ) )
            // InternalCeffective.g:417:2: ( ( rule__GrupoSeguridad__Group__0 ) )
            {
            // InternalCeffective.g:417:2: ( ( rule__GrupoSeguridad__Group__0 ) )
            // InternalCeffective.g:418:3: ( rule__GrupoSeguridad__Group__0 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup()); 
            // InternalCeffective.g:419:3: ( rule__GrupoSeguridad__Group__0 )
            // InternalCeffective.g:419:4: rule__GrupoSeguridad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrupoSeguridad"


    // $ANTLR start "ruleTipoAmbiente"
    // InternalCeffective.g:428:1: ruleTipoAmbiente : ( ( rule__TipoAmbiente__Alternatives ) ) ;
    public final void ruleTipoAmbiente() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:432:1: ( ( ( rule__TipoAmbiente__Alternatives ) ) )
            // InternalCeffective.g:433:2: ( ( rule__TipoAmbiente__Alternatives ) )
            {
            // InternalCeffective.g:433:2: ( ( rule__TipoAmbiente__Alternatives ) )
            // InternalCeffective.g:434:3: ( rule__TipoAmbiente__Alternatives )
            {
             before(grammarAccess.getTipoAmbienteAccess().getAlternatives()); 
            // InternalCeffective.g:435:3: ( rule__TipoAmbiente__Alternatives )
            // InternalCeffective.g:435:4: rule__TipoAmbiente__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoAmbiente__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAmbienteAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoAmbiente"


    // $ANTLR start "ruleTamanoServidor"
    // InternalCeffective.g:444:1: ruleTamanoServidor : ( ( rule__TamanoServidor__Alternatives ) ) ;
    public final void ruleTamanoServidor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:448:1: ( ( ( rule__TamanoServidor__Alternatives ) ) )
            // InternalCeffective.g:449:2: ( ( rule__TamanoServidor__Alternatives ) )
            {
            // InternalCeffective.g:449:2: ( ( rule__TamanoServidor__Alternatives ) )
            // InternalCeffective.g:450:3: ( rule__TamanoServidor__Alternatives )
            {
             before(grammarAccess.getTamanoServidorAccess().getAlternatives()); 
            // InternalCeffective.g:451:3: ( rule__TamanoServidor__Alternatives )
            // InternalCeffective.g:451:4: rule__TamanoServidor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TamanoServidor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTamanoServidorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTamanoServidor"


    // $ANTLR start "ruleTipoBaseDatos"
    // InternalCeffective.g:460:1: ruleTipoBaseDatos : ( ( rule__TipoBaseDatos__Alternatives ) ) ;
    public final void ruleTipoBaseDatos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:464:1: ( ( ( rule__TipoBaseDatos__Alternatives ) ) )
            // InternalCeffective.g:465:2: ( ( rule__TipoBaseDatos__Alternatives ) )
            {
            // InternalCeffective.g:465:2: ( ( rule__TipoBaseDatos__Alternatives ) )
            // InternalCeffective.g:466:3: ( rule__TipoBaseDatos__Alternatives )
            {
             before(grammarAccess.getTipoBaseDatosAccess().getAlternatives()); 
            // InternalCeffective.g:467:3: ( rule__TipoBaseDatos__Alternatives )
            // InternalCeffective.g:467:4: rule__TipoBaseDatos__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoBaseDatos__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoBaseDatosAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoBaseDatos"


    // $ANTLR start "rule__AutenticacionUsuario__Alternatives"
    // InternalCeffective.g:475:1: rule__AutenticacionUsuario__Alternatives : ( ( ruleAutenticacionUsuario_Impl ) | ( ruleAutenticacionBasica ) | ( ruleAutenticacionFirma ) );
    public final void rule__AutenticacionUsuario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:479:1: ( ( ruleAutenticacionUsuario_Impl ) | ( ruleAutenticacionBasica ) | ( ruleAutenticacionFirma ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt1=1;
                }
                break;
            case 49:
                {
                alt1=2;
                }
                break;
            case 51:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCeffective.g:480:2: ( ruleAutenticacionUsuario_Impl )
                    {
                    // InternalCeffective.g:480:2: ( ruleAutenticacionUsuario_Impl )
                    // InternalCeffective.g:481:3: ruleAutenticacionUsuario_Impl
                    {
                     before(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionUsuario_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAutenticacionUsuario_Impl();

                    state._fsp--;

                     after(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionUsuario_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:486:2: ( ruleAutenticacionBasica )
                    {
                    // InternalCeffective.g:486:2: ( ruleAutenticacionBasica )
                    // InternalCeffective.g:487:3: ruleAutenticacionBasica
                    {
                     before(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionBasicaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAutenticacionBasica();

                    state._fsp--;

                     after(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionBasicaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:492:2: ( ruleAutenticacionFirma )
                    {
                    // InternalCeffective.g:492:2: ( ruleAutenticacionFirma )
                    // InternalCeffective.g:493:3: ruleAutenticacionFirma
                    {
                     before(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionFirmaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAutenticacionFirma();

                    state._fsp--;

                     after(grammarAccess.getAutenticacionUsuarioAccess().getAutenticacionFirmaParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCeffective.g:502:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:506:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCeffective.g:507:2: ( RULE_STRING )
                    {
                    // InternalCeffective.g:507:2: ( RULE_STRING )
                    // InternalCeffective.g:508:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:513:2: ( RULE_ID )
                    {
                    // InternalCeffective.g:513:2: ( RULE_ID )
                    // InternalCeffective.g:514:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TipoAmbiente__Alternatives"
    // InternalCeffective.g:523:1: rule__TipoAmbiente__Alternatives : ( ( ( 'IST' ) ) | ( ( 'QA' ) ) | ( ( 'NFT' ) ) | ( ( 'PRD' ) ) );
    public final void rule__TipoAmbiente__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:527:1: ( ( ( 'IST' ) ) | ( ( 'QA' ) ) | ( ( 'NFT' ) ) | ( ( 'PRD' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalCeffective.g:528:2: ( ( 'IST' ) )
                    {
                    // InternalCeffective.g:528:2: ( ( 'IST' ) )
                    // InternalCeffective.g:529:3: ( 'IST' )
                    {
                     before(grammarAccess.getTipoAmbienteAccess().getISTEnumLiteralDeclaration_0()); 
                    // InternalCeffective.g:530:3: ( 'IST' )
                    // InternalCeffective.g:530:4: 'IST'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAmbienteAccess().getISTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:534:2: ( ( 'QA' ) )
                    {
                    // InternalCeffective.g:534:2: ( ( 'QA' ) )
                    // InternalCeffective.g:535:3: ( 'QA' )
                    {
                     before(grammarAccess.getTipoAmbienteAccess().getQAEnumLiteralDeclaration_1()); 
                    // InternalCeffective.g:536:3: ( 'QA' )
                    // InternalCeffective.g:536:4: 'QA'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAmbienteAccess().getQAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:540:2: ( ( 'NFT' ) )
                    {
                    // InternalCeffective.g:540:2: ( ( 'NFT' ) )
                    // InternalCeffective.g:541:3: ( 'NFT' )
                    {
                     before(grammarAccess.getTipoAmbienteAccess().getNFTEnumLiteralDeclaration_2()); 
                    // InternalCeffective.g:542:3: ( 'NFT' )
                    // InternalCeffective.g:542:4: 'NFT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAmbienteAccess().getNFTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCeffective.g:546:2: ( ( 'PRD' ) )
                    {
                    // InternalCeffective.g:546:2: ( ( 'PRD' ) )
                    // InternalCeffective.g:547:3: ( 'PRD' )
                    {
                     before(grammarAccess.getTipoAmbienteAccess().getPRDEnumLiteralDeclaration_3()); 
                    // InternalCeffective.g:548:3: ( 'PRD' )
                    // InternalCeffective.g:548:4: 'PRD'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAmbienteAccess().getPRDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAmbiente__Alternatives"


    // $ANTLR start "rule__TamanoServidor__Alternatives"
    // InternalCeffective.g:556:1: rule__TamanoServidor__Alternatives : ( ( ( 'Micro' ) ) | ( ( 'Small' ) ) | ( ( 'Medium' ) ) | ( ( 'Large' ) ) );
    public final void rule__TamanoServidor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:560:1: ( ( ( 'Micro' ) ) | ( ( 'Small' ) ) | ( ( 'Medium' ) ) | ( ( 'Large' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCeffective.g:561:2: ( ( 'Micro' ) )
                    {
                    // InternalCeffective.g:561:2: ( ( 'Micro' ) )
                    // InternalCeffective.g:562:3: ( 'Micro' )
                    {
                     before(grammarAccess.getTamanoServidorAccess().getMicroEnumLiteralDeclaration_0()); 
                    // InternalCeffective.g:563:3: ( 'Micro' )
                    // InternalCeffective.g:563:4: 'Micro'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoServidorAccess().getMicroEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:567:2: ( ( 'Small' ) )
                    {
                    // InternalCeffective.g:567:2: ( ( 'Small' ) )
                    // InternalCeffective.g:568:3: ( 'Small' )
                    {
                     before(grammarAccess.getTamanoServidorAccess().getSmallEnumLiteralDeclaration_1()); 
                    // InternalCeffective.g:569:3: ( 'Small' )
                    // InternalCeffective.g:569:4: 'Small'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoServidorAccess().getSmallEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCeffective.g:573:2: ( ( 'Medium' ) )
                    {
                    // InternalCeffective.g:573:2: ( ( 'Medium' ) )
                    // InternalCeffective.g:574:3: ( 'Medium' )
                    {
                     before(grammarAccess.getTamanoServidorAccess().getMediumEnumLiteralDeclaration_2()); 
                    // InternalCeffective.g:575:3: ( 'Medium' )
                    // InternalCeffective.g:575:4: 'Medium'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoServidorAccess().getMediumEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCeffective.g:579:2: ( ( 'Large' ) )
                    {
                    // InternalCeffective.g:579:2: ( ( 'Large' ) )
                    // InternalCeffective.g:580:3: ( 'Large' )
                    {
                     before(grammarAccess.getTamanoServidorAccess().getLargeEnumLiteralDeclaration_3()); 
                    // InternalCeffective.g:581:3: ( 'Large' )
                    // InternalCeffective.g:581:4: 'Large'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTamanoServidorAccess().getLargeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TamanoServidor__Alternatives"


    // $ANTLR start "rule__TipoBaseDatos__Alternatives"
    // InternalCeffective.g:589:1: rule__TipoBaseDatos__Alternatives : ( ( ( 'Relacional' ) ) | ( ( 'NoSql' ) ) );
    public final void rule__TipoBaseDatos__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:593:1: ( ( ( 'Relacional' ) ) | ( ( 'NoSql' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalCeffective.g:594:2: ( ( 'Relacional' ) )
                    {
                    // InternalCeffective.g:594:2: ( ( 'Relacional' ) )
                    // InternalCeffective.g:595:3: ( 'Relacional' )
                    {
                     before(grammarAccess.getTipoBaseDatosAccess().getRelacionalEnumLiteralDeclaration_0()); 
                    // InternalCeffective.g:596:3: ( 'Relacional' )
                    // InternalCeffective.g:596:4: 'Relacional'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoBaseDatosAccess().getRelacionalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCeffective.g:600:2: ( ( 'NoSql' ) )
                    {
                    // InternalCeffective.g:600:2: ( ( 'NoSql' ) )
                    // InternalCeffective.g:601:3: ( 'NoSql' )
                    {
                     before(grammarAccess.getTipoBaseDatosAccess().getNoSqlEnumLiteralDeclaration_1()); 
                    // InternalCeffective.g:602:3: ( 'NoSql' )
                    // InternalCeffective.g:602:4: 'NoSql'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoBaseDatosAccess().getNoSqlEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoBaseDatos__Alternatives"


    // $ANTLR start "rule__Ceffective__Group__0"
    // InternalCeffective.g:610:1: rule__Ceffective__Group__0 : rule__Ceffective__Group__0__Impl rule__Ceffective__Group__1 ;
    public final void rule__Ceffective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:614:1: ( rule__Ceffective__Group__0__Impl rule__Ceffective__Group__1 )
            // InternalCeffective.g:615:2: rule__Ceffective__Group__0__Impl rule__Ceffective__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Ceffective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__0"


    // $ANTLR start "rule__Ceffective__Group__0__Impl"
    // InternalCeffective.g:622:1: rule__Ceffective__Group__0__Impl : ( () ) ;
    public final void rule__Ceffective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:626:1: ( ( () ) )
            // InternalCeffective.g:627:1: ( () )
            {
            // InternalCeffective.g:627:1: ( () )
            // InternalCeffective.g:628:2: ()
            {
             before(grammarAccess.getCeffectiveAccess().getCeffectiveAction_0()); 
            // InternalCeffective.g:629:2: ()
            // InternalCeffective.g:629:3: 
            {
            }

             after(grammarAccess.getCeffectiveAccess().getCeffectiveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__0__Impl"


    // $ANTLR start "rule__Ceffective__Group__1"
    // InternalCeffective.g:637:1: rule__Ceffective__Group__1 : rule__Ceffective__Group__1__Impl rule__Ceffective__Group__2 ;
    public final void rule__Ceffective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:641:1: ( rule__Ceffective__Group__1__Impl rule__Ceffective__Group__2 )
            // InternalCeffective.g:642:2: rule__Ceffective__Group__1__Impl rule__Ceffective__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Ceffective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__1"


    // $ANTLR start "rule__Ceffective__Group__1__Impl"
    // InternalCeffective.g:649:1: rule__Ceffective__Group__1__Impl : ( 'Ceffective' ) ;
    public final void rule__Ceffective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:653:1: ( ( 'Ceffective' ) )
            // InternalCeffective.g:654:1: ( 'Ceffective' )
            {
            // InternalCeffective.g:654:1: ( 'Ceffective' )
            // InternalCeffective.g:655:2: 'Ceffective'
            {
             before(grammarAccess.getCeffectiveAccess().getCeffectiveKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCeffectiveAccess().getCeffectiveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__1__Impl"


    // $ANTLR start "rule__Ceffective__Group__2"
    // InternalCeffective.g:664:1: rule__Ceffective__Group__2 : rule__Ceffective__Group__2__Impl rule__Ceffective__Group__3 ;
    public final void rule__Ceffective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:668:1: ( rule__Ceffective__Group__2__Impl rule__Ceffective__Group__3 )
            // InternalCeffective.g:669:2: rule__Ceffective__Group__2__Impl rule__Ceffective__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Ceffective__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__2"


    // $ANTLR start "rule__Ceffective__Group__2__Impl"
    // InternalCeffective.g:676:1: rule__Ceffective__Group__2__Impl : ( '{' ) ;
    public final void rule__Ceffective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:680:1: ( ( '{' ) )
            // InternalCeffective.g:681:1: ( '{' )
            {
            // InternalCeffective.g:681:1: ( '{' )
            // InternalCeffective.g:682:2: '{'
            {
             before(grammarAccess.getCeffectiveAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCeffectiveAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__2__Impl"


    // $ANTLR start "rule__Ceffective__Group__3"
    // InternalCeffective.g:691:1: rule__Ceffective__Group__3 : rule__Ceffective__Group__3__Impl rule__Ceffective__Group__4 ;
    public final void rule__Ceffective__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:695:1: ( rule__Ceffective__Group__3__Impl rule__Ceffective__Group__4 )
            // InternalCeffective.g:696:2: rule__Ceffective__Group__3__Impl rule__Ceffective__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Ceffective__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__3"


    // $ANTLR start "rule__Ceffective__Group__3__Impl"
    // InternalCeffective.g:703:1: rule__Ceffective__Group__3__Impl : ( ( rule__Ceffective__Group_3__0 )? ) ;
    public final void rule__Ceffective__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:707:1: ( ( ( rule__Ceffective__Group_3__0 )? ) )
            // InternalCeffective.g:708:1: ( ( rule__Ceffective__Group_3__0 )? )
            {
            // InternalCeffective.g:708:1: ( ( rule__Ceffective__Group_3__0 )? )
            // InternalCeffective.g:709:2: ( rule__Ceffective__Group_3__0 )?
            {
             before(grammarAccess.getCeffectiveAccess().getGroup_3()); 
            // InternalCeffective.g:710:2: ( rule__Ceffective__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCeffective.g:710:3: rule__Ceffective__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ceffective__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCeffectiveAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__3__Impl"


    // $ANTLR start "rule__Ceffective__Group__4"
    // InternalCeffective.g:718:1: rule__Ceffective__Group__4 : rule__Ceffective__Group__4__Impl ;
    public final void rule__Ceffective__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:722:1: ( rule__Ceffective__Group__4__Impl )
            // InternalCeffective.g:723:2: rule__Ceffective__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ceffective__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__4"


    // $ANTLR start "rule__Ceffective__Group__4__Impl"
    // InternalCeffective.g:729:1: rule__Ceffective__Group__4__Impl : ( '}' ) ;
    public final void rule__Ceffective__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:733:1: ( ( '}' ) )
            // InternalCeffective.g:734:1: ( '}' )
            {
            // InternalCeffective.g:734:1: ( '}' )
            // InternalCeffective.g:735:2: '}'
            {
             before(grammarAccess.getCeffectiveAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCeffectiveAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group__4__Impl"


    // $ANTLR start "rule__Ceffective__Group_3__0"
    // InternalCeffective.g:745:1: rule__Ceffective__Group_3__0 : rule__Ceffective__Group_3__0__Impl rule__Ceffective__Group_3__1 ;
    public final void rule__Ceffective__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:749:1: ( rule__Ceffective__Group_3__0__Impl rule__Ceffective__Group_3__1 )
            // InternalCeffective.g:750:2: rule__Ceffective__Group_3__0__Impl rule__Ceffective__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Ceffective__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ceffective__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group_3__0"


    // $ANTLR start "rule__Ceffective__Group_3__0__Impl"
    // InternalCeffective.g:757:1: rule__Ceffective__Group_3__0__Impl : ( 'proveedorNube' ) ;
    public final void rule__Ceffective__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:761:1: ( ( 'proveedorNube' ) )
            // InternalCeffective.g:762:1: ( 'proveedorNube' )
            {
            // InternalCeffective.g:762:1: ( 'proveedorNube' )
            // InternalCeffective.g:763:2: 'proveedorNube'
            {
             before(grammarAccess.getCeffectiveAccess().getProveedorNubeKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCeffectiveAccess().getProveedorNubeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group_3__0__Impl"


    // $ANTLR start "rule__Ceffective__Group_3__1"
    // InternalCeffective.g:772:1: rule__Ceffective__Group_3__1 : rule__Ceffective__Group_3__1__Impl ;
    public final void rule__Ceffective__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:776:1: ( rule__Ceffective__Group_3__1__Impl )
            // InternalCeffective.g:777:2: rule__Ceffective__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ceffective__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group_3__1"


    // $ANTLR start "rule__Ceffective__Group_3__1__Impl"
    // InternalCeffective.g:783:1: rule__Ceffective__Group_3__1__Impl : ( ( rule__Ceffective__ProveedorNubeAssignment_3_1 ) ) ;
    public final void rule__Ceffective__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:787:1: ( ( ( rule__Ceffective__ProveedorNubeAssignment_3_1 ) ) )
            // InternalCeffective.g:788:1: ( ( rule__Ceffective__ProveedorNubeAssignment_3_1 ) )
            {
            // InternalCeffective.g:788:1: ( ( rule__Ceffective__ProveedorNubeAssignment_3_1 ) )
            // InternalCeffective.g:789:2: ( rule__Ceffective__ProveedorNubeAssignment_3_1 )
            {
             before(grammarAccess.getCeffectiveAccess().getProveedorNubeAssignment_3_1()); 
            // InternalCeffective.g:790:2: ( rule__Ceffective__ProveedorNubeAssignment_3_1 )
            // InternalCeffective.g:790:3: rule__Ceffective__ProveedorNubeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Ceffective__ProveedorNubeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCeffectiveAccess().getProveedorNubeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__Group_3__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__0"
    // InternalCeffective.g:799:1: rule__ProveedorNube__Group__0 : rule__ProveedorNube__Group__0__Impl rule__ProveedorNube__Group__1 ;
    public final void rule__ProveedorNube__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:803:1: ( rule__ProveedorNube__Group__0__Impl rule__ProveedorNube__Group__1 )
            // InternalCeffective.g:804:2: rule__ProveedorNube__Group__0__Impl rule__ProveedorNube__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ProveedorNube__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__0"


    // $ANTLR start "rule__ProveedorNube__Group__0__Impl"
    // InternalCeffective.g:811:1: rule__ProveedorNube__Group__0__Impl : ( 'ProveedorNube' ) ;
    public final void rule__ProveedorNube__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:815:1: ( ( 'ProveedorNube' ) )
            // InternalCeffective.g:816:1: ( 'ProveedorNube' )
            {
            // InternalCeffective.g:816:1: ( 'ProveedorNube' )
            // InternalCeffective.g:817:2: 'ProveedorNube'
            {
             before(grammarAccess.getProveedorNubeAccess().getProveedorNubeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getProveedorNubeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__1"
    // InternalCeffective.g:826:1: rule__ProveedorNube__Group__1 : rule__ProveedorNube__Group__1__Impl rule__ProveedorNube__Group__2 ;
    public final void rule__ProveedorNube__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:830:1: ( rule__ProveedorNube__Group__1__Impl rule__ProveedorNube__Group__2 )
            // InternalCeffective.g:831:2: rule__ProveedorNube__Group__1__Impl rule__ProveedorNube__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ProveedorNube__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__1"


    // $ANTLR start "rule__ProveedorNube__Group__1__Impl"
    // InternalCeffective.g:838:1: rule__ProveedorNube__Group__1__Impl : ( '{' ) ;
    public final void rule__ProveedorNube__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:842:1: ( ( '{' ) )
            // InternalCeffective.g:843:1: ( '{' )
            {
            // InternalCeffective.g:843:1: ( '{' )
            // InternalCeffective.g:844:2: '{'
            {
             before(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__2"
    // InternalCeffective.g:853:1: rule__ProveedorNube__Group__2 : rule__ProveedorNube__Group__2__Impl rule__ProveedorNube__Group__3 ;
    public final void rule__ProveedorNube__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:857:1: ( rule__ProveedorNube__Group__2__Impl rule__ProveedorNube__Group__3 )
            // InternalCeffective.g:858:2: rule__ProveedorNube__Group__2__Impl rule__ProveedorNube__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ProveedorNube__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__2"


    // $ANTLR start "rule__ProveedorNube__Group__2__Impl"
    // InternalCeffective.g:865:1: rule__ProveedorNube__Group__2__Impl : ( ( rule__ProveedorNube__Group_2__0 )? ) ;
    public final void rule__ProveedorNube__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:869:1: ( ( ( rule__ProveedorNube__Group_2__0 )? ) )
            // InternalCeffective.g:870:1: ( ( rule__ProveedorNube__Group_2__0 )? )
            {
            // InternalCeffective.g:870:1: ( ( rule__ProveedorNube__Group_2__0 )? )
            // InternalCeffective.g:871:2: ( rule__ProveedorNube__Group_2__0 )?
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_2()); 
            // InternalCeffective.g:872:2: ( rule__ProveedorNube__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCeffective.g:872:3: rule__ProveedorNube__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProveedorNube__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProveedorNubeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__2__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__3"
    // InternalCeffective.g:880:1: rule__ProveedorNube__Group__3 : rule__ProveedorNube__Group__3__Impl rule__ProveedorNube__Group__4 ;
    public final void rule__ProveedorNube__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:884:1: ( rule__ProveedorNube__Group__3__Impl rule__ProveedorNube__Group__4 )
            // InternalCeffective.g:885:2: rule__ProveedorNube__Group__3__Impl rule__ProveedorNube__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ProveedorNube__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__3"


    // $ANTLR start "rule__ProveedorNube__Group__3__Impl"
    // InternalCeffective.g:892:1: rule__ProveedorNube__Group__3__Impl : ( ( rule__ProveedorNube__Group_3__0 )? ) ;
    public final void rule__ProveedorNube__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:896:1: ( ( ( rule__ProveedorNube__Group_3__0 )? ) )
            // InternalCeffective.g:897:1: ( ( rule__ProveedorNube__Group_3__0 )? )
            {
            // InternalCeffective.g:897:1: ( ( rule__ProveedorNube__Group_3__0 )? )
            // InternalCeffective.g:898:2: ( rule__ProveedorNube__Group_3__0 )?
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_3()); 
            // InternalCeffective.g:899:2: ( rule__ProveedorNube__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCeffective.g:899:3: rule__ProveedorNube__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProveedorNube__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProveedorNubeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__3__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__4"
    // InternalCeffective.g:907:1: rule__ProveedorNube__Group__4 : rule__ProveedorNube__Group__4__Impl rule__ProveedorNube__Group__5 ;
    public final void rule__ProveedorNube__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:911:1: ( rule__ProveedorNube__Group__4__Impl rule__ProveedorNube__Group__5 )
            // InternalCeffective.g:912:2: rule__ProveedorNube__Group__4__Impl rule__ProveedorNube__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__ProveedorNube__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__4"


    // $ANTLR start "rule__ProveedorNube__Group__4__Impl"
    // InternalCeffective.g:919:1: rule__ProveedorNube__Group__4__Impl : ( ( rule__ProveedorNube__Group_4__0 )? ) ;
    public final void rule__ProveedorNube__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:923:1: ( ( ( rule__ProveedorNube__Group_4__0 )? ) )
            // InternalCeffective.g:924:1: ( ( rule__ProveedorNube__Group_4__0 )? )
            {
            // InternalCeffective.g:924:1: ( ( rule__ProveedorNube__Group_4__0 )? )
            // InternalCeffective.g:925:2: ( rule__ProveedorNube__Group_4__0 )?
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_4()); 
            // InternalCeffective.g:926:2: ( rule__ProveedorNube__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCeffective.g:926:3: rule__ProveedorNube__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ProveedorNube__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProveedorNubeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__4__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__5"
    // InternalCeffective.g:934:1: rule__ProveedorNube__Group__5 : rule__ProveedorNube__Group__5__Impl rule__ProveedorNube__Group__6 ;
    public final void rule__ProveedorNube__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:938:1: ( rule__ProveedorNube__Group__5__Impl rule__ProveedorNube__Group__6 )
            // InternalCeffective.g:939:2: rule__ProveedorNube__Group__5__Impl rule__ProveedorNube__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__ProveedorNube__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__5"


    // $ANTLR start "rule__ProveedorNube__Group__5__Impl"
    // InternalCeffective.g:946:1: rule__ProveedorNube__Group__5__Impl : ( 'autenticacionUsuario' ) ;
    public final void rule__ProveedorNube__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:950:1: ( ( 'autenticacionUsuario' ) )
            // InternalCeffective.g:951:1: ( 'autenticacionUsuario' )
            {
            // InternalCeffective.g:951:1: ( 'autenticacionUsuario' )
            // InternalCeffective.g:952:2: 'autenticacionUsuario'
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__5__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__6"
    // InternalCeffective.g:961:1: rule__ProveedorNube__Group__6 : rule__ProveedorNube__Group__6__Impl rule__ProveedorNube__Group__7 ;
    public final void rule__ProveedorNube__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:965:1: ( rule__ProveedorNube__Group__6__Impl rule__ProveedorNube__Group__7 )
            // InternalCeffective.g:966:2: rule__ProveedorNube__Group__6__Impl rule__ProveedorNube__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__ProveedorNube__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__6"


    // $ANTLR start "rule__ProveedorNube__Group__6__Impl"
    // InternalCeffective.g:973:1: rule__ProveedorNube__Group__6__Impl : ( '{' ) ;
    public final void rule__ProveedorNube__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:977:1: ( ( '{' ) )
            // InternalCeffective.g:978:1: ( '{' )
            {
            // InternalCeffective.g:978:1: ( '{' )
            // InternalCeffective.g:979:2: '{'
            {
             before(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__6__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__7"
    // InternalCeffective.g:988:1: rule__ProveedorNube__Group__7 : rule__ProveedorNube__Group__7__Impl rule__ProveedorNube__Group__8 ;
    public final void rule__ProveedorNube__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:992:1: ( rule__ProveedorNube__Group__7__Impl rule__ProveedorNube__Group__8 )
            // InternalCeffective.g:993:2: rule__ProveedorNube__Group__7__Impl rule__ProveedorNube__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__ProveedorNube__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__7"


    // $ANTLR start "rule__ProveedorNube__Group__7__Impl"
    // InternalCeffective.g:1000:1: rule__ProveedorNube__Group__7__Impl : ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7 ) ) ;
    public final void rule__ProveedorNube__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1004:1: ( ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7 ) ) )
            // InternalCeffective.g:1005:1: ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7 ) )
            {
            // InternalCeffective.g:1005:1: ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7 ) )
            // InternalCeffective.g:1006:2: ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7 )
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAssignment_7()); 
            // InternalCeffective.g:1007:2: ( rule__ProveedorNube__AutenticacionUsuarioAssignment_7 )
            // InternalCeffective.g:1007:3: rule__ProveedorNube__AutenticacionUsuarioAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__AutenticacionUsuarioAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__7__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__8"
    // InternalCeffective.g:1015:1: rule__ProveedorNube__Group__8 : rule__ProveedorNube__Group__8__Impl rule__ProveedorNube__Group__9 ;
    public final void rule__ProveedorNube__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1019:1: ( rule__ProveedorNube__Group__8__Impl rule__ProveedorNube__Group__9 )
            // InternalCeffective.g:1020:2: rule__ProveedorNube__Group__8__Impl rule__ProveedorNube__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__ProveedorNube__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__8"


    // $ANTLR start "rule__ProveedorNube__Group__8__Impl"
    // InternalCeffective.g:1027:1: rule__ProveedorNube__Group__8__Impl : ( ( rule__ProveedorNube__Group_8__0 )* ) ;
    public final void rule__ProveedorNube__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1031:1: ( ( ( rule__ProveedorNube__Group_8__0 )* ) )
            // InternalCeffective.g:1032:1: ( ( rule__ProveedorNube__Group_8__0 )* )
            {
            // InternalCeffective.g:1032:1: ( ( rule__ProveedorNube__Group_8__0 )* )
            // InternalCeffective.g:1033:2: ( rule__ProveedorNube__Group_8__0 )*
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_8()); 
            // InternalCeffective.g:1034:2: ( rule__ProveedorNube__Group_8__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCeffective.g:1034:3: rule__ProveedorNube__Group_8__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProveedorNube__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getProveedorNubeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__8__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__9"
    // InternalCeffective.g:1042:1: rule__ProveedorNube__Group__9 : rule__ProveedorNube__Group__9__Impl rule__ProveedorNube__Group__10 ;
    public final void rule__ProveedorNube__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1046:1: ( rule__ProveedorNube__Group__9__Impl rule__ProveedorNube__Group__10 )
            // InternalCeffective.g:1047:2: rule__ProveedorNube__Group__9__Impl rule__ProveedorNube__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__ProveedorNube__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__9"


    // $ANTLR start "rule__ProveedorNube__Group__9__Impl"
    // InternalCeffective.g:1054:1: rule__ProveedorNube__Group__9__Impl : ( '}' ) ;
    public final void rule__ProveedorNube__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1058:1: ( ( '}' ) )
            // InternalCeffective.g:1059:1: ( '}' )
            {
            // InternalCeffective.g:1059:1: ( '}' )
            // InternalCeffective.g:1060:2: '}'
            {
             before(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__9__Impl"


    // $ANTLR start "rule__ProveedorNube__Group__10"
    // InternalCeffective.g:1069:1: rule__ProveedorNube__Group__10 : rule__ProveedorNube__Group__10__Impl ;
    public final void rule__ProveedorNube__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1073:1: ( rule__ProveedorNube__Group__10__Impl )
            // InternalCeffective.g:1074:2: rule__ProveedorNube__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__10"


    // $ANTLR start "rule__ProveedorNube__Group__10__Impl"
    // InternalCeffective.g:1080:1: rule__ProveedorNube__Group__10__Impl : ( '}' ) ;
    public final void rule__ProveedorNube__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1084:1: ( ( '}' ) )
            // InternalCeffective.g:1085:1: ( '}' )
            {
            // InternalCeffective.g:1085:1: ( '}' )
            // InternalCeffective.g:1086:2: '}'
            {
             before(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group__10__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_2__0"
    // InternalCeffective.g:1096:1: rule__ProveedorNube__Group_2__0 : rule__ProveedorNube__Group_2__0__Impl rule__ProveedorNube__Group_2__1 ;
    public final void rule__ProveedorNube__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1100:1: ( rule__ProveedorNube__Group_2__0__Impl rule__ProveedorNube__Group_2__1 )
            // InternalCeffective.g:1101:2: rule__ProveedorNube__Group_2__0__Impl rule__ProveedorNube__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__ProveedorNube__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_2__0"


    // $ANTLR start "rule__ProveedorNube__Group_2__0__Impl"
    // InternalCeffective.g:1108:1: rule__ProveedorNube__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__ProveedorNube__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1112:1: ( ( 'nombre' ) )
            // InternalCeffective.g:1113:1: ( 'nombre' )
            {
            // InternalCeffective.g:1113:1: ( 'nombre' )
            // InternalCeffective.g:1114:2: 'nombre'
            {
             before(grammarAccess.getProveedorNubeAccess().getNombreKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_2__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_2__1"
    // InternalCeffective.g:1123:1: rule__ProveedorNube__Group_2__1 : rule__ProveedorNube__Group_2__1__Impl ;
    public final void rule__ProveedorNube__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1127:1: ( rule__ProveedorNube__Group_2__1__Impl )
            // InternalCeffective.g:1128:2: rule__ProveedorNube__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_2__1"


    // $ANTLR start "rule__ProveedorNube__Group_2__1__Impl"
    // InternalCeffective.g:1134:1: rule__ProveedorNube__Group_2__1__Impl : ( ( rule__ProveedorNube__NombreAssignment_2_1 ) ) ;
    public final void rule__ProveedorNube__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1138:1: ( ( ( rule__ProveedorNube__NombreAssignment_2_1 ) ) )
            // InternalCeffective.g:1139:1: ( ( rule__ProveedorNube__NombreAssignment_2_1 ) )
            {
            // InternalCeffective.g:1139:1: ( ( rule__ProveedorNube__NombreAssignment_2_1 ) )
            // InternalCeffective.g:1140:2: ( rule__ProveedorNube__NombreAssignment_2_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getNombreAssignment_2_1()); 
            // InternalCeffective.g:1141:2: ( rule__ProveedorNube__NombreAssignment_2_1 )
            // InternalCeffective.g:1141:3: rule__ProveedorNube__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_2__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3__0"
    // InternalCeffective.g:1150:1: rule__ProveedorNube__Group_3__0 : rule__ProveedorNube__Group_3__0__Impl rule__ProveedorNube__Group_3__1 ;
    public final void rule__ProveedorNube__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1154:1: ( rule__ProveedorNube__Group_3__0__Impl rule__ProveedorNube__Group_3__1 )
            // InternalCeffective.g:1155:2: rule__ProveedorNube__Group_3__0__Impl rule__ProveedorNube__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ProveedorNube__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__0"


    // $ANTLR start "rule__ProveedorNube__Group_3__0__Impl"
    // InternalCeffective.g:1162:1: rule__ProveedorNube__Group_3__0__Impl : ( 'ambientedespliegue' ) ;
    public final void rule__ProveedorNube__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1166:1: ( ( 'ambientedespliegue' ) )
            // InternalCeffective.g:1167:1: ( 'ambientedespliegue' )
            {
            // InternalCeffective.g:1167:1: ( 'ambientedespliegue' )
            // InternalCeffective.g:1168:2: 'ambientedespliegue'
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3__1"
    // InternalCeffective.g:1177:1: rule__ProveedorNube__Group_3__1 : rule__ProveedorNube__Group_3__1__Impl rule__ProveedorNube__Group_3__2 ;
    public final void rule__ProveedorNube__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1181:1: ( rule__ProveedorNube__Group_3__1__Impl rule__ProveedorNube__Group_3__2 )
            // InternalCeffective.g:1182:2: rule__ProveedorNube__Group_3__1__Impl rule__ProveedorNube__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__ProveedorNube__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__1"


    // $ANTLR start "rule__ProveedorNube__Group_3__1__Impl"
    // InternalCeffective.g:1189:1: rule__ProveedorNube__Group_3__1__Impl : ( '(' ) ;
    public final void rule__ProveedorNube__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1193:1: ( ( '(' ) )
            // InternalCeffective.g:1194:1: ( '(' )
            {
            // InternalCeffective.g:1194:1: ( '(' )
            // InternalCeffective.g:1195:2: '('
            {
             before(grammarAccess.getProveedorNubeAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3__2"
    // InternalCeffective.g:1204:1: rule__ProveedorNube__Group_3__2 : rule__ProveedorNube__Group_3__2__Impl rule__ProveedorNube__Group_3__3 ;
    public final void rule__ProveedorNube__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1208:1: ( rule__ProveedorNube__Group_3__2__Impl rule__ProveedorNube__Group_3__3 )
            // InternalCeffective.g:1209:2: rule__ProveedorNube__Group_3__2__Impl rule__ProveedorNube__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__ProveedorNube__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__2"


    // $ANTLR start "rule__ProveedorNube__Group_3__2__Impl"
    // InternalCeffective.g:1216:1: rule__ProveedorNube__Group_3__2__Impl : ( ( rule__ProveedorNube__AmbientedespliegueAssignment_3_2 ) ) ;
    public final void rule__ProveedorNube__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1220:1: ( ( ( rule__ProveedorNube__AmbientedespliegueAssignment_3_2 ) ) )
            // InternalCeffective.g:1221:1: ( ( rule__ProveedorNube__AmbientedespliegueAssignment_3_2 ) )
            {
            // InternalCeffective.g:1221:1: ( ( rule__ProveedorNube__AmbientedespliegueAssignment_3_2 ) )
            // InternalCeffective.g:1222:2: ( rule__ProveedorNube__AmbientedespliegueAssignment_3_2 )
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAssignment_3_2()); 
            // InternalCeffective.g:1223:2: ( rule__ProveedorNube__AmbientedespliegueAssignment_3_2 )
            // InternalCeffective.g:1223:3: rule__ProveedorNube__AmbientedespliegueAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__AmbientedespliegueAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__2__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3__3"
    // InternalCeffective.g:1231:1: rule__ProveedorNube__Group_3__3 : rule__ProveedorNube__Group_3__3__Impl rule__ProveedorNube__Group_3__4 ;
    public final void rule__ProveedorNube__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1235:1: ( rule__ProveedorNube__Group_3__3__Impl rule__ProveedorNube__Group_3__4 )
            // InternalCeffective.g:1236:2: rule__ProveedorNube__Group_3__3__Impl rule__ProveedorNube__Group_3__4
            {
            pushFollow(FOLLOW_14);
            rule__ProveedorNube__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__3"


    // $ANTLR start "rule__ProveedorNube__Group_3__3__Impl"
    // InternalCeffective.g:1243:1: rule__ProveedorNube__Group_3__3__Impl : ( ( rule__ProveedorNube__Group_3_3__0 )* ) ;
    public final void rule__ProveedorNube__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1247:1: ( ( ( rule__ProveedorNube__Group_3_3__0 )* ) )
            // InternalCeffective.g:1248:1: ( ( rule__ProveedorNube__Group_3_3__0 )* )
            {
            // InternalCeffective.g:1248:1: ( ( rule__ProveedorNube__Group_3_3__0 )* )
            // InternalCeffective.g:1249:2: ( rule__ProveedorNube__Group_3_3__0 )*
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_3_3()); 
            // InternalCeffective.g:1250:2: ( rule__ProveedorNube__Group_3_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCeffective.g:1250:3: rule__ProveedorNube__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProveedorNube__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProveedorNubeAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__3__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3__4"
    // InternalCeffective.g:1258:1: rule__ProveedorNube__Group_3__4 : rule__ProveedorNube__Group_3__4__Impl ;
    public final void rule__ProveedorNube__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1262:1: ( rule__ProveedorNube__Group_3__4__Impl )
            // InternalCeffective.g:1263:2: rule__ProveedorNube__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__4"


    // $ANTLR start "rule__ProveedorNube__Group_3__4__Impl"
    // InternalCeffective.g:1269:1: rule__ProveedorNube__Group_3__4__Impl : ( ')' ) ;
    public final void rule__ProveedorNube__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1273:1: ( ( ')' ) )
            // InternalCeffective.g:1274:1: ( ')' )
            {
            // InternalCeffective.g:1274:1: ( ')' )
            // InternalCeffective.g:1275:2: ')'
            {
             before(grammarAccess.getProveedorNubeAccess().getRightParenthesisKeyword_3_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3__4__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3_3__0"
    // InternalCeffective.g:1285:1: rule__ProveedorNube__Group_3_3__0 : rule__ProveedorNube__Group_3_3__0__Impl rule__ProveedorNube__Group_3_3__1 ;
    public final void rule__ProveedorNube__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1289:1: ( rule__ProveedorNube__Group_3_3__0__Impl rule__ProveedorNube__Group_3_3__1 )
            // InternalCeffective.g:1290:2: rule__ProveedorNube__Group_3_3__0__Impl rule__ProveedorNube__Group_3_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ProveedorNube__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3_3__0"


    // $ANTLR start "rule__ProveedorNube__Group_3_3__0__Impl"
    // InternalCeffective.g:1297:1: rule__ProveedorNube__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__ProveedorNube__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1301:1: ( ( ',' ) )
            // InternalCeffective.g:1302:1: ( ',' )
            {
            // InternalCeffective.g:1302:1: ( ',' )
            // InternalCeffective.g:1303:2: ','
            {
             before(grammarAccess.getProveedorNubeAccess().getCommaKeyword_3_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3_3__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_3_3__1"
    // InternalCeffective.g:1312:1: rule__ProveedorNube__Group_3_3__1 : rule__ProveedorNube__Group_3_3__1__Impl ;
    public final void rule__ProveedorNube__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1316:1: ( rule__ProveedorNube__Group_3_3__1__Impl )
            // InternalCeffective.g:1317:2: rule__ProveedorNube__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3_3__1"


    // $ANTLR start "rule__ProveedorNube__Group_3_3__1__Impl"
    // InternalCeffective.g:1323:1: rule__ProveedorNube__Group_3_3__1__Impl : ( ( rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1 ) ) ;
    public final void rule__ProveedorNube__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1327:1: ( ( ( rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1 ) ) )
            // InternalCeffective.g:1328:1: ( ( rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1 ) )
            {
            // InternalCeffective.g:1328:1: ( ( rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1 ) )
            // InternalCeffective.g:1329:2: ( rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAssignment_3_3_1()); 
            // InternalCeffective.g:1330:2: ( rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1 )
            // InternalCeffective.g:1330:3: rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_3_3__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_4__0"
    // InternalCeffective.g:1339:1: rule__ProveedorNube__Group_4__0 : rule__ProveedorNube__Group_4__0__Impl rule__ProveedorNube__Group_4__1 ;
    public final void rule__ProveedorNube__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1343:1: ( rule__ProveedorNube__Group_4__0__Impl rule__ProveedorNube__Group_4__1 )
            // InternalCeffective.g:1344:2: rule__ProveedorNube__Group_4__0__Impl rule__ProveedorNube__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ProveedorNube__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__0"


    // $ANTLR start "rule__ProveedorNube__Group_4__0__Impl"
    // InternalCeffective.g:1351:1: rule__ProveedorNube__Group_4__0__Impl : ( 'vpc' ) ;
    public final void rule__ProveedorNube__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1355:1: ( ( 'vpc' ) )
            // InternalCeffective.g:1356:1: ( 'vpc' )
            {
            // InternalCeffective.g:1356:1: ( 'vpc' )
            // InternalCeffective.g:1357:2: 'vpc'
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getVpcKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_4__1"
    // InternalCeffective.g:1366:1: rule__ProveedorNube__Group_4__1 : rule__ProveedorNube__Group_4__1__Impl rule__ProveedorNube__Group_4__2 ;
    public final void rule__ProveedorNube__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1370:1: ( rule__ProveedorNube__Group_4__1__Impl rule__ProveedorNube__Group_4__2 )
            // InternalCeffective.g:1371:2: rule__ProveedorNube__Group_4__1__Impl rule__ProveedorNube__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__ProveedorNube__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__1"


    // $ANTLR start "rule__ProveedorNube__Group_4__1__Impl"
    // InternalCeffective.g:1378:1: rule__ProveedorNube__Group_4__1__Impl : ( '(' ) ;
    public final void rule__ProveedorNube__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1382:1: ( ( '(' ) )
            // InternalCeffective.g:1383:1: ( '(' )
            {
            // InternalCeffective.g:1383:1: ( '(' )
            // InternalCeffective.g:1384:2: '('
            {
             before(grammarAccess.getProveedorNubeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_4__2"
    // InternalCeffective.g:1393:1: rule__ProveedorNube__Group_4__2 : rule__ProveedorNube__Group_4__2__Impl rule__ProveedorNube__Group_4__3 ;
    public final void rule__ProveedorNube__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1397:1: ( rule__ProveedorNube__Group_4__2__Impl rule__ProveedorNube__Group_4__3 )
            // InternalCeffective.g:1398:2: rule__ProveedorNube__Group_4__2__Impl rule__ProveedorNube__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__ProveedorNube__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__2"


    // $ANTLR start "rule__ProveedorNube__Group_4__2__Impl"
    // InternalCeffective.g:1405:1: rule__ProveedorNube__Group_4__2__Impl : ( ( rule__ProveedorNube__VpcAssignment_4_2 ) ) ;
    public final void rule__ProveedorNube__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1409:1: ( ( ( rule__ProveedorNube__VpcAssignment_4_2 ) ) )
            // InternalCeffective.g:1410:1: ( ( rule__ProveedorNube__VpcAssignment_4_2 ) )
            {
            // InternalCeffective.g:1410:1: ( ( rule__ProveedorNube__VpcAssignment_4_2 ) )
            // InternalCeffective.g:1411:2: ( rule__ProveedorNube__VpcAssignment_4_2 )
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcAssignment_4_2()); 
            // InternalCeffective.g:1412:2: ( rule__ProveedorNube__VpcAssignment_4_2 )
            // InternalCeffective.g:1412:3: rule__ProveedorNube__VpcAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__VpcAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getVpcAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__2__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_4__3"
    // InternalCeffective.g:1420:1: rule__ProveedorNube__Group_4__3 : rule__ProveedorNube__Group_4__3__Impl rule__ProveedorNube__Group_4__4 ;
    public final void rule__ProveedorNube__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1424:1: ( rule__ProveedorNube__Group_4__3__Impl rule__ProveedorNube__Group_4__4 )
            // InternalCeffective.g:1425:2: rule__ProveedorNube__Group_4__3__Impl rule__ProveedorNube__Group_4__4
            {
            pushFollow(FOLLOW_14);
            rule__ProveedorNube__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__3"


    // $ANTLR start "rule__ProveedorNube__Group_4__3__Impl"
    // InternalCeffective.g:1432:1: rule__ProveedorNube__Group_4__3__Impl : ( ( rule__ProveedorNube__Group_4_3__0 )* ) ;
    public final void rule__ProveedorNube__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1436:1: ( ( ( rule__ProveedorNube__Group_4_3__0 )* ) )
            // InternalCeffective.g:1437:1: ( ( rule__ProveedorNube__Group_4_3__0 )* )
            {
            // InternalCeffective.g:1437:1: ( ( rule__ProveedorNube__Group_4_3__0 )* )
            // InternalCeffective.g:1438:2: ( rule__ProveedorNube__Group_4_3__0 )*
            {
             before(grammarAccess.getProveedorNubeAccess().getGroup_4_3()); 
            // InternalCeffective.g:1439:2: ( rule__ProveedorNube__Group_4_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCeffective.g:1439:3: rule__ProveedorNube__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ProveedorNube__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getProveedorNubeAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__3__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_4__4"
    // InternalCeffective.g:1447:1: rule__ProveedorNube__Group_4__4 : rule__ProveedorNube__Group_4__4__Impl ;
    public final void rule__ProveedorNube__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1451:1: ( rule__ProveedorNube__Group_4__4__Impl )
            // InternalCeffective.g:1452:2: rule__ProveedorNube__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__4"


    // $ANTLR start "rule__ProveedorNube__Group_4__4__Impl"
    // InternalCeffective.g:1458:1: rule__ProveedorNube__Group_4__4__Impl : ( ')' ) ;
    public final void rule__ProveedorNube__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1462:1: ( ( ')' ) )
            // InternalCeffective.g:1463:1: ( ')' )
            {
            // InternalCeffective.g:1463:1: ( ')' )
            // InternalCeffective.g:1464:2: ')'
            {
             before(grammarAccess.getProveedorNubeAccess().getRightParenthesisKeyword_4_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4__4__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_4_3__0"
    // InternalCeffective.g:1474:1: rule__ProveedorNube__Group_4_3__0 : rule__ProveedorNube__Group_4_3__0__Impl rule__ProveedorNube__Group_4_3__1 ;
    public final void rule__ProveedorNube__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1478:1: ( rule__ProveedorNube__Group_4_3__0__Impl rule__ProveedorNube__Group_4_3__1 )
            // InternalCeffective.g:1479:2: rule__ProveedorNube__Group_4_3__0__Impl rule__ProveedorNube__Group_4_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ProveedorNube__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4_3__0"


    // $ANTLR start "rule__ProveedorNube__Group_4_3__0__Impl"
    // InternalCeffective.g:1486:1: rule__ProveedorNube__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__ProveedorNube__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1490:1: ( ( ',' ) )
            // InternalCeffective.g:1491:1: ( ',' )
            {
            // InternalCeffective.g:1491:1: ( ',' )
            // InternalCeffective.g:1492:2: ','
            {
             before(grammarAccess.getProveedorNubeAccess().getCommaKeyword_4_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4_3__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_4_3__1"
    // InternalCeffective.g:1501:1: rule__ProveedorNube__Group_4_3__1 : rule__ProveedorNube__Group_4_3__1__Impl ;
    public final void rule__ProveedorNube__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1505:1: ( rule__ProveedorNube__Group_4_3__1__Impl )
            // InternalCeffective.g:1506:2: rule__ProveedorNube__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4_3__1"


    // $ANTLR start "rule__ProveedorNube__Group_4_3__1__Impl"
    // InternalCeffective.g:1512:1: rule__ProveedorNube__Group_4_3__1__Impl : ( ( rule__ProveedorNube__VpcAssignment_4_3_1 ) ) ;
    public final void rule__ProveedorNube__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1516:1: ( ( ( rule__ProveedorNube__VpcAssignment_4_3_1 ) ) )
            // InternalCeffective.g:1517:1: ( ( rule__ProveedorNube__VpcAssignment_4_3_1 ) )
            {
            // InternalCeffective.g:1517:1: ( ( rule__ProveedorNube__VpcAssignment_4_3_1 ) )
            // InternalCeffective.g:1518:2: ( rule__ProveedorNube__VpcAssignment_4_3_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcAssignment_4_3_1()); 
            // InternalCeffective.g:1519:2: ( rule__ProveedorNube__VpcAssignment_4_3_1 )
            // InternalCeffective.g:1519:3: rule__ProveedorNube__VpcAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__VpcAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getVpcAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_4_3__1__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_8__0"
    // InternalCeffective.g:1528:1: rule__ProveedorNube__Group_8__0 : rule__ProveedorNube__Group_8__0__Impl rule__ProveedorNube__Group_8__1 ;
    public final void rule__ProveedorNube__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1532:1: ( rule__ProveedorNube__Group_8__0__Impl rule__ProveedorNube__Group_8__1 )
            // InternalCeffective.g:1533:2: rule__ProveedorNube__Group_8__0__Impl rule__ProveedorNube__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__ProveedorNube__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_8__0"


    // $ANTLR start "rule__ProveedorNube__Group_8__0__Impl"
    // InternalCeffective.g:1540:1: rule__ProveedorNube__Group_8__0__Impl : ( ',' ) ;
    public final void rule__ProveedorNube__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1544:1: ( ( ',' ) )
            // InternalCeffective.g:1545:1: ( ',' )
            {
            // InternalCeffective.g:1545:1: ( ',' )
            // InternalCeffective.g:1546:2: ','
            {
             before(grammarAccess.getProveedorNubeAccess().getCommaKeyword_8_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getProveedorNubeAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_8__0__Impl"


    // $ANTLR start "rule__ProveedorNube__Group_8__1"
    // InternalCeffective.g:1555:1: rule__ProveedorNube__Group_8__1 : rule__ProveedorNube__Group_8__1__Impl ;
    public final void rule__ProveedorNube__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1559:1: ( rule__ProveedorNube__Group_8__1__Impl )
            // InternalCeffective.g:1560:2: rule__ProveedorNube__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_8__1"


    // $ANTLR start "rule__ProveedorNube__Group_8__1__Impl"
    // InternalCeffective.g:1566:1: rule__ProveedorNube__Group_8__1__Impl : ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1 ) ) ;
    public final void rule__ProveedorNube__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1570:1: ( ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1 ) ) )
            // InternalCeffective.g:1571:1: ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1 ) )
            {
            // InternalCeffective.g:1571:1: ( ( rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1 ) )
            // InternalCeffective.g:1572:2: ( rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1 )
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAssignment_8_1()); 
            // InternalCeffective.g:1573:2: ( rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1 )
            // InternalCeffective.g:1573:3: rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__Group_8__1__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__0"
    // InternalCeffective.g:1582:1: rule__AutenticacionUsuario_Impl__Group__0 : rule__AutenticacionUsuario_Impl__Group__0__Impl rule__AutenticacionUsuario_Impl__Group__1 ;
    public final void rule__AutenticacionUsuario_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1586:1: ( rule__AutenticacionUsuario_Impl__Group__0__Impl rule__AutenticacionUsuario_Impl__Group__1 )
            // InternalCeffective.g:1587:2: rule__AutenticacionUsuario_Impl__Group__0__Impl rule__AutenticacionUsuario_Impl__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__AutenticacionUsuario_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__0"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__0__Impl"
    // InternalCeffective.g:1594:1: rule__AutenticacionUsuario_Impl__Group__0__Impl : ( () ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1598:1: ( ( () ) )
            // InternalCeffective.g:1599:1: ( () )
            {
            // InternalCeffective.g:1599:1: ( () )
            // InternalCeffective.g:1600:2: ()
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioAction_0()); 
            // InternalCeffective.g:1601:2: ()
            // InternalCeffective.g:1601:3: 
            {
            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__0__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__1"
    // InternalCeffective.g:1609:1: rule__AutenticacionUsuario_Impl__Group__1 : rule__AutenticacionUsuario_Impl__Group__1__Impl rule__AutenticacionUsuario_Impl__Group__2 ;
    public final void rule__AutenticacionUsuario_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1613:1: ( rule__AutenticacionUsuario_Impl__Group__1__Impl rule__AutenticacionUsuario_Impl__Group__2 )
            // InternalCeffective.g:1614:2: rule__AutenticacionUsuario_Impl__Group__1__Impl rule__AutenticacionUsuario_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AutenticacionUsuario_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__1__Impl"
    // InternalCeffective.g:1621:1: rule__AutenticacionUsuario_Impl__Group__1__Impl : ( 'AutenticacionUsuario' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1625:1: ( ( 'AutenticacionUsuario' ) )
            // InternalCeffective.g:1626:1: ( 'AutenticacionUsuario' )
            {
            // InternalCeffective.g:1626:1: ( 'AutenticacionUsuario' )
            // InternalCeffective.g:1627:2: 'AutenticacionUsuario'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getAutenticacionUsuarioKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__1__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__2"
    // InternalCeffective.g:1636:1: rule__AutenticacionUsuario_Impl__Group__2 : rule__AutenticacionUsuario_Impl__Group__2__Impl rule__AutenticacionUsuario_Impl__Group__3 ;
    public final void rule__AutenticacionUsuario_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1640:1: ( rule__AutenticacionUsuario_Impl__Group__2__Impl rule__AutenticacionUsuario_Impl__Group__3 )
            // InternalCeffective.g:1641:2: rule__AutenticacionUsuario_Impl__Group__2__Impl rule__AutenticacionUsuario_Impl__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AutenticacionUsuario_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__2"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__2__Impl"
    // InternalCeffective.g:1648:1: rule__AutenticacionUsuario_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1652:1: ( ( '{' ) )
            // InternalCeffective.g:1653:1: ( '{' )
            {
            // InternalCeffective.g:1653:1: ( '{' )
            // InternalCeffective.g:1654:2: '{'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__2__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__3"
    // InternalCeffective.g:1663:1: rule__AutenticacionUsuario_Impl__Group__3 : rule__AutenticacionUsuario_Impl__Group__3__Impl rule__AutenticacionUsuario_Impl__Group__4 ;
    public final void rule__AutenticacionUsuario_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1667:1: ( rule__AutenticacionUsuario_Impl__Group__3__Impl rule__AutenticacionUsuario_Impl__Group__4 )
            // InternalCeffective.g:1668:2: rule__AutenticacionUsuario_Impl__Group__3__Impl rule__AutenticacionUsuario_Impl__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__AutenticacionUsuario_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__3"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__3__Impl"
    // InternalCeffective.g:1675:1: rule__AutenticacionUsuario_Impl__Group__3__Impl : ( ( rule__AutenticacionUsuario_Impl__Group_3__0 )? ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1679:1: ( ( ( rule__AutenticacionUsuario_Impl__Group_3__0 )? ) )
            // InternalCeffective.g:1680:1: ( ( rule__AutenticacionUsuario_Impl__Group_3__0 )? )
            {
            // InternalCeffective.g:1680:1: ( ( rule__AutenticacionUsuario_Impl__Group_3__0 )? )
            // InternalCeffective.g:1681:2: ( rule__AutenticacionUsuario_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup_3()); 
            // InternalCeffective.g:1682:2: ( rule__AutenticacionUsuario_Impl__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCeffective.g:1682:3: rule__AutenticacionUsuario_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionUsuario_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__3__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__4"
    // InternalCeffective.g:1690:1: rule__AutenticacionUsuario_Impl__Group__4 : rule__AutenticacionUsuario_Impl__Group__4__Impl rule__AutenticacionUsuario_Impl__Group__5 ;
    public final void rule__AutenticacionUsuario_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1694:1: ( rule__AutenticacionUsuario_Impl__Group__4__Impl rule__AutenticacionUsuario_Impl__Group__5 )
            // InternalCeffective.g:1695:2: rule__AutenticacionUsuario_Impl__Group__4__Impl rule__AutenticacionUsuario_Impl__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__AutenticacionUsuario_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__4"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__4__Impl"
    // InternalCeffective.g:1702:1: rule__AutenticacionUsuario_Impl__Group__4__Impl : ( ( rule__AutenticacionUsuario_Impl__Group_4__0 )? ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1706:1: ( ( ( rule__AutenticacionUsuario_Impl__Group_4__0 )? ) )
            // InternalCeffective.g:1707:1: ( ( rule__AutenticacionUsuario_Impl__Group_4__0 )? )
            {
            // InternalCeffective.g:1707:1: ( ( rule__AutenticacionUsuario_Impl__Group_4__0 )? )
            // InternalCeffective.g:1708:2: ( rule__AutenticacionUsuario_Impl__Group_4__0 )?
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup_4()); 
            // InternalCeffective.g:1709:2: ( rule__AutenticacionUsuario_Impl__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCeffective.g:1709:3: rule__AutenticacionUsuario_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionUsuario_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__4__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__5"
    // InternalCeffective.g:1717:1: rule__AutenticacionUsuario_Impl__Group__5 : rule__AutenticacionUsuario_Impl__Group__5__Impl ;
    public final void rule__AutenticacionUsuario_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1721:1: ( rule__AutenticacionUsuario_Impl__Group__5__Impl )
            // InternalCeffective.g:1722:2: rule__AutenticacionUsuario_Impl__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__5"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group__5__Impl"
    // InternalCeffective.g:1728:1: rule__AutenticacionUsuario_Impl__Group__5__Impl : ( '}' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1732:1: ( ( '}' ) )
            // InternalCeffective.g:1733:1: ( '}' )
            {
            // InternalCeffective.g:1733:1: ( '}' )
            // InternalCeffective.g:1734:2: '}'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group__5__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_3__0"
    // InternalCeffective.g:1744:1: rule__AutenticacionUsuario_Impl__Group_3__0 : rule__AutenticacionUsuario_Impl__Group_3__0__Impl rule__AutenticacionUsuario_Impl__Group_3__1 ;
    public final void rule__AutenticacionUsuario_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1748:1: ( rule__AutenticacionUsuario_Impl__Group_3__0__Impl rule__AutenticacionUsuario_Impl__Group_3__1 )
            // InternalCeffective.g:1749:2: rule__AutenticacionUsuario_Impl__Group_3__0__Impl rule__AutenticacionUsuario_Impl__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionUsuario_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_3__0"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_3__0__Impl"
    // InternalCeffective.g:1756:1: rule__AutenticacionUsuario_Impl__Group_3__0__Impl : ( 'usuario' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1760:1: ( ( 'usuario' ) )
            // InternalCeffective.g:1761:1: ( 'usuario' )
            {
            // InternalCeffective.g:1761:1: ( 'usuario' )
            // InternalCeffective.g:1762:2: 'usuario'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_3__1"
    // InternalCeffective.g:1771:1: rule__AutenticacionUsuario_Impl__Group_3__1 : rule__AutenticacionUsuario_Impl__Group_3__1__Impl ;
    public final void rule__AutenticacionUsuario_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1775:1: ( rule__AutenticacionUsuario_Impl__Group_3__1__Impl )
            // InternalCeffective.g:1776:2: rule__AutenticacionUsuario_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_3__1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_3__1__Impl"
    // InternalCeffective.g:1782:1: rule__AutenticacionUsuario_Impl__Group_3__1__Impl : ( ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 ) ) ;
    public final void rule__AutenticacionUsuario_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1786:1: ( ( ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 ) ) )
            // InternalCeffective.g:1787:1: ( ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 ) )
            {
            // InternalCeffective.g:1787:1: ( ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 ) )
            // InternalCeffective.g:1788:2: ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 )
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioAssignment_3_1()); 
            // InternalCeffective.g:1789:2: ( rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 )
            // InternalCeffective.g:1789:3: rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_4__0"
    // InternalCeffective.g:1798:1: rule__AutenticacionUsuario_Impl__Group_4__0 : rule__AutenticacionUsuario_Impl__Group_4__0__Impl rule__AutenticacionUsuario_Impl__Group_4__1 ;
    public final void rule__AutenticacionUsuario_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1802:1: ( rule__AutenticacionUsuario_Impl__Group_4__0__Impl rule__AutenticacionUsuario_Impl__Group_4__1 )
            // InternalCeffective.g:1803:2: rule__AutenticacionUsuario_Impl__Group_4__0__Impl rule__AutenticacionUsuario_Impl__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionUsuario_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_4__0"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_4__0__Impl"
    // InternalCeffective.g:1810:1: rule__AutenticacionUsuario_Impl__Group_4__0__Impl : ( 'correo' ) ;
    public final void rule__AutenticacionUsuario_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1814:1: ( ( 'correo' ) )
            // InternalCeffective.g:1815:1: ( 'correo' )
            {
            // InternalCeffective.g:1815:1: ( 'correo' )
            // InternalCeffective.g:1816:2: 'correo'
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_4__1"
    // InternalCeffective.g:1825:1: rule__AutenticacionUsuario_Impl__Group_4__1 : rule__AutenticacionUsuario_Impl__Group_4__1__Impl ;
    public final void rule__AutenticacionUsuario_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1829:1: ( rule__AutenticacionUsuario_Impl__Group_4__1__Impl )
            // InternalCeffective.g:1830:2: rule__AutenticacionUsuario_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_4__1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__Group_4__1__Impl"
    // InternalCeffective.g:1836:1: rule__AutenticacionUsuario_Impl__Group_4__1__Impl : ( ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 ) ) ;
    public final void rule__AutenticacionUsuario_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1840:1: ( ( ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 ) ) )
            // InternalCeffective.g:1841:1: ( ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 ) )
            {
            // InternalCeffective.g:1841:1: ( ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 ) )
            // InternalCeffective.g:1842:2: ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 )
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoAssignment_4_1()); 
            // InternalCeffective.g:1843:2: ( rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 )
            // InternalCeffective.g:1843:3: rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__0"
    // InternalCeffective.g:1852:1: rule__ServidorAplicaciones__Group__0 : rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1 ;
    public final void rule__ServidorAplicaciones__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1856:1: ( rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1 )
            // InternalCeffective.g:1857:2: rule__ServidorAplicaciones__Group__0__Impl rule__ServidorAplicaciones__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ServidorAplicaciones__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group__0__Impl"
    // InternalCeffective.g:1864:1: rule__ServidorAplicaciones__Group__0__Impl : ( () ) ;
    public final void rule__ServidorAplicaciones__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1868:1: ( ( () ) )
            // InternalCeffective.g:1869:1: ( () )
            {
            // InternalCeffective.g:1869:1: ( () )
            // InternalCeffective.g:1870:2: ()
            {
             before(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesAction_0()); 
            // InternalCeffective.g:1871:2: ()
            // InternalCeffective.g:1871:3: 
            {
            }

             after(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__1"
    // InternalCeffective.g:1879:1: rule__ServidorAplicaciones__Group__1 : rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2 ;
    public final void rule__ServidorAplicaciones__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1883:1: ( rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2 )
            // InternalCeffective.g:1884:2: rule__ServidorAplicaciones__Group__1__Impl rule__ServidorAplicaciones__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServidorAplicaciones__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group__1__Impl"
    // InternalCeffective.g:1891:1: rule__ServidorAplicaciones__Group__1__Impl : ( 'ServidorAplicaciones' ) ;
    public final void rule__ServidorAplicaciones__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1895:1: ( ( 'ServidorAplicaciones' ) )
            // InternalCeffective.g:1896:1: ( 'ServidorAplicaciones' )
            {
            // InternalCeffective.g:1896:1: ( 'ServidorAplicaciones' )
            // InternalCeffective.g:1897:2: 'ServidorAplicaciones'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getServidorAplicacionesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__2"
    // InternalCeffective.g:1906:1: rule__ServidorAplicaciones__Group__2 : rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3 ;
    public final void rule__ServidorAplicaciones__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1910:1: ( rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3 )
            // InternalCeffective.g:1911:2: rule__ServidorAplicaciones__Group__2__Impl rule__ServidorAplicaciones__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ServidorAplicaciones__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__2"


    // $ANTLR start "rule__ServidorAplicaciones__Group__2__Impl"
    // InternalCeffective.g:1918:1: rule__ServidorAplicaciones__Group__2__Impl : ( '{' ) ;
    public final void rule__ServidorAplicaciones__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1922:1: ( ( '{' ) )
            // InternalCeffective.g:1923:1: ( '{' )
            {
            // InternalCeffective.g:1923:1: ( '{' )
            // InternalCeffective.g:1924:2: '{'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__2__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__3"
    // InternalCeffective.g:1933:1: rule__ServidorAplicaciones__Group__3 : rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4 ;
    public final void rule__ServidorAplicaciones__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1937:1: ( rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4 )
            // InternalCeffective.g:1938:2: rule__ServidorAplicaciones__Group__3__Impl rule__ServidorAplicaciones__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ServidorAplicaciones__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__3"


    // $ANTLR start "rule__ServidorAplicaciones__Group__3__Impl"
    // InternalCeffective.g:1945:1: rule__ServidorAplicaciones__Group__3__Impl : ( ( rule__ServidorAplicaciones__Group_3__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1949:1: ( ( ( rule__ServidorAplicaciones__Group_3__0 )? ) )
            // InternalCeffective.g:1950:1: ( ( rule__ServidorAplicaciones__Group_3__0 )? )
            {
            // InternalCeffective.g:1950:1: ( ( rule__ServidorAplicaciones__Group_3__0 )? )
            // InternalCeffective.g:1951:2: ( rule__ServidorAplicaciones__Group_3__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_3()); 
            // InternalCeffective.g:1952:2: ( rule__ServidorAplicaciones__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCeffective.g:1952:3: rule__ServidorAplicaciones__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__3__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__4"
    // InternalCeffective.g:1960:1: rule__ServidorAplicaciones__Group__4 : rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5 ;
    public final void rule__ServidorAplicaciones__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1964:1: ( rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5 )
            // InternalCeffective.g:1965:2: rule__ServidorAplicaciones__Group__4__Impl rule__ServidorAplicaciones__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__ServidorAplicaciones__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__4"


    // $ANTLR start "rule__ServidorAplicaciones__Group__4__Impl"
    // InternalCeffective.g:1972:1: rule__ServidorAplicaciones__Group__4__Impl : ( ( rule__ServidorAplicaciones__Group_4__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1976:1: ( ( ( rule__ServidorAplicaciones__Group_4__0 )? ) )
            // InternalCeffective.g:1977:1: ( ( rule__ServidorAplicaciones__Group_4__0 )? )
            {
            // InternalCeffective.g:1977:1: ( ( rule__ServidorAplicaciones__Group_4__0 )? )
            // InternalCeffective.g:1978:2: ( rule__ServidorAplicaciones__Group_4__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_4()); 
            // InternalCeffective.g:1979:2: ( rule__ServidorAplicaciones__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCeffective.g:1979:3: rule__ServidorAplicaciones__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__4__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__5"
    // InternalCeffective.g:1987:1: rule__ServidorAplicaciones__Group__5 : rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6 ;
    public final void rule__ServidorAplicaciones__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:1991:1: ( rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6 )
            // InternalCeffective.g:1992:2: rule__ServidorAplicaciones__Group__5__Impl rule__ServidorAplicaciones__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__ServidorAplicaciones__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__5"


    // $ANTLR start "rule__ServidorAplicaciones__Group__5__Impl"
    // InternalCeffective.g:1999:1: rule__ServidorAplicaciones__Group__5__Impl : ( ( rule__ServidorAplicaciones__Group_5__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2003:1: ( ( ( rule__ServidorAplicaciones__Group_5__0 )? ) )
            // InternalCeffective.g:2004:1: ( ( rule__ServidorAplicaciones__Group_5__0 )? )
            {
            // InternalCeffective.g:2004:1: ( ( rule__ServidorAplicaciones__Group_5__0 )? )
            // InternalCeffective.g:2005:2: ( rule__ServidorAplicaciones__Group_5__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_5()); 
            // InternalCeffective.g:2006:2: ( rule__ServidorAplicaciones__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCeffective.g:2006:3: rule__ServidorAplicaciones__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__5__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__6"
    // InternalCeffective.g:2014:1: rule__ServidorAplicaciones__Group__6 : rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7 ;
    public final void rule__ServidorAplicaciones__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2018:1: ( rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7 )
            // InternalCeffective.g:2019:2: rule__ServidorAplicaciones__Group__6__Impl rule__ServidorAplicaciones__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__ServidorAplicaciones__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__6"


    // $ANTLR start "rule__ServidorAplicaciones__Group__6__Impl"
    // InternalCeffective.g:2026:1: rule__ServidorAplicaciones__Group__6__Impl : ( ( rule__ServidorAplicaciones__Group_6__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2030:1: ( ( ( rule__ServidorAplicaciones__Group_6__0 )? ) )
            // InternalCeffective.g:2031:1: ( ( rule__ServidorAplicaciones__Group_6__0 )? )
            {
            // InternalCeffective.g:2031:1: ( ( rule__ServidorAplicaciones__Group_6__0 )? )
            // InternalCeffective.g:2032:2: ( rule__ServidorAplicaciones__Group_6__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_6()); 
            // InternalCeffective.g:2033:2: ( rule__ServidorAplicaciones__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCeffective.g:2033:3: rule__ServidorAplicaciones__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__6__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__7"
    // InternalCeffective.g:2041:1: rule__ServidorAplicaciones__Group__7 : rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8 ;
    public final void rule__ServidorAplicaciones__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2045:1: ( rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8 )
            // InternalCeffective.g:2046:2: rule__ServidorAplicaciones__Group__7__Impl rule__ServidorAplicaciones__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__ServidorAplicaciones__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__7"


    // $ANTLR start "rule__ServidorAplicaciones__Group__7__Impl"
    // InternalCeffective.g:2053:1: rule__ServidorAplicaciones__Group__7__Impl : ( ( rule__ServidorAplicaciones__Group_7__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2057:1: ( ( ( rule__ServidorAplicaciones__Group_7__0 )? ) )
            // InternalCeffective.g:2058:1: ( ( rule__ServidorAplicaciones__Group_7__0 )? )
            {
            // InternalCeffective.g:2058:1: ( ( rule__ServidorAplicaciones__Group_7__0 )? )
            // InternalCeffective.g:2059:2: ( rule__ServidorAplicaciones__Group_7__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_7()); 
            // InternalCeffective.g:2060:2: ( rule__ServidorAplicaciones__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCeffective.g:2060:3: rule__ServidorAplicaciones__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__7__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__8"
    // InternalCeffective.g:2068:1: rule__ServidorAplicaciones__Group__8 : rule__ServidorAplicaciones__Group__8__Impl rule__ServidorAplicaciones__Group__9 ;
    public final void rule__ServidorAplicaciones__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2072:1: ( rule__ServidorAplicaciones__Group__8__Impl rule__ServidorAplicaciones__Group__9 )
            // InternalCeffective.g:2073:2: rule__ServidorAplicaciones__Group__8__Impl rule__ServidorAplicaciones__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__ServidorAplicaciones__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__8"


    // $ANTLR start "rule__ServidorAplicaciones__Group__8__Impl"
    // InternalCeffective.g:2080:1: rule__ServidorAplicaciones__Group__8__Impl : ( ( rule__ServidorAplicaciones__Group_8__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2084:1: ( ( ( rule__ServidorAplicaciones__Group_8__0 )? ) )
            // InternalCeffective.g:2085:1: ( ( rule__ServidorAplicaciones__Group_8__0 )? )
            {
            // InternalCeffective.g:2085:1: ( ( rule__ServidorAplicaciones__Group_8__0 )? )
            // InternalCeffective.g:2086:2: ( rule__ServidorAplicaciones__Group_8__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_8()); 
            // InternalCeffective.g:2087:2: ( rule__ServidorAplicaciones__Group_8__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCeffective.g:2087:3: rule__ServidorAplicaciones__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__8__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__9"
    // InternalCeffective.g:2095:1: rule__ServidorAplicaciones__Group__9 : rule__ServidorAplicaciones__Group__9__Impl rule__ServidorAplicaciones__Group__10 ;
    public final void rule__ServidorAplicaciones__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2099:1: ( rule__ServidorAplicaciones__Group__9__Impl rule__ServidorAplicaciones__Group__10 )
            // InternalCeffective.g:2100:2: rule__ServidorAplicaciones__Group__9__Impl rule__ServidorAplicaciones__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__ServidorAplicaciones__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__9"


    // $ANTLR start "rule__ServidorAplicaciones__Group__9__Impl"
    // InternalCeffective.g:2107:1: rule__ServidorAplicaciones__Group__9__Impl : ( ( rule__ServidorAplicaciones__Group_9__0 )? ) ;
    public final void rule__ServidorAplicaciones__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2111:1: ( ( ( rule__ServidorAplicaciones__Group_9__0 )? ) )
            // InternalCeffective.g:2112:1: ( ( rule__ServidorAplicaciones__Group_9__0 )? )
            {
            // InternalCeffective.g:2112:1: ( ( rule__ServidorAplicaciones__Group_9__0 )? )
            // InternalCeffective.g:2113:2: ( rule__ServidorAplicaciones__Group_9__0 )?
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_9()); 
            // InternalCeffective.g:2114:2: ( rule__ServidorAplicaciones__Group_9__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCeffective.g:2114:3: rule__ServidorAplicaciones__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorAplicaciones__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__9__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group__10"
    // InternalCeffective.g:2122:1: rule__ServidorAplicaciones__Group__10 : rule__ServidorAplicaciones__Group__10__Impl ;
    public final void rule__ServidorAplicaciones__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2126:1: ( rule__ServidorAplicaciones__Group__10__Impl )
            // InternalCeffective.g:2127:2: rule__ServidorAplicaciones__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__10"


    // $ANTLR start "rule__ServidorAplicaciones__Group__10__Impl"
    // InternalCeffective.g:2133:1: rule__ServidorAplicaciones__Group__10__Impl : ( '}' ) ;
    public final void rule__ServidorAplicaciones__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2137:1: ( ( '}' ) )
            // InternalCeffective.g:2138:1: ( '}' )
            {
            // InternalCeffective.g:2138:1: ( '}' )
            // InternalCeffective.g:2139:2: '}'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_10()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group__10__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__0"
    // InternalCeffective.g:2149:1: rule__ServidorAplicaciones__Group_3__0 : rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1 ;
    public final void rule__ServidorAplicaciones__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2153:1: ( rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1 )
            // InternalCeffective.g:2154:2: rule__ServidorAplicaciones__Group_3__0__Impl rule__ServidorAplicaciones__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__0__Impl"
    // InternalCeffective.g:2161:1: rule__ServidorAplicaciones__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorAplicaciones__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2165:1: ( ( 'nombre' ) )
            // InternalCeffective.g:2166:1: ( 'nombre' )
            {
            // InternalCeffective.g:2166:1: ( 'nombre' )
            // InternalCeffective.g:2167:2: 'nombre'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__1"
    // InternalCeffective.g:2176:1: rule__ServidorAplicaciones__Group_3__1 : rule__ServidorAplicaciones__Group_3__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2180:1: ( rule__ServidorAplicaciones__Group_3__1__Impl )
            // InternalCeffective.g:2181:2: rule__ServidorAplicaciones__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_3__1__Impl"
    // InternalCeffective.g:2187:1: rule__ServidorAplicaciones__Group_3__1__Impl : ( ( rule__ServidorAplicaciones__NombreAssignment_3_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2191:1: ( ( ( rule__ServidorAplicaciones__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:2192:1: ( ( rule__ServidorAplicaciones__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:2192:1: ( ( rule__ServidorAplicaciones__NombreAssignment_3_1 ) )
            // InternalCeffective.g:2193:2: ( rule__ServidorAplicaciones__NombreAssignment_3_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:2194:2: ( rule__ServidorAplicaciones__NombreAssignment_3_1 )
            // InternalCeffective.g:2194:3: rule__ServidorAplicaciones__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_3__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__0"
    // InternalCeffective.g:2203:1: rule__ServidorAplicaciones__Group_4__0 : rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1 ;
    public final void rule__ServidorAplicaciones__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2207:1: ( rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1 )
            // InternalCeffective.g:2208:2: rule__ServidorAplicaciones__Group_4__0__Impl rule__ServidorAplicaciones__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__0__Impl"
    // InternalCeffective.g:2215:1: rule__ServidorAplicaciones__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__ServidorAplicaciones__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2219:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:2220:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:2220:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:2221:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__1"
    // InternalCeffective.g:2230:1: rule__ServidorAplicaciones__Group_4__1 : rule__ServidorAplicaciones__Group_4__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2234:1: ( rule__ServidorAplicaciones__Group_4__1__Impl )
            // InternalCeffective.g:2235:2: rule__ServidorAplicaciones__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_4__1__Impl"
    // InternalCeffective.g:2241:1: rule__ServidorAplicaciones__Group_4__1__Impl : ( ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2245:1: ( ( ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:2246:1: ( ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:2246:1: ( ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:2247:2: ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:2248:2: ( rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:2248:3: rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_4__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__0"
    // InternalCeffective.g:2257:1: rule__ServidorAplicaciones__Group_5__0 : rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1 ;
    public final void rule__ServidorAplicaciones__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2261:1: ( rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1 )
            // InternalCeffective.g:2262:2: rule__ServidorAplicaciones__Group_5__0__Impl rule__ServidorAplicaciones__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__0__Impl"
    // InternalCeffective.g:2269:1: rule__ServidorAplicaciones__Group_5__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__ServidorAplicaciones__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2273:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:2274:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:2274:1: ( 'zonaNombre' )
            // InternalCeffective.g:2275:2: 'zonaNombre'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaNombreKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getZonaNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__1"
    // InternalCeffective.g:2284:1: rule__ServidorAplicaciones__Group_5__1 : rule__ServidorAplicaciones__Group_5__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2288:1: ( rule__ServidorAplicaciones__Group_5__1__Impl )
            // InternalCeffective.g:2289:2: rule__ServidorAplicaciones__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_5__1__Impl"
    // InternalCeffective.g:2295:1: rule__ServidorAplicaciones__Group_5__1__Impl : ( ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2299:1: ( ( ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 ) ) )
            // InternalCeffective.g:2300:1: ( ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:2300:1: ( ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 ) )
            // InternalCeffective.g:2301:2: ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaNombreAssignment_5_1()); 
            // InternalCeffective.g:2302:2: ( rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 )
            // InternalCeffective.g:2302:3: rule__ServidorAplicaciones__ZonaNombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__ZonaNombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getZonaNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_5__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_6__0"
    // InternalCeffective.g:2311:1: rule__ServidorAplicaciones__Group_6__0 : rule__ServidorAplicaciones__Group_6__0__Impl rule__ServidorAplicaciones__Group_6__1 ;
    public final void rule__ServidorAplicaciones__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2315:1: ( rule__ServidorAplicaciones__Group_6__0__Impl rule__ServidorAplicaciones__Group_6__1 )
            // InternalCeffective.g:2316:2: rule__ServidorAplicaciones__Group_6__0__Impl rule__ServidorAplicaciones__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__ServidorAplicaciones__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_6__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_6__0__Impl"
    // InternalCeffective.g:2323:1: rule__ServidorAplicaciones__Group_6__0__Impl : ( 'tamano' ) ;
    public final void rule__ServidorAplicaciones__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2327:1: ( ( 'tamano' ) )
            // InternalCeffective.g:2328:1: ( 'tamano' )
            {
            // InternalCeffective.g:2328:1: ( 'tamano' )
            // InternalCeffective.g:2329:2: 'tamano'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanoKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getTamanoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_6__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_6__1"
    // InternalCeffective.g:2338:1: rule__ServidorAplicaciones__Group_6__1 : rule__ServidorAplicaciones__Group_6__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2342:1: ( rule__ServidorAplicaciones__Group_6__1__Impl )
            // InternalCeffective.g:2343:2: rule__ServidorAplicaciones__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_6__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_6__1__Impl"
    // InternalCeffective.g:2349:1: rule__ServidorAplicaciones__Group_6__1__Impl : ( ( rule__ServidorAplicaciones__TamanoAssignment_6_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2353:1: ( ( ( rule__ServidorAplicaciones__TamanoAssignment_6_1 ) ) )
            // InternalCeffective.g:2354:1: ( ( rule__ServidorAplicaciones__TamanoAssignment_6_1 ) )
            {
            // InternalCeffective.g:2354:1: ( ( rule__ServidorAplicaciones__TamanoAssignment_6_1 ) )
            // InternalCeffective.g:2355:2: ( rule__ServidorAplicaciones__TamanoAssignment_6_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanoAssignment_6_1()); 
            // InternalCeffective.g:2356:2: ( rule__ServidorAplicaciones__TamanoAssignment_6_1 )
            // InternalCeffective.g:2356:3: rule__ServidorAplicaciones__TamanoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__TamanoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getTamanoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_6__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_7__0"
    // InternalCeffective.g:2365:1: rule__ServidorAplicaciones__Group_7__0 : rule__ServidorAplicaciones__Group_7__0__Impl rule__ServidorAplicaciones__Group_7__1 ;
    public final void rule__ServidorAplicaciones__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2369:1: ( rule__ServidorAplicaciones__Group_7__0__Impl rule__ServidorAplicaciones__Group_7__1 )
            // InternalCeffective.g:2370:2: rule__ServidorAplicaciones__Group_7__0__Impl rule__ServidorAplicaciones__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_7__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_7__0__Impl"
    // InternalCeffective.g:2377:1: rule__ServidorAplicaciones__Group_7__0__Impl : ( 'sistemaOperativo' ) ;
    public final void rule__ServidorAplicaciones__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2381:1: ( ( 'sistemaOperativo' ) )
            // InternalCeffective.g:2382:1: ( 'sistemaOperativo' )
            {
            // InternalCeffective.g:2382:1: ( 'sistemaOperativo' )
            // InternalCeffective.g:2383:2: 'sistemaOperativo'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_7__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_7__1"
    // InternalCeffective.g:2392:1: rule__ServidorAplicaciones__Group_7__1 : rule__ServidorAplicaciones__Group_7__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2396:1: ( rule__ServidorAplicaciones__Group_7__1__Impl )
            // InternalCeffective.g:2397:2: rule__ServidorAplicaciones__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_7__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_7__1__Impl"
    // InternalCeffective.g:2403:1: rule__ServidorAplicaciones__Group_7__1__Impl : ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2407:1: ( ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 ) ) )
            // InternalCeffective.g:2408:1: ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 ) )
            {
            // InternalCeffective.g:2408:1: ( ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 ) )
            // InternalCeffective.g:2409:2: ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoAssignment_7_1()); 
            // InternalCeffective.g:2410:2: ( rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 )
            // InternalCeffective.g:2410:3: rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_7__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__0"
    // InternalCeffective.g:2419:1: rule__ServidorAplicaciones__Group_8__0 : rule__ServidorAplicaciones__Group_8__0__Impl rule__ServidorAplicaciones__Group_8__1 ;
    public final void rule__ServidorAplicaciones__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2423:1: ( rule__ServidorAplicaciones__Group_8__0__Impl rule__ServidorAplicaciones__Group_8__1 )
            // InternalCeffective.g:2424:2: rule__ServidorAplicaciones__Group_8__0__Impl rule__ServidorAplicaciones__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__ServidorAplicaciones__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__0__Impl"
    // InternalCeffective.g:2431:1: rule__ServidorAplicaciones__Group_8__0__Impl : ( 'recursos' ) ;
    public final void rule__ServidorAplicaciones__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2435:1: ( ( 'recursos' ) )
            // InternalCeffective.g:2436:1: ( 'recursos' )
            {
            // InternalCeffective.g:2436:1: ( 'recursos' )
            // InternalCeffective.g:2437:2: 'recursos'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosKeyword_8_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getRecursosKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__1"
    // InternalCeffective.g:2446:1: rule__ServidorAplicaciones__Group_8__1 : rule__ServidorAplicaciones__Group_8__1__Impl rule__ServidorAplicaciones__Group_8__2 ;
    public final void rule__ServidorAplicaciones__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2450:1: ( rule__ServidorAplicaciones__Group_8__1__Impl rule__ServidorAplicaciones__Group_8__2 )
            // InternalCeffective.g:2451:2: rule__ServidorAplicaciones__Group_8__1__Impl rule__ServidorAplicaciones__Group_8__2
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__1__Impl"
    // InternalCeffective.g:2458:1: rule__ServidorAplicaciones__Group_8__1__Impl : ( '(' ) ;
    public final void rule__ServidorAplicaciones__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2462:1: ( ( '(' ) )
            // InternalCeffective.g:2463:1: ( '(' )
            {
            // InternalCeffective.g:2463:1: ( '(' )
            // InternalCeffective.g:2464:2: '('
            {
             before(grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__2"
    // InternalCeffective.g:2473:1: rule__ServidorAplicaciones__Group_8__2 : rule__ServidorAplicaciones__Group_8__2__Impl rule__ServidorAplicaciones__Group_8__3 ;
    public final void rule__ServidorAplicaciones__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2477:1: ( rule__ServidorAplicaciones__Group_8__2__Impl rule__ServidorAplicaciones__Group_8__3 )
            // InternalCeffective.g:2478:2: rule__ServidorAplicaciones__Group_8__2__Impl rule__ServidorAplicaciones__Group_8__3
            {
            pushFollow(FOLLOW_14);
            rule__ServidorAplicaciones__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__2"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__2__Impl"
    // InternalCeffective.g:2485:1: rule__ServidorAplicaciones__Group_8__2__Impl : ( ( rule__ServidorAplicaciones__RecursosAssignment_8_2 ) ) ;
    public final void rule__ServidorAplicaciones__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2489:1: ( ( ( rule__ServidorAplicaciones__RecursosAssignment_8_2 ) ) )
            // InternalCeffective.g:2490:1: ( ( rule__ServidorAplicaciones__RecursosAssignment_8_2 ) )
            {
            // InternalCeffective.g:2490:1: ( ( rule__ServidorAplicaciones__RecursosAssignment_8_2 ) )
            // InternalCeffective.g:2491:2: ( rule__ServidorAplicaciones__RecursosAssignment_8_2 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosAssignment_8_2()); 
            // InternalCeffective.g:2492:2: ( rule__ServidorAplicaciones__RecursosAssignment_8_2 )
            // InternalCeffective.g:2492:3: rule__ServidorAplicaciones__RecursosAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__RecursosAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__2__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__3"
    // InternalCeffective.g:2500:1: rule__ServidorAplicaciones__Group_8__3 : rule__ServidorAplicaciones__Group_8__3__Impl rule__ServidorAplicaciones__Group_8__4 ;
    public final void rule__ServidorAplicaciones__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2504:1: ( rule__ServidorAplicaciones__Group_8__3__Impl rule__ServidorAplicaciones__Group_8__4 )
            // InternalCeffective.g:2505:2: rule__ServidorAplicaciones__Group_8__3__Impl rule__ServidorAplicaciones__Group_8__4
            {
            pushFollow(FOLLOW_14);
            rule__ServidorAplicaciones__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__3"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__3__Impl"
    // InternalCeffective.g:2512:1: rule__ServidorAplicaciones__Group_8__3__Impl : ( ( rule__ServidorAplicaciones__Group_8_3__0 )* ) ;
    public final void rule__ServidorAplicaciones__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2516:1: ( ( ( rule__ServidorAplicaciones__Group_8_3__0 )* ) )
            // InternalCeffective.g:2517:1: ( ( rule__ServidorAplicaciones__Group_8_3__0 )* )
            {
            // InternalCeffective.g:2517:1: ( ( rule__ServidorAplicaciones__Group_8_3__0 )* )
            // InternalCeffective.g:2518:2: ( rule__ServidorAplicaciones__Group_8_3__0 )*
            {
             before(grammarAccess.getServidorAplicacionesAccess().getGroup_8_3()); 
            // InternalCeffective.g:2519:2: ( rule__ServidorAplicaciones__Group_8_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCeffective.g:2519:3: rule__ServidorAplicaciones__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ServidorAplicaciones__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getServidorAplicacionesAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__3__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__4"
    // InternalCeffective.g:2527:1: rule__ServidorAplicaciones__Group_8__4 : rule__ServidorAplicaciones__Group_8__4__Impl ;
    public final void rule__ServidorAplicaciones__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2531:1: ( rule__ServidorAplicaciones__Group_8__4__Impl )
            // InternalCeffective.g:2532:2: rule__ServidorAplicaciones__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__4"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8__4__Impl"
    // InternalCeffective.g:2538:1: rule__ServidorAplicaciones__Group_8__4__Impl : ( ')' ) ;
    public final void rule__ServidorAplicaciones__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2542:1: ( ( ')' ) )
            // InternalCeffective.g:2543:1: ( ')' )
            {
            // InternalCeffective.g:2543:1: ( ')' )
            // InternalCeffective.g:2544:2: ')'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_8_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getRightParenthesisKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8__4__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8_3__0"
    // InternalCeffective.g:2554:1: rule__ServidorAplicaciones__Group_8_3__0 : rule__ServidorAplicaciones__Group_8_3__0__Impl rule__ServidorAplicaciones__Group_8_3__1 ;
    public final void rule__ServidorAplicaciones__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2558:1: ( rule__ServidorAplicaciones__Group_8_3__0__Impl rule__ServidorAplicaciones__Group_8_3__1 )
            // InternalCeffective.g:2559:2: rule__ServidorAplicaciones__Group_8_3__0__Impl rule__ServidorAplicaciones__Group_8_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8_3__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8_3__0__Impl"
    // InternalCeffective.g:2566:1: rule__ServidorAplicaciones__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__ServidorAplicaciones__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2570:1: ( ( ',' ) )
            // InternalCeffective.g:2571:1: ( ',' )
            {
            // InternalCeffective.g:2571:1: ( ',' )
            // InternalCeffective.g:2572:2: ','
            {
             before(grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_8_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8_3__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8_3__1"
    // InternalCeffective.g:2581:1: rule__ServidorAplicaciones__Group_8_3__1 : rule__ServidorAplicaciones__Group_8_3__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2585:1: ( rule__ServidorAplicaciones__Group_8_3__1__Impl )
            // InternalCeffective.g:2586:2: rule__ServidorAplicaciones__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8_3__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_8_3__1__Impl"
    // InternalCeffective.g:2592:1: rule__ServidorAplicaciones__Group_8_3__1__Impl : ( ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2596:1: ( ( ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 ) ) )
            // InternalCeffective.g:2597:1: ( ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 ) )
            {
            // InternalCeffective.g:2597:1: ( ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 ) )
            // InternalCeffective.g:2598:2: ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosAssignment_8_3_1()); 
            // InternalCeffective.g:2599:2: ( rule__ServidorAplicaciones__RecursosAssignment_8_3_1 )
            // InternalCeffective.g:2599:3: rule__ServidorAplicaciones__RecursosAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__RecursosAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_8_3__1__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_9__0"
    // InternalCeffective.g:2608:1: rule__ServidorAplicaciones__Group_9__0 : rule__ServidorAplicaciones__Group_9__0__Impl rule__ServidorAplicaciones__Group_9__1 ;
    public final void rule__ServidorAplicaciones__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2612:1: ( rule__ServidorAplicaciones__Group_9__0__Impl rule__ServidorAplicaciones__Group_9__1 )
            // InternalCeffective.g:2613:2: rule__ServidorAplicaciones__Group_9__0__Impl rule__ServidorAplicaciones__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorAplicaciones__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_9__0"


    // $ANTLR start "rule__ServidorAplicaciones__Group_9__0__Impl"
    // InternalCeffective.g:2620:1: rule__ServidorAplicaciones__Group_9__0__Impl : ( 'vpc' ) ;
    public final void rule__ServidorAplicaciones__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2624:1: ( ( 'vpc' ) )
            // InternalCeffective.g:2625:1: ( 'vpc' )
            {
            // InternalCeffective.g:2625:1: ( 'vpc' )
            // InternalCeffective.g:2626:2: 'vpc'
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_9_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServidorAplicacionesAccess().getVpcKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_9__0__Impl"


    // $ANTLR start "rule__ServidorAplicaciones__Group_9__1"
    // InternalCeffective.g:2635:1: rule__ServidorAplicaciones__Group_9__1 : rule__ServidorAplicaciones__Group_9__1__Impl ;
    public final void rule__ServidorAplicaciones__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2639:1: ( rule__ServidorAplicaciones__Group_9__1__Impl )
            // InternalCeffective.g:2640:2: rule__ServidorAplicaciones__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_9__1"


    // $ANTLR start "rule__ServidorAplicaciones__Group_9__1__Impl"
    // InternalCeffective.g:2646:1: rule__ServidorAplicaciones__Group_9__1__Impl : ( ( rule__ServidorAplicaciones__VpcAssignment_9_1 ) ) ;
    public final void rule__ServidorAplicaciones__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2650:1: ( ( ( rule__ServidorAplicaciones__VpcAssignment_9_1 ) ) )
            // InternalCeffective.g:2651:1: ( ( rule__ServidorAplicaciones__VpcAssignment_9_1 ) )
            {
            // InternalCeffective.g:2651:1: ( ( rule__ServidorAplicaciones__VpcAssignment_9_1 ) )
            // InternalCeffective.g:2652:2: ( rule__ServidorAplicaciones__VpcAssignment_9_1 )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcAssignment_9_1()); 
            // InternalCeffective.g:2653:2: ( rule__ServidorAplicaciones__VpcAssignment_9_1 )
            // InternalCeffective.g:2653:3: rule__ServidorAplicaciones__VpcAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorAplicaciones__VpcAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorAplicacionesAccess().getVpcAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__Group_9__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__0"
    // InternalCeffective.g:2662:1: rule__Almacenamiento__Group__0 : rule__Almacenamiento__Group__0__Impl rule__Almacenamiento__Group__1 ;
    public final void rule__Almacenamiento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2666:1: ( rule__Almacenamiento__Group__0__Impl rule__Almacenamiento__Group__1 )
            // InternalCeffective.g:2667:2: rule__Almacenamiento__Group__0__Impl rule__Almacenamiento__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Almacenamiento__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__0"


    // $ANTLR start "rule__Almacenamiento__Group__0__Impl"
    // InternalCeffective.g:2674:1: rule__Almacenamiento__Group__0__Impl : ( () ) ;
    public final void rule__Almacenamiento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2678:1: ( ( () ) )
            // InternalCeffective.g:2679:1: ( () )
            {
            // InternalCeffective.g:2679:1: ( () )
            // InternalCeffective.g:2680:2: ()
            {
             before(grammarAccess.getAlmacenamientoAccess().getAlmacenamientoAction_0()); 
            // InternalCeffective.g:2681:2: ()
            // InternalCeffective.g:2681:3: 
            {
            }

             after(grammarAccess.getAlmacenamientoAccess().getAlmacenamientoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__1"
    // InternalCeffective.g:2689:1: rule__Almacenamiento__Group__1 : rule__Almacenamiento__Group__1__Impl rule__Almacenamiento__Group__2 ;
    public final void rule__Almacenamiento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2693:1: ( rule__Almacenamiento__Group__1__Impl rule__Almacenamiento__Group__2 )
            // InternalCeffective.g:2694:2: rule__Almacenamiento__Group__1__Impl rule__Almacenamiento__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Almacenamiento__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__1"


    // $ANTLR start "rule__Almacenamiento__Group__1__Impl"
    // InternalCeffective.g:2701:1: rule__Almacenamiento__Group__1__Impl : ( 'Almacenamiento' ) ;
    public final void rule__Almacenamiento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2705:1: ( ( 'Almacenamiento' ) )
            // InternalCeffective.g:2706:1: ( 'Almacenamiento' )
            {
            // InternalCeffective.g:2706:1: ( 'Almacenamiento' )
            // InternalCeffective.g:2707:2: 'Almacenamiento'
            {
             before(grammarAccess.getAlmacenamientoAccess().getAlmacenamientoKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getAlmacenamientoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__2"
    // InternalCeffective.g:2716:1: rule__Almacenamiento__Group__2 : rule__Almacenamiento__Group__2__Impl rule__Almacenamiento__Group__3 ;
    public final void rule__Almacenamiento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2720:1: ( rule__Almacenamiento__Group__2__Impl rule__Almacenamiento__Group__3 )
            // InternalCeffective.g:2721:2: rule__Almacenamiento__Group__2__Impl rule__Almacenamiento__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Almacenamiento__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__2"


    // $ANTLR start "rule__Almacenamiento__Group__2__Impl"
    // InternalCeffective.g:2728:1: rule__Almacenamiento__Group__2__Impl : ( '{' ) ;
    public final void rule__Almacenamiento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2732:1: ( ( '{' ) )
            // InternalCeffective.g:2733:1: ( '{' )
            {
            // InternalCeffective.g:2733:1: ( '{' )
            // InternalCeffective.g:2734:2: '{'
            {
             before(grammarAccess.getAlmacenamientoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__2__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__3"
    // InternalCeffective.g:2743:1: rule__Almacenamiento__Group__3 : rule__Almacenamiento__Group__3__Impl rule__Almacenamiento__Group__4 ;
    public final void rule__Almacenamiento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2747:1: ( rule__Almacenamiento__Group__3__Impl rule__Almacenamiento__Group__4 )
            // InternalCeffective.g:2748:2: rule__Almacenamiento__Group__3__Impl rule__Almacenamiento__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Almacenamiento__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__3"


    // $ANTLR start "rule__Almacenamiento__Group__3__Impl"
    // InternalCeffective.g:2755:1: rule__Almacenamiento__Group__3__Impl : ( ( rule__Almacenamiento__Group_3__0 )? ) ;
    public final void rule__Almacenamiento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2759:1: ( ( ( rule__Almacenamiento__Group_3__0 )? ) )
            // InternalCeffective.g:2760:1: ( ( rule__Almacenamiento__Group_3__0 )? )
            {
            // InternalCeffective.g:2760:1: ( ( rule__Almacenamiento__Group_3__0 )? )
            // InternalCeffective.g:2761:2: ( rule__Almacenamiento__Group_3__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_3()); 
            // InternalCeffective.g:2762:2: ( rule__Almacenamiento__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalCeffective.g:2762:3: rule__Almacenamiento__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__3__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__4"
    // InternalCeffective.g:2770:1: rule__Almacenamiento__Group__4 : rule__Almacenamiento__Group__4__Impl rule__Almacenamiento__Group__5 ;
    public final void rule__Almacenamiento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2774:1: ( rule__Almacenamiento__Group__4__Impl rule__Almacenamiento__Group__5 )
            // InternalCeffective.g:2775:2: rule__Almacenamiento__Group__4__Impl rule__Almacenamiento__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Almacenamiento__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__4"


    // $ANTLR start "rule__Almacenamiento__Group__4__Impl"
    // InternalCeffective.g:2782:1: rule__Almacenamiento__Group__4__Impl : ( ( rule__Almacenamiento__Group_4__0 )? ) ;
    public final void rule__Almacenamiento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2786:1: ( ( ( rule__Almacenamiento__Group_4__0 )? ) )
            // InternalCeffective.g:2787:1: ( ( rule__Almacenamiento__Group_4__0 )? )
            {
            // InternalCeffective.g:2787:1: ( ( rule__Almacenamiento__Group_4__0 )? )
            // InternalCeffective.g:2788:2: ( rule__Almacenamiento__Group_4__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_4()); 
            // InternalCeffective.g:2789:2: ( rule__Almacenamiento__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalCeffective.g:2789:3: rule__Almacenamiento__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__4__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__5"
    // InternalCeffective.g:2797:1: rule__Almacenamiento__Group__5 : rule__Almacenamiento__Group__5__Impl rule__Almacenamiento__Group__6 ;
    public final void rule__Almacenamiento__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2801:1: ( rule__Almacenamiento__Group__5__Impl rule__Almacenamiento__Group__6 )
            // InternalCeffective.g:2802:2: rule__Almacenamiento__Group__5__Impl rule__Almacenamiento__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Almacenamiento__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__5"


    // $ANTLR start "rule__Almacenamiento__Group__5__Impl"
    // InternalCeffective.g:2809:1: rule__Almacenamiento__Group__5__Impl : ( ( rule__Almacenamiento__Group_5__0 )? ) ;
    public final void rule__Almacenamiento__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2813:1: ( ( ( rule__Almacenamiento__Group_5__0 )? ) )
            // InternalCeffective.g:2814:1: ( ( rule__Almacenamiento__Group_5__0 )? )
            {
            // InternalCeffective.g:2814:1: ( ( rule__Almacenamiento__Group_5__0 )? )
            // InternalCeffective.g:2815:2: ( rule__Almacenamiento__Group_5__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_5()); 
            // InternalCeffective.g:2816:2: ( rule__Almacenamiento__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCeffective.g:2816:3: rule__Almacenamiento__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__5__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__6"
    // InternalCeffective.g:2824:1: rule__Almacenamiento__Group__6 : rule__Almacenamiento__Group__6__Impl rule__Almacenamiento__Group__7 ;
    public final void rule__Almacenamiento__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2828:1: ( rule__Almacenamiento__Group__6__Impl rule__Almacenamiento__Group__7 )
            // InternalCeffective.g:2829:2: rule__Almacenamiento__Group__6__Impl rule__Almacenamiento__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Almacenamiento__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__6"


    // $ANTLR start "rule__Almacenamiento__Group__6__Impl"
    // InternalCeffective.g:2836:1: rule__Almacenamiento__Group__6__Impl : ( ( rule__Almacenamiento__Group_6__0 )? ) ;
    public final void rule__Almacenamiento__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2840:1: ( ( ( rule__Almacenamiento__Group_6__0 )? ) )
            // InternalCeffective.g:2841:1: ( ( rule__Almacenamiento__Group_6__0 )? )
            {
            // InternalCeffective.g:2841:1: ( ( rule__Almacenamiento__Group_6__0 )? )
            // InternalCeffective.g:2842:2: ( rule__Almacenamiento__Group_6__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_6()); 
            // InternalCeffective.g:2843:2: ( rule__Almacenamiento__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCeffective.g:2843:3: rule__Almacenamiento__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__6__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__7"
    // InternalCeffective.g:2851:1: rule__Almacenamiento__Group__7 : rule__Almacenamiento__Group__7__Impl rule__Almacenamiento__Group__8 ;
    public final void rule__Almacenamiento__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2855:1: ( rule__Almacenamiento__Group__7__Impl rule__Almacenamiento__Group__8 )
            // InternalCeffective.g:2856:2: rule__Almacenamiento__Group__7__Impl rule__Almacenamiento__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Almacenamiento__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__7"


    // $ANTLR start "rule__Almacenamiento__Group__7__Impl"
    // InternalCeffective.g:2863:1: rule__Almacenamiento__Group__7__Impl : ( ( rule__Almacenamiento__Group_7__0 )? ) ;
    public final void rule__Almacenamiento__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2867:1: ( ( ( rule__Almacenamiento__Group_7__0 )? ) )
            // InternalCeffective.g:2868:1: ( ( rule__Almacenamiento__Group_7__0 )? )
            {
            // InternalCeffective.g:2868:1: ( ( rule__Almacenamiento__Group_7__0 )? )
            // InternalCeffective.g:2869:2: ( rule__Almacenamiento__Group_7__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_7()); 
            // InternalCeffective.g:2870:2: ( rule__Almacenamiento__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCeffective.g:2870:3: rule__Almacenamiento__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__7__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__8"
    // InternalCeffective.g:2878:1: rule__Almacenamiento__Group__8 : rule__Almacenamiento__Group__8__Impl rule__Almacenamiento__Group__9 ;
    public final void rule__Almacenamiento__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2882:1: ( rule__Almacenamiento__Group__8__Impl rule__Almacenamiento__Group__9 )
            // InternalCeffective.g:2883:2: rule__Almacenamiento__Group__8__Impl rule__Almacenamiento__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__Almacenamiento__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__8"


    // $ANTLR start "rule__Almacenamiento__Group__8__Impl"
    // InternalCeffective.g:2890:1: rule__Almacenamiento__Group__8__Impl : ( ( rule__Almacenamiento__Group_8__0 )? ) ;
    public final void rule__Almacenamiento__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2894:1: ( ( ( rule__Almacenamiento__Group_8__0 )? ) )
            // InternalCeffective.g:2895:1: ( ( rule__Almacenamiento__Group_8__0 )? )
            {
            // InternalCeffective.g:2895:1: ( ( rule__Almacenamiento__Group_8__0 )? )
            // InternalCeffective.g:2896:2: ( rule__Almacenamiento__Group_8__0 )?
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_8()); 
            // InternalCeffective.g:2897:2: ( rule__Almacenamiento__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCeffective.g:2897:3: rule__Almacenamiento__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Almacenamiento__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlmacenamientoAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__8__Impl"


    // $ANTLR start "rule__Almacenamiento__Group__9"
    // InternalCeffective.g:2905:1: rule__Almacenamiento__Group__9 : rule__Almacenamiento__Group__9__Impl ;
    public final void rule__Almacenamiento__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2909:1: ( rule__Almacenamiento__Group__9__Impl )
            // InternalCeffective.g:2910:2: rule__Almacenamiento__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__9"


    // $ANTLR start "rule__Almacenamiento__Group__9__Impl"
    // InternalCeffective.g:2916:1: rule__Almacenamiento__Group__9__Impl : ( '}' ) ;
    public final void rule__Almacenamiento__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2920:1: ( ( '}' ) )
            // InternalCeffective.g:2921:1: ( '}' )
            {
            // InternalCeffective.g:2921:1: ( '}' )
            // InternalCeffective.g:2922:2: '}'
            {
             before(grammarAccess.getAlmacenamientoAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group__9__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_3__0"
    // InternalCeffective.g:2932:1: rule__Almacenamiento__Group_3__0 : rule__Almacenamiento__Group_3__0__Impl rule__Almacenamiento__Group_3__1 ;
    public final void rule__Almacenamiento__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2936:1: ( rule__Almacenamiento__Group_3__0__Impl rule__Almacenamiento__Group_3__1 )
            // InternalCeffective.g:2937:2: rule__Almacenamiento__Group_3__0__Impl rule__Almacenamiento__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_3__0"


    // $ANTLR start "rule__Almacenamiento__Group_3__0__Impl"
    // InternalCeffective.g:2944:1: rule__Almacenamiento__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Almacenamiento__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2948:1: ( ( 'nombre' ) )
            // InternalCeffective.g:2949:1: ( 'nombre' )
            {
            // InternalCeffective.g:2949:1: ( 'nombre' )
            // InternalCeffective.g:2950:2: 'nombre'
            {
             before(grammarAccess.getAlmacenamientoAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_3__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_3__1"
    // InternalCeffective.g:2959:1: rule__Almacenamiento__Group_3__1 : rule__Almacenamiento__Group_3__1__Impl ;
    public final void rule__Almacenamiento__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2963:1: ( rule__Almacenamiento__Group_3__1__Impl )
            // InternalCeffective.g:2964:2: rule__Almacenamiento__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_3__1"


    // $ANTLR start "rule__Almacenamiento__Group_3__1__Impl"
    // InternalCeffective.g:2970:1: rule__Almacenamiento__Group_3__1__Impl : ( ( rule__Almacenamiento__NombreAssignment_3_1 ) ) ;
    public final void rule__Almacenamiento__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2974:1: ( ( ( rule__Almacenamiento__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:2975:1: ( ( rule__Almacenamiento__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:2975:1: ( ( rule__Almacenamiento__NombreAssignment_3_1 ) )
            // InternalCeffective.g:2976:2: ( rule__Almacenamiento__NombreAssignment_3_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:2977:2: ( rule__Almacenamiento__NombreAssignment_3_1 )
            // InternalCeffective.g:2977:3: rule__Almacenamiento__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_3__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_4__0"
    // InternalCeffective.g:2986:1: rule__Almacenamiento__Group_4__0 : rule__Almacenamiento__Group_4__0__Impl rule__Almacenamiento__Group_4__1 ;
    public final void rule__Almacenamiento__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:2990:1: ( rule__Almacenamiento__Group_4__0__Impl rule__Almacenamiento__Group_4__1 )
            // InternalCeffective.g:2991:2: rule__Almacenamiento__Group_4__0__Impl rule__Almacenamiento__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_4__0"


    // $ANTLR start "rule__Almacenamiento__Group_4__0__Impl"
    // InternalCeffective.g:2998:1: rule__Almacenamiento__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__Almacenamiento__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3002:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:3003:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:3003:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:3004:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_4__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_4__1"
    // InternalCeffective.g:3013:1: rule__Almacenamiento__Group_4__1 : rule__Almacenamiento__Group_4__1__Impl ;
    public final void rule__Almacenamiento__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3017:1: ( rule__Almacenamiento__Group_4__1__Impl )
            // InternalCeffective.g:3018:2: rule__Almacenamiento__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_4__1"


    // $ANTLR start "rule__Almacenamiento__Group_4__1__Impl"
    // InternalCeffective.g:3024:1: rule__Almacenamiento__Group_4__1__Impl : ( ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__Almacenamiento__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3028:1: ( ( ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:3029:1: ( ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:3029:1: ( ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:3030:2: ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:3031:2: ( rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:3031:3: rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_4__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_5__0"
    // InternalCeffective.g:3040:1: rule__Almacenamiento__Group_5__0 : rule__Almacenamiento__Group_5__0__Impl rule__Almacenamiento__Group_5__1 ;
    public final void rule__Almacenamiento__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3044:1: ( rule__Almacenamiento__Group_5__0__Impl rule__Almacenamiento__Group_5__1 )
            // InternalCeffective.g:3045:2: rule__Almacenamiento__Group_5__0__Impl rule__Almacenamiento__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_5__0"


    // $ANTLR start "rule__Almacenamiento__Group_5__0__Impl"
    // InternalCeffective.g:3052:1: rule__Almacenamiento__Group_5__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__Almacenamiento__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3056:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:3057:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:3057:1: ( 'zonaNombre' )
            // InternalCeffective.g:3058:2: 'zonaNombre'
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaNombreKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getZonaNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_5__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_5__1"
    // InternalCeffective.g:3067:1: rule__Almacenamiento__Group_5__1 : rule__Almacenamiento__Group_5__1__Impl ;
    public final void rule__Almacenamiento__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3071:1: ( rule__Almacenamiento__Group_5__1__Impl )
            // InternalCeffective.g:3072:2: rule__Almacenamiento__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_5__1"


    // $ANTLR start "rule__Almacenamiento__Group_5__1__Impl"
    // InternalCeffective.g:3078:1: rule__Almacenamiento__Group_5__1__Impl : ( ( rule__Almacenamiento__ZonaNombreAssignment_5_1 ) ) ;
    public final void rule__Almacenamiento__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3082:1: ( ( ( rule__Almacenamiento__ZonaNombreAssignment_5_1 ) ) )
            // InternalCeffective.g:3083:1: ( ( rule__Almacenamiento__ZonaNombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:3083:1: ( ( rule__Almacenamiento__ZonaNombreAssignment_5_1 ) )
            // InternalCeffective.g:3084:2: ( rule__Almacenamiento__ZonaNombreAssignment_5_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaNombreAssignment_5_1()); 
            // InternalCeffective.g:3085:2: ( rule__Almacenamiento__ZonaNombreAssignment_5_1 )
            // InternalCeffective.g:3085:3: rule__Almacenamiento__ZonaNombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__ZonaNombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getZonaNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_5__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_6__0"
    // InternalCeffective.g:3094:1: rule__Almacenamiento__Group_6__0 : rule__Almacenamiento__Group_6__0__Impl rule__Almacenamiento__Group_6__1 ;
    public final void rule__Almacenamiento__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3098:1: ( rule__Almacenamiento__Group_6__0__Impl rule__Almacenamiento__Group_6__1 )
            // InternalCeffective.g:3099:2: rule__Almacenamiento__Group_6__0__Impl rule__Almacenamiento__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__Almacenamiento__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_6__0"


    // $ANTLR start "rule__Almacenamiento__Group_6__0__Impl"
    // InternalCeffective.g:3106:1: rule__Almacenamiento__Group_6__0__Impl : ( 'tamanoInicial' ) ;
    public final void rule__Almacenamiento__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3110:1: ( ( 'tamanoInicial' ) )
            // InternalCeffective.g:3111:1: ( 'tamanoInicial' )
            {
            // InternalCeffective.g:3111:1: ( 'tamanoInicial' )
            // InternalCeffective.g:3112:2: 'tamanoInicial'
            {
             before(grammarAccess.getAlmacenamientoAccess().getTamanoInicialKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getTamanoInicialKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_6__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_6__1"
    // InternalCeffective.g:3121:1: rule__Almacenamiento__Group_6__1 : rule__Almacenamiento__Group_6__1__Impl ;
    public final void rule__Almacenamiento__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3125:1: ( rule__Almacenamiento__Group_6__1__Impl )
            // InternalCeffective.g:3126:2: rule__Almacenamiento__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_6__1"


    // $ANTLR start "rule__Almacenamiento__Group_6__1__Impl"
    // InternalCeffective.g:3132:1: rule__Almacenamiento__Group_6__1__Impl : ( ( rule__Almacenamiento__TamanoInicialAssignment_6_1 ) ) ;
    public final void rule__Almacenamiento__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3136:1: ( ( ( rule__Almacenamiento__TamanoInicialAssignment_6_1 ) ) )
            // InternalCeffective.g:3137:1: ( ( rule__Almacenamiento__TamanoInicialAssignment_6_1 ) )
            {
            // InternalCeffective.g:3137:1: ( ( rule__Almacenamiento__TamanoInicialAssignment_6_1 ) )
            // InternalCeffective.g:3138:2: ( rule__Almacenamiento__TamanoInicialAssignment_6_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getTamanoInicialAssignment_6_1()); 
            // InternalCeffective.g:3139:2: ( rule__Almacenamiento__TamanoInicialAssignment_6_1 )
            // InternalCeffective.g:3139:3: rule__Almacenamiento__TamanoInicialAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__TamanoInicialAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getTamanoInicialAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_6__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__0"
    // InternalCeffective.g:3148:1: rule__Almacenamiento__Group_7__0 : rule__Almacenamiento__Group_7__0__Impl rule__Almacenamiento__Group_7__1 ;
    public final void rule__Almacenamiento__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3152:1: ( rule__Almacenamiento__Group_7__0__Impl rule__Almacenamiento__Group_7__1 )
            // InternalCeffective.g:3153:2: rule__Almacenamiento__Group_7__0__Impl rule__Almacenamiento__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Almacenamiento__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__0"


    // $ANTLR start "rule__Almacenamiento__Group_7__0__Impl"
    // InternalCeffective.g:3160:1: rule__Almacenamiento__Group_7__0__Impl : ( 'recursos' ) ;
    public final void rule__Almacenamiento__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3164:1: ( ( 'recursos' ) )
            // InternalCeffective.g:3165:1: ( 'recursos' )
            {
            // InternalCeffective.g:3165:1: ( 'recursos' )
            // InternalCeffective.g:3166:2: 'recursos'
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getRecursosKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__1"
    // InternalCeffective.g:3175:1: rule__Almacenamiento__Group_7__1 : rule__Almacenamiento__Group_7__1__Impl rule__Almacenamiento__Group_7__2 ;
    public final void rule__Almacenamiento__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3179:1: ( rule__Almacenamiento__Group_7__1__Impl rule__Almacenamiento__Group_7__2 )
            // InternalCeffective.g:3180:2: rule__Almacenamiento__Group_7__1__Impl rule__Almacenamiento__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__1"


    // $ANTLR start "rule__Almacenamiento__Group_7__1__Impl"
    // InternalCeffective.g:3187:1: rule__Almacenamiento__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Almacenamiento__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3191:1: ( ( '(' ) )
            // InternalCeffective.g:3192:1: ( '(' )
            {
            // InternalCeffective.g:3192:1: ( '(' )
            // InternalCeffective.g:3193:2: '('
            {
             before(grammarAccess.getAlmacenamientoAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__2"
    // InternalCeffective.g:3202:1: rule__Almacenamiento__Group_7__2 : rule__Almacenamiento__Group_7__2__Impl rule__Almacenamiento__Group_7__3 ;
    public final void rule__Almacenamiento__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3206:1: ( rule__Almacenamiento__Group_7__2__Impl rule__Almacenamiento__Group_7__3 )
            // InternalCeffective.g:3207:2: rule__Almacenamiento__Group_7__2__Impl rule__Almacenamiento__Group_7__3
            {
            pushFollow(FOLLOW_14);
            rule__Almacenamiento__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__2"


    // $ANTLR start "rule__Almacenamiento__Group_7__2__Impl"
    // InternalCeffective.g:3214:1: rule__Almacenamiento__Group_7__2__Impl : ( ( rule__Almacenamiento__RecursosAssignment_7_2 ) ) ;
    public final void rule__Almacenamiento__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3218:1: ( ( ( rule__Almacenamiento__RecursosAssignment_7_2 ) ) )
            // InternalCeffective.g:3219:1: ( ( rule__Almacenamiento__RecursosAssignment_7_2 ) )
            {
            // InternalCeffective.g:3219:1: ( ( rule__Almacenamiento__RecursosAssignment_7_2 ) )
            // InternalCeffective.g:3220:2: ( rule__Almacenamiento__RecursosAssignment_7_2 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosAssignment_7_2()); 
            // InternalCeffective.g:3221:2: ( rule__Almacenamiento__RecursosAssignment_7_2 )
            // InternalCeffective.g:3221:3: rule__Almacenamiento__RecursosAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__RecursosAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getRecursosAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__2__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__3"
    // InternalCeffective.g:3229:1: rule__Almacenamiento__Group_7__3 : rule__Almacenamiento__Group_7__3__Impl rule__Almacenamiento__Group_7__4 ;
    public final void rule__Almacenamiento__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3233:1: ( rule__Almacenamiento__Group_7__3__Impl rule__Almacenamiento__Group_7__4 )
            // InternalCeffective.g:3234:2: rule__Almacenamiento__Group_7__3__Impl rule__Almacenamiento__Group_7__4
            {
            pushFollow(FOLLOW_14);
            rule__Almacenamiento__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__3"


    // $ANTLR start "rule__Almacenamiento__Group_7__3__Impl"
    // InternalCeffective.g:3241:1: rule__Almacenamiento__Group_7__3__Impl : ( ( rule__Almacenamiento__Group_7_3__0 )* ) ;
    public final void rule__Almacenamiento__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3245:1: ( ( ( rule__Almacenamiento__Group_7_3__0 )* ) )
            // InternalCeffective.g:3246:1: ( ( rule__Almacenamiento__Group_7_3__0 )* )
            {
            // InternalCeffective.g:3246:1: ( ( rule__Almacenamiento__Group_7_3__0 )* )
            // InternalCeffective.g:3247:2: ( rule__Almacenamiento__Group_7_3__0 )*
            {
             before(grammarAccess.getAlmacenamientoAccess().getGroup_7_3()); 
            // InternalCeffective.g:3248:2: ( rule__Almacenamiento__Group_7_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCeffective.g:3248:3: rule__Almacenamiento__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Almacenamiento__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAlmacenamientoAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__3__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7__4"
    // InternalCeffective.g:3256:1: rule__Almacenamiento__Group_7__4 : rule__Almacenamiento__Group_7__4__Impl ;
    public final void rule__Almacenamiento__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3260:1: ( rule__Almacenamiento__Group_7__4__Impl )
            // InternalCeffective.g:3261:2: rule__Almacenamiento__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__4"


    // $ANTLR start "rule__Almacenamiento__Group_7__4__Impl"
    // InternalCeffective.g:3267:1: rule__Almacenamiento__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Almacenamiento__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3271:1: ( ( ')' ) )
            // InternalCeffective.g:3272:1: ( ')' )
            {
            // InternalCeffective.g:3272:1: ( ')' )
            // InternalCeffective.g:3273:2: ')'
            {
             before(grammarAccess.getAlmacenamientoAccess().getRightParenthesisKeyword_7_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7__4__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7_3__0"
    // InternalCeffective.g:3283:1: rule__Almacenamiento__Group_7_3__0 : rule__Almacenamiento__Group_7_3__0__Impl rule__Almacenamiento__Group_7_3__1 ;
    public final void rule__Almacenamiento__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3287:1: ( rule__Almacenamiento__Group_7_3__0__Impl rule__Almacenamiento__Group_7_3__1 )
            // InternalCeffective.g:3288:2: rule__Almacenamiento__Group_7_3__0__Impl rule__Almacenamiento__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7_3__0"


    // $ANTLR start "rule__Almacenamiento__Group_7_3__0__Impl"
    // InternalCeffective.g:3295:1: rule__Almacenamiento__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Almacenamiento__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3299:1: ( ( ',' ) )
            // InternalCeffective.g:3300:1: ( ',' )
            {
            // InternalCeffective.g:3300:1: ( ',' )
            // InternalCeffective.g:3301:2: ','
            {
             before(grammarAccess.getAlmacenamientoAccess().getCommaKeyword_7_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7_3__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_7_3__1"
    // InternalCeffective.g:3310:1: rule__Almacenamiento__Group_7_3__1 : rule__Almacenamiento__Group_7_3__1__Impl ;
    public final void rule__Almacenamiento__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3314:1: ( rule__Almacenamiento__Group_7_3__1__Impl )
            // InternalCeffective.g:3315:2: rule__Almacenamiento__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7_3__1"


    // $ANTLR start "rule__Almacenamiento__Group_7_3__1__Impl"
    // InternalCeffective.g:3321:1: rule__Almacenamiento__Group_7_3__1__Impl : ( ( rule__Almacenamiento__RecursosAssignment_7_3_1 ) ) ;
    public final void rule__Almacenamiento__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3325:1: ( ( ( rule__Almacenamiento__RecursosAssignment_7_3_1 ) ) )
            // InternalCeffective.g:3326:1: ( ( rule__Almacenamiento__RecursosAssignment_7_3_1 ) )
            {
            // InternalCeffective.g:3326:1: ( ( rule__Almacenamiento__RecursosAssignment_7_3_1 ) )
            // InternalCeffective.g:3327:2: ( rule__Almacenamiento__RecursosAssignment_7_3_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosAssignment_7_3_1()); 
            // InternalCeffective.g:3328:2: ( rule__Almacenamiento__RecursosAssignment_7_3_1 )
            // InternalCeffective.g:3328:3: rule__Almacenamiento__RecursosAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__RecursosAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getRecursosAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_7_3__1__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_8__0"
    // InternalCeffective.g:3337:1: rule__Almacenamiento__Group_8__0 : rule__Almacenamiento__Group_8__0__Impl rule__Almacenamiento__Group_8__1 ;
    public final void rule__Almacenamiento__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3341:1: ( rule__Almacenamiento__Group_8__0__Impl rule__Almacenamiento__Group_8__1 )
            // InternalCeffective.g:3342:2: rule__Almacenamiento__Group_8__0__Impl rule__Almacenamiento__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__Almacenamiento__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_8__0"


    // $ANTLR start "rule__Almacenamiento__Group_8__0__Impl"
    // InternalCeffective.g:3349:1: rule__Almacenamiento__Group_8__0__Impl : ( 'vpc' ) ;
    public final void rule__Almacenamiento__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3353:1: ( ( 'vpc' ) )
            // InternalCeffective.g:3354:1: ( 'vpc' )
            {
            // InternalCeffective.g:3354:1: ( 'vpc' )
            // InternalCeffective.g:3355:2: 'vpc'
            {
             before(grammarAccess.getAlmacenamientoAccess().getVpcKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAlmacenamientoAccess().getVpcKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_8__0__Impl"


    // $ANTLR start "rule__Almacenamiento__Group_8__1"
    // InternalCeffective.g:3364:1: rule__Almacenamiento__Group_8__1 : rule__Almacenamiento__Group_8__1__Impl ;
    public final void rule__Almacenamiento__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3368:1: ( rule__Almacenamiento__Group_8__1__Impl )
            // InternalCeffective.g:3369:2: rule__Almacenamiento__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_8__1"


    // $ANTLR start "rule__Almacenamiento__Group_8__1__Impl"
    // InternalCeffective.g:3375:1: rule__Almacenamiento__Group_8__1__Impl : ( ( rule__Almacenamiento__VpcAssignment_8_1 ) ) ;
    public final void rule__Almacenamiento__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3379:1: ( ( ( rule__Almacenamiento__VpcAssignment_8_1 ) ) )
            // InternalCeffective.g:3380:1: ( ( rule__Almacenamiento__VpcAssignment_8_1 ) )
            {
            // InternalCeffective.g:3380:1: ( ( rule__Almacenamiento__VpcAssignment_8_1 ) )
            // InternalCeffective.g:3381:2: ( rule__Almacenamiento__VpcAssignment_8_1 )
            {
             before(grammarAccess.getAlmacenamientoAccess().getVpcAssignment_8_1()); 
            // InternalCeffective.g:3382:2: ( rule__Almacenamiento__VpcAssignment_8_1 )
            // InternalCeffective.g:3382:3: rule__Almacenamiento__VpcAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Almacenamiento__VpcAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAlmacenamientoAccess().getVpcAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group__0"
    // InternalCeffective.g:3391:1: rule__ServidorBD__Group__0 : rule__ServidorBD__Group__0__Impl rule__ServidorBD__Group__1 ;
    public final void rule__ServidorBD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3395:1: ( rule__ServidorBD__Group__0__Impl rule__ServidorBD__Group__1 )
            // InternalCeffective.g:3396:2: rule__ServidorBD__Group__0__Impl rule__ServidorBD__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ServidorBD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__0"


    // $ANTLR start "rule__ServidorBD__Group__0__Impl"
    // InternalCeffective.g:3403:1: rule__ServidorBD__Group__0__Impl : ( () ) ;
    public final void rule__ServidorBD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3407:1: ( ( () ) )
            // InternalCeffective.g:3408:1: ( () )
            {
            // InternalCeffective.g:3408:1: ( () )
            // InternalCeffective.g:3409:2: ()
            {
             before(grammarAccess.getServidorBDAccess().getServidorBDAction_0()); 
            // InternalCeffective.g:3410:2: ()
            // InternalCeffective.g:3410:3: 
            {
            }

             after(grammarAccess.getServidorBDAccess().getServidorBDAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group__1"
    // InternalCeffective.g:3418:1: rule__ServidorBD__Group__1 : rule__ServidorBD__Group__1__Impl rule__ServidorBD__Group__2 ;
    public final void rule__ServidorBD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3422:1: ( rule__ServidorBD__Group__1__Impl rule__ServidorBD__Group__2 )
            // InternalCeffective.g:3423:2: rule__ServidorBD__Group__1__Impl rule__ServidorBD__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServidorBD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__1"


    // $ANTLR start "rule__ServidorBD__Group__1__Impl"
    // InternalCeffective.g:3430:1: rule__ServidorBD__Group__1__Impl : ( 'ServidorBD' ) ;
    public final void rule__ServidorBD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3434:1: ( ( 'ServidorBD' ) )
            // InternalCeffective.g:3435:1: ( 'ServidorBD' )
            {
            // InternalCeffective.g:3435:1: ( 'ServidorBD' )
            // InternalCeffective.g:3436:2: 'ServidorBD'
            {
             before(grammarAccess.getServidorBDAccess().getServidorBDKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getServidorBDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group__2"
    // InternalCeffective.g:3445:1: rule__ServidorBD__Group__2 : rule__ServidorBD__Group__2__Impl rule__ServidorBD__Group__3 ;
    public final void rule__ServidorBD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3449:1: ( rule__ServidorBD__Group__2__Impl rule__ServidorBD__Group__3 )
            // InternalCeffective.g:3450:2: rule__ServidorBD__Group__2__Impl rule__ServidorBD__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__2"


    // $ANTLR start "rule__ServidorBD__Group__2__Impl"
    // InternalCeffective.g:3457:1: rule__ServidorBD__Group__2__Impl : ( '{' ) ;
    public final void rule__ServidorBD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3461:1: ( ( '{' ) )
            // InternalCeffective.g:3462:1: ( '{' )
            {
            // InternalCeffective.g:3462:1: ( '{' )
            // InternalCeffective.g:3463:2: '{'
            {
             before(grammarAccess.getServidorBDAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__2__Impl"


    // $ANTLR start "rule__ServidorBD__Group__3"
    // InternalCeffective.g:3472:1: rule__ServidorBD__Group__3 : rule__ServidorBD__Group__3__Impl rule__ServidorBD__Group__4 ;
    public final void rule__ServidorBD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3476:1: ( rule__ServidorBD__Group__3__Impl rule__ServidorBD__Group__4 )
            // InternalCeffective.g:3477:2: rule__ServidorBD__Group__3__Impl rule__ServidorBD__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__3"


    // $ANTLR start "rule__ServidorBD__Group__3__Impl"
    // InternalCeffective.g:3484:1: rule__ServidorBD__Group__3__Impl : ( ( rule__ServidorBD__Group_3__0 )? ) ;
    public final void rule__ServidorBD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3488:1: ( ( ( rule__ServidorBD__Group_3__0 )? ) )
            // InternalCeffective.g:3489:1: ( ( rule__ServidorBD__Group_3__0 )? )
            {
            // InternalCeffective.g:3489:1: ( ( rule__ServidorBD__Group_3__0 )? )
            // InternalCeffective.g:3490:2: ( rule__ServidorBD__Group_3__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_3()); 
            // InternalCeffective.g:3491:2: ( rule__ServidorBD__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==27) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCeffective.g:3491:3: rule__ServidorBD__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__3__Impl"


    // $ANTLR start "rule__ServidorBD__Group__4"
    // InternalCeffective.g:3499:1: rule__ServidorBD__Group__4 : rule__ServidorBD__Group__4__Impl rule__ServidorBD__Group__5 ;
    public final void rule__ServidorBD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3503:1: ( rule__ServidorBD__Group__4__Impl rule__ServidorBD__Group__5 )
            // InternalCeffective.g:3504:2: rule__ServidorBD__Group__4__Impl rule__ServidorBD__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__4"


    // $ANTLR start "rule__ServidorBD__Group__4__Impl"
    // InternalCeffective.g:3511:1: rule__ServidorBD__Group__4__Impl : ( ( rule__ServidorBD__Group_4__0 )? ) ;
    public final void rule__ServidorBD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3515:1: ( ( ( rule__ServidorBD__Group_4__0 )? ) )
            // InternalCeffective.g:3516:1: ( ( rule__ServidorBD__Group_4__0 )? )
            {
            // InternalCeffective.g:3516:1: ( ( rule__ServidorBD__Group_4__0 )? )
            // InternalCeffective.g:3517:2: ( rule__ServidorBD__Group_4__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_4()); 
            // InternalCeffective.g:3518:2: ( rule__ServidorBD__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCeffective.g:3518:3: rule__ServidorBD__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__4__Impl"


    // $ANTLR start "rule__ServidorBD__Group__5"
    // InternalCeffective.g:3526:1: rule__ServidorBD__Group__5 : rule__ServidorBD__Group__5__Impl rule__ServidorBD__Group__6 ;
    public final void rule__ServidorBD__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3530:1: ( rule__ServidorBD__Group__5__Impl rule__ServidorBD__Group__6 )
            // InternalCeffective.g:3531:2: rule__ServidorBD__Group__5__Impl rule__ServidorBD__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__5"


    // $ANTLR start "rule__ServidorBD__Group__5__Impl"
    // InternalCeffective.g:3538:1: rule__ServidorBD__Group__5__Impl : ( ( rule__ServidorBD__Group_5__0 )? ) ;
    public final void rule__ServidorBD__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3542:1: ( ( ( rule__ServidorBD__Group_5__0 )? ) )
            // InternalCeffective.g:3543:1: ( ( rule__ServidorBD__Group_5__0 )? )
            {
            // InternalCeffective.g:3543:1: ( ( rule__ServidorBD__Group_5__0 )? )
            // InternalCeffective.g:3544:2: ( rule__ServidorBD__Group_5__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_5()); 
            // InternalCeffective.g:3545:2: ( rule__ServidorBD__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCeffective.g:3545:3: rule__ServidorBD__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__5__Impl"


    // $ANTLR start "rule__ServidorBD__Group__6"
    // InternalCeffective.g:3553:1: rule__ServidorBD__Group__6 : rule__ServidorBD__Group__6__Impl rule__ServidorBD__Group__7 ;
    public final void rule__ServidorBD__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3557:1: ( rule__ServidorBD__Group__6__Impl rule__ServidorBD__Group__7 )
            // InternalCeffective.g:3558:2: rule__ServidorBD__Group__6__Impl rule__ServidorBD__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__6"


    // $ANTLR start "rule__ServidorBD__Group__6__Impl"
    // InternalCeffective.g:3565:1: rule__ServidorBD__Group__6__Impl : ( ( rule__ServidorBD__Group_6__0 )? ) ;
    public final void rule__ServidorBD__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3569:1: ( ( ( rule__ServidorBD__Group_6__0 )? ) )
            // InternalCeffective.g:3570:1: ( ( rule__ServidorBD__Group_6__0 )? )
            {
            // InternalCeffective.g:3570:1: ( ( rule__ServidorBD__Group_6__0 )? )
            // InternalCeffective.g:3571:2: ( rule__ServidorBD__Group_6__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_6()); 
            // InternalCeffective.g:3572:2: ( rule__ServidorBD__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalCeffective.g:3572:3: rule__ServidorBD__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__6__Impl"


    // $ANTLR start "rule__ServidorBD__Group__7"
    // InternalCeffective.g:3580:1: rule__ServidorBD__Group__7 : rule__ServidorBD__Group__7__Impl rule__ServidorBD__Group__8 ;
    public final void rule__ServidorBD__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3584:1: ( rule__ServidorBD__Group__7__Impl rule__ServidorBD__Group__8 )
            // InternalCeffective.g:3585:2: rule__ServidorBD__Group__7__Impl rule__ServidorBD__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__7"


    // $ANTLR start "rule__ServidorBD__Group__7__Impl"
    // InternalCeffective.g:3592:1: rule__ServidorBD__Group__7__Impl : ( ( rule__ServidorBD__Group_7__0 )? ) ;
    public final void rule__ServidorBD__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3596:1: ( ( ( rule__ServidorBD__Group_7__0 )? ) )
            // InternalCeffective.g:3597:1: ( ( rule__ServidorBD__Group_7__0 )? )
            {
            // InternalCeffective.g:3597:1: ( ( rule__ServidorBD__Group_7__0 )? )
            // InternalCeffective.g:3598:2: ( rule__ServidorBD__Group_7__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_7()); 
            // InternalCeffective.g:3599:2: ( rule__ServidorBD__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==45) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalCeffective.g:3599:3: rule__ServidorBD__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__7__Impl"


    // $ANTLR start "rule__ServidorBD__Group__8"
    // InternalCeffective.g:3607:1: rule__ServidorBD__Group__8 : rule__ServidorBD__Group__8__Impl rule__ServidorBD__Group__9 ;
    public final void rule__ServidorBD__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3611:1: ( rule__ServidorBD__Group__8__Impl rule__ServidorBD__Group__9 )
            // InternalCeffective.g:3612:2: rule__ServidorBD__Group__8__Impl rule__ServidorBD__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__8"


    // $ANTLR start "rule__ServidorBD__Group__8__Impl"
    // InternalCeffective.g:3619:1: rule__ServidorBD__Group__8__Impl : ( ( rule__ServidorBD__Group_8__0 )? ) ;
    public final void rule__ServidorBD__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3623:1: ( ( ( rule__ServidorBD__Group_8__0 )? ) )
            // InternalCeffective.g:3624:1: ( ( rule__ServidorBD__Group_8__0 )? )
            {
            // InternalCeffective.g:3624:1: ( ( rule__ServidorBD__Group_8__0 )? )
            // InternalCeffective.g:3625:2: ( rule__ServidorBD__Group_8__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_8()); 
            // InternalCeffective.g:3626:2: ( rule__ServidorBD__Group_8__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==46) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalCeffective.g:3626:3: rule__ServidorBD__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__8__Impl"


    // $ANTLR start "rule__ServidorBD__Group__9"
    // InternalCeffective.g:3634:1: rule__ServidorBD__Group__9 : rule__ServidorBD__Group__9__Impl rule__ServidorBD__Group__10 ;
    public final void rule__ServidorBD__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3638:1: ( rule__ServidorBD__Group__9__Impl rule__ServidorBD__Group__10 )
            // InternalCeffective.g:3639:2: rule__ServidorBD__Group__9__Impl rule__ServidorBD__Group__10
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__9"


    // $ANTLR start "rule__ServidorBD__Group__9__Impl"
    // InternalCeffective.g:3646:1: rule__ServidorBD__Group__9__Impl : ( ( rule__ServidorBD__Group_9__0 )? ) ;
    public final void rule__ServidorBD__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3650:1: ( ( ( rule__ServidorBD__Group_9__0 )? ) )
            // InternalCeffective.g:3651:1: ( ( rule__ServidorBD__Group_9__0 )? )
            {
            // InternalCeffective.g:3651:1: ( ( rule__ServidorBD__Group_9__0 )? )
            // InternalCeffective.g:3652:2: ( rule__ServidorBD__Group_9__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_9()); 
            // InternalCeffective.g:3653:2: ( rule__ServidorBD__Group_9__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCeffective.g:3653:3: rule__ServidorBD__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__9__Impl"


    // $ANTLR start "rule__ServidorBD__Group__10"
    // InternalCeffective.g:3661:1: rule__ServidorBD__Group__10 : rule__ServidorBD__Group__10__Impl rule__ServidorBD__Group__11 ;
    public final void rule__ServidorBD__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3665:1: ( rule__ServidorBD__Group__10__Impl rule__ServidorBD__Group__11 )
            // InternalCeffective.g:3666:2: rule__ServidorBD__Group__10__Impl rule__ServidorBD__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__ServidorBD__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__10"


    // $ANTLR start "rule__ServidorBD__Group__10__Impl"
    // InternalCeffective.g:3673:1: rule__ServidorBD__Group__10__Impl : ( ( rule__ServidorBD__Group_10__0 )? ) ;
    public final void rule__ServidorBD__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3677:1: ( ( ( rule__ServidorBD__Group_10__0 )? ) )
            // InternalCeffective.g:3678:1: ( ( rule__ServidorBD__Group_10__0 )? )
            {
            // InternalCeffective.g:3678:1: ( ( rule__ServidorBD__Group_10__0 )? )
            // InternalCeffective.g:3679:2: ( rule__ServidorBD__Group_10__0 )?
            {
             before(grammarAccess.getServidorBDAccess().getGroup_10()); 
            // InternalCeffective.g:3680:2: ( rule__ServidorBD__Group_10__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalCeffective.g:3680:3: rule__ServidorBD__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServidorBD__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidorBDAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__10__Impl"


    // $ANTLR start "rule__ServidorBD__Group__11"
    // InternalCeffective.g:3688:1: rule__ServidorBD__Group__11 : rule__ServidorBD__Group__11__Impl ;
    public final void rule__ServidorBD__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3692:1: ( rule__ServidorBD__Group__11__Impl )
            // InternalCeffective.g:3693:2: rule__ServidorBD__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__11"


    // $ANTLR start "rule__ServidorBD__Group__11__Impl"
    // InternalCeffective.g:3699:1: rule__ServidorBD__Group__11__Impl : ( '}' ) ;
    public final void rule__ServidorBD__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3703:1: ( ( '}' ) )
            // InternalCeffective.g:3704:1: ( '}' )
            {
            // InternalCeffective.g:3704:1: ( '}' )
            // InternalCeffective.g:3705:2: '}'
            {
             before(grammarAccess.getServidorBDAccess().getRightCurlyBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group__11__Impl"


    // $ANTLR start "rule__ServidorBD__Group_3__0"
    // InternalCeffective.g:3715:1: rule__ServidorBD__Group_3__0 : rule__ServidorBD__Group_3__0__Impl rule__ServidorBD__Group_3__1 ;
    public final void rule__ServidorBD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3719:1: ( rule__ServidorBD__Group_3__0__Impl rule__ServidorBD__Group_3__1 )
            // InternalCeffective.g:3720:2: rule__ServidorBD__Group_3__0__Impl rule__ServidorBD__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_3__0"


    // $ANTLR start "rule__ServidorBD__Group_3__0__Impl"
    // InternalCeffective.g:3727:1: rule__ServidorBD__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__ServidorBD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3731:1: ( ( 'nombre' ) )
            // InternalCeffective.g:3732:1: ( 'nombre' )
            {
            // InternalCeffective.g:3732:1: ( 'nombre' )
            // InternalCeffective.g:3733:2: 'nombre'
            {
             before(grammarAccess.getServidorBDAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_3__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_3__1"
    // InternalCeffective.g:3742:1: rule__ServidorBD__Group_3__1 : rule__ServidorBD__Group_3__1__Impl ;
    public final void rule__ServidorBD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3746:1: ( rule__ServidorBD__Group_3__1__Impl )
            // InternalCeffective.g:3747:2: rule__ServidorBD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_3__1"


    // $ANTLR start "rule__ServidorBD__Group_3__1__Impl"
    // InternalCeffective.g:3753:1: rule__ServidorBD__Group_3__1__Impl : ( ( rule__ServidorBD__NombreAssignment_3_1 ) ) ;
    public final void rule__ServidorBD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3757:1: ( ( ( rule__ServidorBD__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:3758:1: ( ( rule__ServidorBD__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:3758:1: ( ( rule__ServidorBD__NombreAssignment_3_1 ) )
            // InternalCeffective.g:3759:2: ( rule__ServidorBD__NombreAssignment_3_1 )
            {
             before(grammarAccess.getServidorBDAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:3760:2: ( rule__ServidorBD__NombreAssignment_3_1 )
            // InternalCeffective.g:3760:3: rule__ServidorBD__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_3__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_4__0"
    // InternalCeffective.g:3769:1: rule__ServidorBD__Group_4__0 : rule__ServidorBD__Group_4__0__Impl rule__ServidorBD__Group_4__1 ;
    public final void rule__ServidorBD__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3773:1: ( rule__ServidorBD__Group_4__0__Impl rule__ServidorBD__Group_4__1 )
            // InternalCeffective.g:3774:2: rule__ServidorBD__Group_4__0__Impl rule__ServidorBD__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_4__0"


    // $ANTLR start "rule__ServidorBD__Group_4__0__Impl"
    // InternalCeffective.g:3781:1: rule__ServidorBD__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__ServidorBD__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3785:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:3786:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:3786:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:3787:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getServidorBDAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_4__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_4__1"
    // InternalCeffective.g:3796:1: rule__ServidorBD__Group_4__1 : rule__ServidorBD__Group_4__1__Impl ;
    public final void rule__ServidorBD__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3800:1: ( rule__ServidorBD__Group_4__1__Impl )
            // InternalCeffective.g:3801:2: rule__ServidorBD__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_4__1"


    // $ANTLR start "rule__ServidorBD__Group_4__1__Impl"
    // InternalCeffective.g:3807:1: rule__ServidorBD__Group_4__1__Impl : ( ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__ServidorBD__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3811:1: ( ( ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:3812:1: ( ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:3812:1: ( ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:3813:2: ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getServidorBDAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:3814:2: ( rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:3814:3: rule__ServidorBD__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_4__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_5__0"
    // InternalCeffective.g:3823:1: rule__ServidorBD__Group_5__0 : rule__ServidorBD__Group_5__0__Impl rule__ServidorBD__Group_5__1 ;
    public final void rule__ServidorBD__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3827:1: ( rule__ServidorBD__Group_5__0__Impl rule__ServidorBD__Group_5__1 )
            // InternalCeffective.g:3828:2: rule__ServidorBD__Group_5__0__Impl rule__ServidorBD__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_5__0"


    // $ANTLR start "rule__ServidorBD__Group_5__0__Impl"
    // InternalCeffective.g:3835:1: rule__ServidorBD__Group_5__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__ServidorBD__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3839:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:3840:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:3840:1: ( 'zonaNombre' )
            // InternalCeffective.g:3841:2: 'zonaNombre'
            {
             before(grammarAccess.getServidorBDAccess().getZonaNombreKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getZonaNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_5__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_5__1"
    // InternalCeffective.g:3850:1: rule__ServidorBD__Group_5__1 : rule__ServidorBD__Group_5__1__Impl ;
    public final void rule__ServidorBD__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3854:1: ( rule__ServidorBD__Group_5__1__Impl )
            // InternalCeffective.g:3855:2: rule__ServidorBD__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_5__1"


    // $ANTLR start "rule__ServidorBD__Group_5__1__Impl"
    // InternalCeffective.g:3861:1: rule__ServidorBD__Group_5__1__Impl : ( ( rule__ServidorBD__ZonaNombreAssignment_5_1 ) ) ;
    public final void rule__ServidorBD__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3865:1: ( ( ( rule__ServidorBD__ZonaNombreAssignment_5_1 ) ) )
            // InternalCeffective.g:3866:1: ( ( rule__ServidorBD__ZonaNombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:3866:1: ( ( rule__ServidorBD__ZonaNombreAssignment_5_1 ) )
            // InternalCeffective.g:3867:2: ( rule__ServidorBD__ZonaNombreAssignment_5_1 )
            {
             before(grammarAccess.getServidorBDAccess().getZonaNombreAssignment_5_1()); 
            // InternalCeffective.g:3868:2: ( rule__ServidorBD__ZonaNombreAssignment_5_1 )
            // InternalCeffective.g:3868:3: rule__ServidorBD__ZonaNombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__ZonaNombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getZonaNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_5__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_6__0"
    // InternalCeffective.g:3877:1: rule__ServidorBD__Group_6__0 : rule__ServidorBD__Group_6__0__Impl rule__ServidorBD__Group_6__1 ;
    public final void rule__ServidorBD__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3881:1: ( rule__ServidorBD__Group_6__0__Impl rule__ServidorBD__Group_6__1 )
            // InternalCeffective.g:3882:2: rule__ServidorBD__Group_6__0__Impl rule__ServidorBD__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__ServidorBD__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_6__0"


    // $ANTLR start "rule__ServidorBD__Group_6__0__Impl"
    // InternalCeffective.g:3889:1: rule__ServidorBD__Group_6__0__Impl : ( 'tamano' ) ;
    public final void rule__ServidorBD__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3893:1: ( ( 'tamano' ) )
            // InternalCeffective.g:3894:1: ( 'tamano' )
            {
            // InternalCeffective.g:3894:1: ( 'tamano' )
            // InternalCeffective.g:3895:2: 'tamano'
            {
             before(grammarAccess.getServidorBDAccess().getTamanoKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getTamanoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_6__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_6__1"
    // InternalCeffective.g:3904:1: rule__ServidorBD__Group_6__1 : rule__ServidorBD__Group_6__1__Impl ;
    public final void rule__ServidorBD__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3908:1: ( rule__ServidorBD__Group_6__1__Impl )
            // InternalCeffective.g:3909:2: rule__ServidorBD__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_6__1"


    // $ANTLR start "rule__ServidorBD__Group_6__1__Impl"
    // InternalCeffective.g:3915:1: rule__ServidorBD__Group_6__1__Impl : ( ( rule__ServidorBD__TamanoAssignment_6_1 ) ) ;
    public final void rule__ServidorBD__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3919:1: ( ( ( rule__ServidorBD__TamanoAssignment_6_1 ) ) )
            // InternalCeffective.g:3920:1: ( ( rule__ServidorBD__TamanoAssignment_6_1 ) )
            {
            // InternalCeffective.g:3920:1: ( ( rule__ServidorBD__TamanoAssignment_6_1 ) )
            // InternalCeffective.g:3921:2: ( rule__ServidorBD__TamanoAssignment_6_1 )
            {
             before(grammarAccess.getServidorBDAccess().getTamanoAssignment_6_1()); 
            // InternalCeffective.g:3922:2: ( rule__ServidorBD__TamanoAssignment_6_1 )
            // InternalCeffective.g:3922:3: rule__ServidorBD__TamanoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__TamanoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getTamanoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_6__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_7__0"
    // InternalCeffective.g:3931:1: rule__ServidorBD__Group_7__0 : rule__ServidorBD__Group_7__0__Impl rule__ServidorBD__Group_7__1 ;
    public final void rule__ServidorBD__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3935:1: ( rule__ServidorBD__Group_7__0__Impl rule__ServidorBD__Group_7__1 )
            // InternalCeffective.g:3936:2: rule__ServidorBD__Group_7__0__Impl rule__ServidorBD__Group_7__1
            {
            pushFollow(FOLLOW_25);
            rule__ServidorBD__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_7__0"


    // $ANTLR start "rule__ServidorBD__Group_7__0__Impl"
    // InternalCeffective.g:3943:1: rule__ServidorBD__Group_7__0__Impl : ( 'tipo' ) ;
    public final void rule__ServidorBD__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3947:1: ( ( 'tipo' ) )
            // InternalCeffective.g:3948:1: ( 'tipo' )
            {
            // InternalCeffective.g:3948:1: ( 'tipo' )
            // InternalCeffective.g:3949:2: 'tipo'
            {
             before(grammarAccess.getServidorBDAccess().getTipoKeyword_7_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getTipoKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_7__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_7__1"
    // InternalCeffective.g:3958:1: rule__ServidorBD__Group_7__1 : rule__ServidorBD__Group_7__1__Impl ;
    public final void rule__ServidorBD__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3962:1: ( rule__ServidorBD__Group_7__1__Impl )
            // InternalCeffective.g:3963:2: rule__ServidorBD__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_7__1"


    // $ANTLR start "rule__ServidorBD__Group_7__1__Impl"
    // InternalCeffective.g:3969:1: rule__ServidorBD__Group_7__1__Impl : ( ( rule__ServidorBD__TipoAssignment_7_1 ) ) ;
    public final void rule__ServidorBD__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3973:1: ( ( ( rule__ServidorBD__TipoAssignment_7_1 ) ) )
            // InternalCeffective.g:3974:1: ( ( rule__ServidorBD__TipoAssignment_7_1 ) )
            {
            // InternalCeffective.g:3974:1: ( ( rule__ServidorBD__TipoAssignment_7_1 ) )
            // InternalCeffective.g:3975:2: ( rule__ServidorBD__TipoAssignment_7_1 )
            {
             before(grammarAccess.getServidorBDAccess().getTipoAssignment_7_1()); 
            // InternalCeffective.g:3976:2: ( rule__ServidorBD__TipoAssignment_7_1 )
            // InternalCeffective.g:3976:3: rule__ServidorBD__TipoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__TipoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getTipoAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_7__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_8__0"
    // InternalCeffective.g:3985:1: rule__ServidorBD__Group_8__0 : rule__ServidorBD__Group_8__0__Impl rule__ServidorBD__Group_8__1 ;
    public final void rule__ServidorBD__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:3989:1: ( rule__ServidorBD__Group_8__0__Impl rule__ServidorBD__Group_8__1 )
            // InternalCeffective.g:3990:2: rule__ServidorBD__Group_8__0__Impl rule__ServidorBD__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_8__0"


    // $ANTLR start "rule__ServidorBD__Group_8__0__Impl"
    // InternalCeffective.g:3997:1: rule__ServidorBD__Group_8__0__Impl : ( 'sistemaManejador' ) ;
    public final void rule__ServidorBD__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4001:1: ( ( 'sistemaManejador' ) )
            // InternalCeffective.g:4002:1: ( 'sistemaManejador' )
            {
            // InternalCeffective.g:4002:1: ( 'sistemaManejador' )
            // InternalCeffective.g:4003:2: 'sistemaManejador'
            {
             before(grammarAccess.getServidorBDAccess().getSistemaManejadorKeyword_8_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getSistemaManejadorKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_8__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_8__1"
    // InternalCeffective.g:4012:1: rule__ServidorBD__Group_8__1 : rule__ServidorBD__Group_8__1__Impl ;
    public final void rule__ServidorBD__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4016:1: ( rule__ServidorBD__Group_8__1__Impl )
            // InternalCeffective.g:4017:2: rule__ServidorBD__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_8__1"


    // $ANTLR start "rule__ServidorBD__Group_8__1__Impl"
    // InternalCeffective.g:4023:1: rule__ServidorBD__Group_8__1__Impl : ( ( rule__ServidorBD__SistemaManejadorAssignment_8_1 ) ) ;
    public final void rule__ServidorBD__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4027:1: ( ( ( rule__ServidorBD__SistemaManejadorAssignment_8_1 ) ) )
            // InternalCeffective.g:4028:1: ( ( rule__ServidorBD__SistemaManejadorAssignment_8_1 ) )
            {
            // InternalCeffective.g:4028:1: ( ( rule__ServidorBD__SistemaManejadorAssignment_8_1 ) )
            // InternalCeffective.g:4029:2: ( rule__ServidorBD__SistemaManejadorAssignment_8_1 )
            {
             before(grammarAccess.getServidorBDAccess().getSistemaManejadorAssignment_8_1()); 
            // InternalCeffective.g:4030:2: ( rule__ServidorBD__SistemaManejadorAssignment_8_1 )
            // InternalCeffective.g:4030:3: rule__ServidorBD__SistemaManejadorAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__SistemaManejadorAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getSistemaManejadorAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_8__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__0"
    // InternalCeffective.g:4039:1: rule__ServidorBD__Group_9__0 : rule__ServidorBD__Group_9__0__Impl rule__ServidorBD__Group_9__1 ;
    public final void rule__ServidorBD__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4043:1: ( rule__ServidorBD__Group_9__0__Impl rule__ServidorBD__Group_9__1 )
            // InternalCeffective.g:4044:2: rule__ServidorBD__Group_9__0__Impl rule__ServidorBD__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__ServidorBD__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__0"


    // $ANTLR start "rule__ServidorBD__Group_9__0__Impl"
    // InternalCeffective.g:4051:1: rule__ServidorBD__Group_9__0__Impl : ( 'recursos' ) ;
    public final void rule__ServidorBD__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4055:1: ( ( 'recursos' ) )
            // InternalCeffective.g:4056:1: ( 'recursos' )
            {
            // InternalCeffective.g:4056:1: ( 'recursos' )
            // InternalCeffective.g:4057:2: 'recursos'
            {
             before(grammarAccess.getServidorBDAccess().getRecursosKeyword_9_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getRecursosKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__1"
    // InternalCeffective.g:4066:1: rule__ServidorBD__Group_9__1 : rule__ServidorBD__Group_9__1__Impl rule__ServidorBD__Group_9__2 ;
    public final void rule__ServidorBD__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4070:1: ( rule__ServidorBD__Group_9__1__Impl rule__ServidorBD__Group_9__2 )
            // InternalCeffective.g:4071:2: rule__ServidorBD__Group_9__1__Impl rule__ServidorBD__Group_9__2
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__1"


    // $ANTLR start "rule__ServidorBD__Group_9__1__Impl"
    // InternalCeffective.g:4078:1: rule__ServidorBD__Group_9__1__Impl : ( '(' ) ;
    public final void rule__ServidorBD__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4082:1: ( ( '(' ) )
            // InternalCeffective.g:4083:1: ( '(' )
            {
            // InternalCeffective.g:4083:1: ( '(' )
            // InternalCeffective.g:4084:2: '('
            {
             before(grammarAccess.getServidorBDAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__2"
    // InternalCeffective.g:4093:1: rule__ServidorBD__Group_9__2 : rule__ServidorBD__Group_9__2__Impl rule__ServidorBD__Group_9__3 ;
    public final void rule__ServidorBD__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4097:1: ( rule__ServidorBD__Group_9__2__Impl rule__ServidorBD__Group_9__3 )
            // InternalCeffective.g:4098:2: rule__ServidorBD__Group_9__2__Impl rule__ServidorBD__Group_9__3
            {
            pushFollow(FOLLOW_14);
            rule__ServidorBD__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__2"


    // $ANTLR start "rule__ServidorBD__Group_9__2__Impl"
    // InternalCeffective.g:4105:1: rule__ServidorBD__Group_9__2__Impl : ( ( rule__ServidorBD__RecursosAssignment_9_2 ) ) ;
    public final void rule__ServidorBD__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4109:1: ( ( ( rule__ServidorBD__RecursosAssignment_9_2 ) ) )
            // InternalCeffective.g:4110:1: ( ( rule__ServidorBD__RecursosAssignment_9_2 ) )
            {
            // InternalCeffective.g:4110:1: ( ( rule__ServidorBD__RecursosAssignment_9_2 ) )
            // InternalCeffective.g:4111:2: ( rule__ServidorBD__RecursosAssignment_9_2 )
            {
             before(grammarAccess.getServidorBDAccess().getRecursosAssignment_9_2()); 
            // InternalCeffective.g:4112:2: ( rule__ServidorBD__RecursosAssignment_9_2 )
            // InternalCeffective.g:4112:3: rule__ServidorBD__RecursosAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__RecursosAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getRecursosAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__2__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__3"
    // InternalCeffective.g:4120:1: rule__ServidorBD__Group_9__3 : rule__ServidorBD__Group_9__3__Impl rule__ServidorBD__Group_9__4 ;
    public final void rule__ServidorBD__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4124:1: ( rule__ServidorBD__Group_9__3__Impl rule__ServidorBD__Group_9__4 )
            // InternalCeffective.g:4125:2: rule__ServidorBD__Group_9__3__Impl rule__ServidorBD__Group_9__4
            {
            pushFollow(FOLLOW_14);
            rule__ServidorBD__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__3"


    // $ANTLR start "rule__ServidorBD__Group_9__3__Impl"
    // InternalCeffective.g:4132:1: rule__ServidorBD__Group_9__3__Impl : ( ( rule__ServidorBD__Group_9_3__0 )* ) ;
    public final void rule__ServidorBD__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4136:1: ( ( ( rule__ServidorBD__Group_9_3__0 )* ) )
            // InternalCeffective.g:4137:1: ( ( rule__ServidorBD__Group_9_3__0 )* )
            {
            // InternalCeffective.g:4137:1: ( ( rule__ServidorBD__Group_9_3__0 )* )
            // InternalCeffective.g:4138:2: ( rule__ServidorBD__Group_9_3__0 )*
            {
             before(grammarAccess.getServidorBDAccess().getGroup_9_3()); 
            // InternalCeffective.g:4139:2: ( rule__ServidorBD__Group_9_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==31) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCeffective.g:4139:3: rule__ServidorBD__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ServidorBD__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getServidorBDAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__3__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9__4"
    // InternalCeffective.g:4147:1: rule__ServidorBD__Group_9__4 : rule__ServidorBD__Group_9__4__Impl ;
    public final void rule__ServidorBD__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4151:1: ( rule__ServidorBD__Group_9__4__Impl )
            // InternalCeffective.g:4152:2: rule__ServidorBD__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__4"


    // $ANTLR start "rule__ServidorBD__Group_9__4__Impl"
    // InternalCeffective.g:4158:1: rule__ServidorBD__Group_9__4__Impl : ( ')' ) ;
    public final void rule__ServidorBD__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4162:1: ( ( ')' ) )
            // InternalCeffective.g:4163:1: ( ')' )
            {
            // InternalCeffective.g:4163:1: ( ')' )
            // InternalCeffective.g:4164:2: ')'
            {
             before(grammarAccess.getServidorBDAccess().getRightParenthesisKeyword_9_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getRightParenthesisKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9__4__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9_3__0"
    // InternalCeffective.g:4174:1: rule__ServidorBD__Group_9_3__0 : rule__ServidorBD__Group_9_3__0__Impl rule__ServidorBD__Group_9_3__1 ;
    public final void rule__ServidorBD__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4178:1: ( rule__ServidorBD__Group_9_3__0__Impl rule__ServidorBD__Group_9_3__1 )
            // InternalCeffective.g:4179:2: rule__ServidorBD__Group_9_3__0__Impl rule__ServidorBD__Group_9_3__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9_3__0"


    // $ANTLR start "rule__ServidorBD__Group_9_3__0__Impl"
    // InternalCeffective.g:4186:1: rule__ServidorBD__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__ServidorBD__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4190:1: ( ( ',' ) )
            // InternalCeffective.g:4191:1: ( ',' )
            {
            // InternalCeffective.g:4191:1: ( ',' )
            // InternalCeffective.g:4192:2: ','
            {
             before(grammarAccess.getServidorBDAccess().getCommaKeyword_9_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9_3__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_9_3__1"
    // InternalCeffective.g:4201:1: rule__ServidorBD__Group_9_3__1 : rule__ServidorBD__Group_9_3__1__Impl ;
    public final void rule__ServidorBD__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4205:1: ( rule__ServidorBD__Group_9_3__1__Impl )
            // InternalCeffective.g:4206:2: rule__ServidorBD__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9_3__1"


    // $ANTLR start "rule__ServidorBD__Group_9_3__1__Impl"
    // InternalCeffective.g:4212:1: rule__ServidorBD__Group_9_3__1__Impl : ( ( rule__ServidorBD__RecursosAssignment_9_3_1 ) ) ;
    public final void rule__ServidorBD__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4216:1: ( ( ( rule__ServidorBD__RecursosAssignment_9_3_1 ) ) )
            // InternalCeffective.g:4217:1: ( ( rule__ServidorBD__RecursosAssignment_9_3_1 ) )
            {
            // InternalCeffective.g:4217:1: ( ( rule__ServidorBD__RecursosAssignment_9_3_1 ) )
            // InternalCeffective.g:4218:2: ( rule__ServidorBD__RecursosAssignment_9_3_1 )
            {
             before(grammarAccess.getServidorBDAccess().getRecursosAssignment_9_3_1()); 
            // InternalCeffective.g:4219:2: ( rule__ServidorBD__RecursosAssignment_9_3_1 )
            // InternalCeffective.g:4219:3: rule__ServidorBD__RecursosAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__RecursosAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getRecursosAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_9_3__1__Impl"


    // $ANTLR start "rule__ServidorBD__Group_10__0"
    // InternalCeffective.g:4228:1: rule__ServidorBD__Group_10__0 : rule__ServidorBD__Group_10__0__Impl rule__ServidorBD__Group_10__1 ;
    public final void rule__ServidorBD__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4232:1: ( rule__ServidorBD__Group_10__0__Impl rule__ServidorBD__Group_10__1 )
            // InternalCeffective.g:4233:2: rule__ServidorBD__Group_10__0__Impl rule__ServidorBD__Group_10__1
            {
            pushFollow(FOLLOW_12);
            rule__ServidorBD__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_10__0"


    // $ANTLR start "rule__ServidorBD__Group_10__0__Impl"
    // InternalCeffective.g:4240:1: rule__ServidorBD__Group_10__0__Impl : ( 'vpc' ) ;
    public final void rule__ServidorBD__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4244:1: ( ( 'vpc' ) )
            // InternalCeffective.g:4245:1: ( 'vpc' )
            {
            // InternalCeffective.g:4245:1: ( 'vpc' )
            // InternalCeffective.g:4246:2: 'vpc'
            {
             before(grammarAccess.getServidorBDAccess().getVpcKeyword_10_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServidorBDAccess().getVpcKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_10__0__Impl"


    // $ANTLR start "rule__ServidorBD__Group_10__1"
    // InternalCeffective.g:4255:1: rule__ServidorBD__Group_10__1 : rule__ServidorBD__Group_10__1__Impl ;
    public final void rule__ServidorBD__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4259:1: ( rule__ServidorBD__Group_10__1__Impl )
            // InternalCeffective.g:4260:2: rule__ServidorBD__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_10__1"


    // $ANTLR start "rule__ServidorBD__Group_10__1__Impl"
    // InternalCeffective.g:4266:1: rule__ServidorBD__Group_10__1__Impl : ( ( rule__ServidorBD__VpcAssignment_10_1 ) ) ;
    public final void rule__ServidorBD__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4270:1: ( ( ( rule__ServidorBD__VpcAssignment_10_1 ) ) )
            // InternalCeffective.g:4271:1: ( ( rule__ServidorBD__VpcAssignment_10_1 ) )
            {
            // InternalCeffective.g:4271:1: ( ( rule__ServidorBD__VpcAssignment_10_1 ) )
            // InternalCeffective.g:4272:2: ( rule__ServidorBD__VpcAssignment_10_1 )
            {
             before(grammarAccess.getServidorBDAccess().getVpcAssignment_10_1()); 
            // InternalCeffective.g:4273:2: ( rule__ServidorBD__VpcAssignment_10_1 )
            // InternalCeffective.g:4273:3: rule__ServidorBD__VpcAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__ServidorBD__VpcAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getServidorBDAccess().getVpcAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__Group_10__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__0"
    // InternalCeffective.g:4282:1: rule__Servidor_Impl__Group__0 : rule__Servidor_Impl__Group__0__Impl rule__Servidor_Impl__Group__1 ;
    public final void rule__Servidor_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4286:1: ( rule__Servidor_Impl__Group__0__Impl rule__Servidor_Impl__Group__1 )
            // InternalCeffective.g:4287:2: rule__Servidor_Impl__Group__0__Impl rule__Servidor_Impl__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Servidor_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__0"


    // $ANTLR start "rule__Servidor_Impl__Group__0__Impl"
    // InternalCeffective.g:4294:1: rule__Servidor_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Servidor_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4298:1: ( ( () ) )
            // InternalCeffective.g:4299:1: ( () )
            {
            // InternalCeffective.g:4299:1: ( () )
            // InternalCeffective.g:4300:2: ()
            {
             before(grammarAccess.getServidor_ImplAccess().getServidorAction_0()); 
            // InternalCeffective.g:4301:2: ()
            // InternalCeffective.g:4301:3: 
            {
            }

             after(grammarAccess.getServidor_ImplAccess().getServidorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__1"
    // InternalCeffective.g:4309:1: rule__Servidor_Impl__Group__1 : rule__Servidor_Impl__Group__1__Impl rule__Servidor_Impl__Group__2 ;
    public final void rule__Servidor_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4313:1: ( rule__Servidor_Impl__Group__1__Impl rule__Servidor_Impl__Group__2 )
            // InternalCeffective.g:4314:2: rule__Servidor_Impl__Group__1__Impl rule__Servidor_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Servidor_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__1"


    // $ANTLR start "rule__Servidor_Impl__Group__1__Impl"
    // InternalCeffective.g:4321:1: rule__Servidor_Impl__Group__1__Impl : ( 'Servidor' ) ;
    public final void rule__Servidor_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4325:1: ( ( 'Servidor' ) )
            // InternalCeffective.g:4326:1: ( 'Servidor' )
            {
            // InternalCeffective.g:4326:1: ( 'Servidor' )
            // InternalCeffective.g:4327:2: 'Servidor'
            {
             before(grammarAccess.getServidor_ImplAccess().getServidorKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getServidorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__2"
    // InternalCeffective.g:4336:1: rule__Servidor_Impl__Group__2 : rule__Servidor_Impl__Group__2__Impl rule__Servidor_Impl__Group__3 ;
    public final void rule__Servidor_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4340:1: ( rule__Servidor_Impl__Group__2__Impl rule__Servidor_Impl__Group__3 )
            // InternalCeffective.g:4341:2: rule__Servidor_Impl__Group__2__Impl rule__Servidor_Impl__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Servidor_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__2"


    // $ANTLR start "rule__Servidor_Impl__Group__2__Impl"
    // InternalCeffective.g:4348:1: rule__Servidor_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Servidor_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4352:1: ( ( '{' ) )
            // InternalCeffective.g:4353:1: ( '{' )
            {
            // InternalCeffective.g:4353:1: ( '{' )
            // InternalCeffective.g:4354:2: '{'
            {
             before(grammarAccess.getServidor_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__2__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__3"
    // InternalCeffective.g:4363:1: rule__Servidor_Impl__Group__3 : rule__Servidor_Impl__Group__3__Impl rule__Servidor_Impl__Group__4 ;
    public final void rule__Servidor_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4367:1: ( rule__Servidor_Impl__Group__3__Impl rule__Servidor_Impl__Group__4 )
            // InternalCeffective.g:4368:2: rule__Servidor_Impl__Group__3__Impl rule__Servidor_Impl__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Servidor_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__3"


    // $ANTLR start "rule__Servidor_Impl__Group__3__Impl"
    // InternalCeffective.g:4375:1: rule__Servidor_Impl__Group__3__Impl : ( ( rule__Servidor_Impl__Group_3__0 )? ) ;
    public final void rule__Servidor_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4379:1: ( ( ( rule__Servidor_Impl__Group_3__0 )? ) )
            // InternalCeffective.g:4380:1: ( ( rule__Servidor_Impl__Group_3__0 )? )
            {
            // InternalCeffective.g:4380:1: ( ( rule__Servidor_Impl__Group_3__0 )? )
            // InternalCeffective.g:4381:2: ( rule__Servidor_Impl__Group_3__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_3()); 
            // InternalCeffective.g:4382:2: ( rule__Servidor_Impl__Group_3__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==27) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalCeffective.g:4382:3: rule__Servidor_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__3__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__4"
    // InternalCeffective.g:4390:1: rule__Servidor_Impl__Group__4 : rule__Servidor_Impl__Group__4__Impl rule__Servidor_Impl__Group__5 ;
    public final void rule__Servidor_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4394:1: ( rule__Servidor_Impl__Group__4__Impl rule__Servidor_Impl__Group__5 )
            // InternalCeffective.g:4395:2: rule__Servidor_Impl__Group__4__Impl rule__Servidor_Impl__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Servidor_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__4"


    // $ANTLR start "rule__Servidor_Impl__Group__4__Impl"
    // InternalCeffective.g:4402:1: rule__Servidor_Impl__Group__4__Impl : ( ( rule__Servidor_Impl__Group_4__0 )? ) ;
    public final void rule__Servidor_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4406:1: ( ( ( rule__Servidor_Impl__Group_4__0 )? ) )
            // InternalCeffective.g:4407:1: ( ( rule__Servidor_Impl__Group_4__0 )? )
            {
            // InternalCeffective.g:4407:1: ( ( rule__Servidor_Impl__Group_4__0 )? )
            // InternalCeffective.g:4408:2: ( rule__Servidor_Impl__Group_4__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_4()); 
            // InternalCeffective.g:4409:2: ( rule__Servidor_Impl__Group_4__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==37) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCeffective.g:4409:3: rule__Servidor_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__4__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__5"
    // InternalCeffective.g:4417:1: rule__Servidor_Impl__Group__5 : rule__Servidor_Impl__Group__5__Impl rule__Servidor_Impl__Group__6 ;
    public final void rule__Servidor_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4421:1: ( rule__Servidor_Impl__Group__5__Impl rule__Servidor_Impl__Group__6 )
            // InternalCeffective.g:4422:2: rule__Servidor_Impl__Group__5__Impl rule__Servidor_Impl__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Servidor_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__5"


    // $ANTLR start "rule__Servidor_Impl__Group__5__Impl"
    // InternalCeffective.g:4429:1: rule__Servidor_Impl__Group__5__Impl : ( ( rule__Servidor_Impl__Group_5__0 )? ) ;
    public final void rule__Servidor_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4433:1: ( ( ( rule__Servidor_Impl__Group_5__0 )? ) )
            // InternalCeffective.g:4434:1: ( ( rule__Servidor_Impl__Group_5__0 )? )
            {
            // InternalCeffective.g:4434:1: ( ( rule__Servidor_Impl__Group_5__0 )? )
            // InternalCeffective.g:4435:2: ( rule__Servidor_Impl__Group_5__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_5()); 
            // InternalCeffective.g:4436:2: ( rule__Servidor_Impl__Group_5__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCeffective.g:4436:3: rule__Servidor_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__5__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__6"
    // InternalCeffective.g:4444:1: rule__Servidor_Impl__Group__6 : rule__Servidor_Impl__Group__6__Impl rule__Servidor_Impl__Group__7 ;
    public final void rule__Servidor_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4448:1: ( rule__Servidor_Impl__Group__6__Impl rule__Servidor_Impl__Group__7 )
            // InternalCeffective.g:4449:2: rule__Servidor_Impl__Group__6__Impl rule__Servidor_Impl__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Servidor_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__6"


    // $ANTLR start "rule__Servidor_Impl__Group__6__Impl"
    // InternalCeffective.g:4456:1: rule__Servidor_Impl__Group__6__Impl : ( ( rule__Servidor_Impl__Group_6__0 )? ) ;
    public final void rule__Servidor_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4460:1: ( ( ( rule__Servidor_Impl__Group_6__0 )? ) )
            // InternalCeffective.g:4461:1: ( ( rule__Servidor_Impl__Group_6__0 )? )
            {
            // InternalCeffective.g:4461:1: ( ( rule__Servidor_Impl__Group_6__0 )? )
            // InternalCeffective.g:4462:2: ( rule__Servidor_Impl__Group_6__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_6()); 
            // InternalCeffective.g:4463:2: ( rule__Servidor_Impl__Group_6__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==39) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCeffective.g:4463:3: rule__Servidor_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__6__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__7"
    // InternalCeffective.g:4471:1: rule__Servidor_Impl__Group__7 : rule__Servidor_Impl__Group__7__Impl rule__Servidor_Impl__Group__8 ;
    public final void rule__Servidor_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4475:1: ( rule__Servidor_Impl__Group__7__Impl rule__Servidor_Impl__Group__8 )
            // InternalCeffective.g:4476:2: rule__Servidor_Impl__Group__7__Impl rule__Servidor_Impl__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__Servidor_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__7"


    // $ANTLR start "rule__Servidor_Impl__Group__7__Impl"
    // InternalCeffective.g:4483:1: rule__Servidor_Impl__Group__7__Impl : ( ( rule__Servidor_Impl__Group_7__0 )? ) ;
    public final void rule__Servidor_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4487:1: ( ( ( rule__Servidor_Impl__Group_7__0 )? ) )
            // InternalCeffective.g:4488:1: ( ( rule__Servidor_Impl__Group_7__0 )? )
            {
            // InternalCeffective.g:4488:1: ( ( rule__Servidor_Impl__Group_7__0 )? )
            // InternalCeffective.g:4489:2: ( rule__Servidor_Impl__Group_7__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_7()); 
            // InternalCeffective.g:4490:2: ( rule__Servidor_Impl__Group_7__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==41) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCeffective.g:4490:3: rule__Servidor_Impl__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__7__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__8"
    // InternalCeffective.g:4498:1: rule__Servidor_Impl__Group__8 : rule__Servidor_Impl__Group__8__Impl rule__Servidor_Impl__Group__9 ;
    public final void rule__Servidor_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4502:1: ( rule__Servidor_Impl__Group__8__Impl rule__Servidor_Impl__Group__9 )
            // InternalCeffective.g:4503:2: rule__Servidor_Impl__Group__8__Impl rule__Servidor_Impl__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__Servidor_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__8"


    // $ANTLR start "rule__Servidor_Impl__Group__8__Impl"
    // InternalCeffective.g:4510:1: rule__Servidor_Impl__Group__8__Impl : ( ( rule__Servidor_Impl__Group_8__0 )? ) ;
    public final void rule__Servidor_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4514:1: ( ( ( rule__Servidor_Impl__Group_8__0 )? ) )
            // InternalCeffective.g:4515:1: ( ( rule__Servidor_Impl__Group_8__0 )? )
            {
            // InternalCeffective.g:4515:1: ( ( rule__Servidor_Impl__Group_8__0 )? )
            // InternalCeffective.g:4516:2: ( rule__Servidor_Impl__Group_8__0 )?
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_8()); 
            // InternalCeffective.g:4517:2: ( rule__Servidor_Impl__Group_8__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCeffective.g:4517:3: rule__Servidor_Impl__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Servidor_Impl__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServidor_ImplAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__8__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group__9"
    // InternalCeffective.g:4525:1: rule__Servidor_Impl__Group__9 : rule__Servidor_Impl__Group__9__Impl ;
    public final void rule__Servidor_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4529:1: ( rule__Servidor_Impl__Group__9__Impl )
            // InternalCeffective.g:4530:2: rule__Servidor_Impl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__9"


    // $ANTLR start "rule__Servidor_Impl__Group__9__Impl"
    // InternalCeffective.g:4536:1: rule__Servidor_Impl__Group__9__Impl : ( '}' ) ;
    public final void rule__Servidor_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4540:1: ( ( '}' ) )
            // InternalCeffective.g:4541:1: ( '}' )
            {
            // InternalCeffective.g:4541:1: ( '}' )
            // InternalCeffective.g:4542:2: '}'
            {
             before(grammarAccess.getServidor_ImplAccess().getRightCurlyBracketKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group__9__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_3__0"
    // InternalCeffective.g:4552:1: rule__Servidor_Impl__Group_3__0 : rule__Servidor_Impl__Group_3__0__Impl rule__Servidor_Impl__Group_3__1 ;
    public final void rule__Servidor_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4556:1: ( rule__Servidor_Impl__Group_3__0__Impl rule__Servidor_Impl__Group_3__1 )
            // InternalCeffective.g:4557:2: rule__Servidor_Impl__Group_3__0__Impl rule__Servidor_Impl__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_3__0"


    // $ANTLR start "rule__Servidor_Impl__Group_3__0__Impl"
    // InternalCeffective.g:4564:1: rule__Servidor_Impl__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Servidor_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4568:1: ( ( 'nombre' ) )
            // InternalCeffective.g:4569:1: ( 'nombre' )
            {
            // InternalCeffective.g:4569:1: ( 'nombre' )
            // InternalCeffective.g:4570:2: 'nombre'
            {
             before(grammarAccess.getServidor_ImplAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_3__1"
    // InternalCeffective.g:4579:1: rule__Servidor_Impl__Group_3__1 : rule__Servidor_Impl__Group_3__1__Impl ;
    public final void rule__Servidor_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4583:1: ( rule__Servidor_Impl__Group_3__1__Impl )
            // InternalCeffective.g:4584:2: rule__Servidor_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_3__1"


    // $ANTLR start "rule__Servidor_Impl__Group_3__1__Impl"
    // InternalCeffective.g:4590:1: rule__Servidor_Impl__Group_3__1__Impl : ( ( rule__Servidor_Impl__NombreAssignment_3_1 ) ) ;
    public final void rule__Servidor_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4594:1: ( ( ( rule__Servidor_Impl__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:4595:1: ( ( rule__Servidor_Impl__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:4595:1: ( ( rule__Servidor_Impl__NombreAssignment_3_1 ) )
            // InternalCeffective.g:4596:2: ( rule__Servidor_Impl__NombreAssignment_3_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:4597:2: ( rule__Servidor_Impl__NombreAssignment_3_1 )
            // InternalCeffective.g:4597:3: rule__Servidor_Impl__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_4__0"
    // InternalCeffective.g:4606:1: rule__Servidor_Impl__Group_4__0 : rule__Servidor_Impl__Group_4__0__Impl rule__Servidor_Impl__Group_4__1 ;
    public final void rule__Servidor_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4610:1: ( rule__Servidor_Impl__Group_4__0__Impl rule__Servidor_Impl__Group_4__1 )
            // InternalCeffective.g:4611:2: rule__Servidor_Impl__Group_4__0__Impl rule__Servidor_Impl__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_4__0"


    // $ANTLR start "rule__Servidor_Impl__Group_4__0__Impl"
    // InternalCeffective.g:4618:1: rule__Servidor_Impl__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__Servidor_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4622:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:4623:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:4623:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:4624:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_4__1"
    // InternalCeffective.g:4633:1: rule__Servidor_Impl__Group_4__1 : rule__Servidor_Impl__Group_4__1__Impl ;
    public final void rule__Servidor_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4637:1: ( rule__Servidor_Impl__Group_4__1__Impl )
            // InternalCeffective.g:4638:2: rule__Servidor_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_4__1"


    // $ANTLR start "rule__Servidor_Impl__Group_4__1__Impl"
    // InternalCeffective.g:4644:1: rule__Servidor_Impl__Group_4__1__Impl : ( ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__Servidor_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4648:1: ( ( ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:4649:1: ( ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:4649:1: ( ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:4650:2: ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:4651:2: ( rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:4651:3: rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_5__0"
    // InternalCeffective.g:4660:1: rule__Servidor_Impl__Group_5__0 : rule__Servidor_Impl__Group_5__0__Impl rule__Servidor_Impl__Group_5__1 ;
    public final void rule__Servidor_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4664:1: ( rule__Servidor_Impl__Group_5__0__Impl rule__Servidor_Impl__Group_5__1 )
            // InternalCeffective.g:4665:2: rule__Servidor_Impl__Group_5__0__Impl rule__Servidor_Impl__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_5__0"


    // $ANTLR start "rule__Servidor_Impl__Group_5__0__Impl"
    // InternalCeffective.g:4672:1: rule__Servidor_Impl__Group_5__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__Servidor_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4676:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:4677:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:4677:1: ( 'zonaNombre' )
            // InternalCeffective.g:4678:2: 'zonaNombre'
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaNombreKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getZonaNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_5__1"
    // InternalCeffective.g:4687:1: rule__Servidor_Impl__Group_5__1 : rule__Servidor_Impl__Group_5__1__Impl ;
    public final void rule__Servidor_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4691:1: ( rule__Servidor_Impl__Group_5__1__Impl )
            // InternalCeffective.g:4692:2: rule__Servidor_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_5__1"


    // $ANTLR start "rule__Servidor_Impl__Group_5__1__Impl"
    // InternalCeffective.g:4698:1: rule__Servidor_Impl__Group_5__1__Impl : ( ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 ) ) ;
    public final void rule__Servidor_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4702:1: ( ( ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 ) ) )
            // InternalCeffective.g:4703:1: ( ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:4703:1: ( ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 ) )
            // InternalCeffective.g:4704:2: ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaNombreAssignment_5_1()); 
            // InternalCeffective.g:4705:2: ( rule__Servidor_Impl__ZonaNombreAssignment_5_1 )
            // InternalCeffective.g:4705:3: rule__Servidor_Impl__ZonaNombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__ZonaNombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getZonaNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_6__0"
    // InternalCeffective.g:4714:1: rule__Servidor_Impl__Group_6__0 : rule__Servidor_Impl__Group_6__0__Impl rule__Servidor_Impl__Group_6__1 ;
    public final void rule__Servidor_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4718:1: ( rule__Servidor_Impl__Group_6__0__Impl rule__Servidor_Impl__Group_6__1 )
            // InternalCeffective.g:4719:2: rule__Servidor_Impl__Group_6__0__Impl rule__Servidor_Impl__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Servidor_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_6__0"


    // $ANTLR start "rule__Servidor_Impl__Group_6__0__Impl"
    // InternalCeffective.g:4726:1: rule__Servidor_Impl__Group_6__0__Impl : ( 'tamano' ) ;
    public final void rule__Servidor_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4730:1: ( ( 'tamano' ) )
            // InternalCeffective.g:4731:1: ( 'tamano' )
            {
            // InternalCeffective.g:4731:1: ( 'tamano' )
            // InternalCeffective.g:4732:2: 'tamano'
            {
             before(grammarAccess.getServidor_ImplAccess().getTamanoKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getTamanoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_6__1"
    // InternalCeffective.g:4741:1: rule__Servidor_Impl__Group_6__1 : rule__Servidor_Impl__Group_6__1__Impl ;
    public final void rule__Servidor_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4745:1: ( rule__Servidor_Impl__Group_6__1__Impl )
            // InternalCeffective.g:4746:2: rule__Servidor_Impl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_6__1"


    // $ANTLR start "rule__Servidor_Impl__Group_6__1__Impl"
    // InternalCeffective.g:4752:1: rule__Servidor_Impl__Group_6__1__Impl : ( ( rule__Servidor_Impl__TamanoAssignment_6_1 ) ) ;
    public final void rule__Servidor_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4756:1: ( ( ( rule__Servidor_Impl__TamanoAssignment_6_1 ) ) )
            // InternalCeffective.g:4757:1: ( ( rule__Servidor_Impl__TamanoAssignment_6_1 ) )
            {
            // InternalCeffective.g:4757:1: ( ( rule__Servidor_Impl__TamanoAssignment_6_1 ) )
            // InternalCeffective.g:4758:2: ( rule__Servidor_Impl__TamanoAssignment_6_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getTamanoAssignment_6_1()); 
            // InternalCeffective.g:4759:2: ( rule__Servidor_Impl__TamanoAssignment_6_1 )
            // InternalCeffective.g:4759:3: rule__Servidor_Impl__TamanoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__TamanoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getTamanoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__0"
    // InternalCeffective.g:4768:1: rule__Servidor_Impl__Group_7__0 : rule__Servidor_Impl__Group_7__0__Impl rule__Servidor_Impl__Group_7__1 ;
    public final void rule__Servidor_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4772:1: ( rule__Servidor_Impl__Group_7__0__Impl rule__Servidor_Impl__Group_7__1 )
            // InternalCeffective.g:4773:2: rule__Servidor_Impl__Group_7__0__Impl rule__Servidor_Impl__Group_7__1
            {
            pushFollow(FOLLOW_13);
            rule__Servidor_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__0"


    // $ANTLR start "rule__Servidor_Impl__Group_7__0__Impl"
    // InternalCeffective.g:4780:1: rule__Servidor_Impl__Group_7__0__Impl : ( 'recursos' ) ;
    public final void rule__Servidor_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4784:1: ( ( 'recursos' ) )
            // InternalCeffective.g:4785:1: ( 'recursos' )
            {
            // InternalCeffective.g:4785:1: ( 'recursos' )
            // InternalCeffective.g:4786:2: 'recursos'
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getRecursosKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__1"
    // InternalCeffective.g:4795:1: rule__Servidor_Impl__Group_7__1 : rule__Servidor_Impl__Group_7__1__Impl rule__Servidor_Impl__Group_7__2 ;
    public final void rule__Servidor_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4799:1: ( rule__Servidor_Impl__Group_7__1__Impl rule__Servidor_Impl__Group_7__2 )
            // InternalCeffective.g:4800:2: rule__Servidor_Impl__Group_7__1__Impl rule__Servidor_Impl__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__1"


    // $ANTLR start "rule__Servidor_Impl__Group_7__1__Impl"
    // InternalCeffective.g:4807:1: rule__Servidor_Impl__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Servidor_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4811:1: ( ( '(' ) )
            // InternalCeffective.g:4812:1: ( '(' )
            {
            // InternalCeffective.g:4812:1: ( '(' )
            // InternalCeffective.g:4813:2: '('
            {
             before(grammarAccess.getServidor_ImplAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getLeftParenthesisKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__2"
    // InternalCeffective.g:4822:1: rule__Servidor_Impl__Group_7__2 : rule__Servidor_Impl__Group_7__2__Impl rule__Servidor_Impl__Group_7__3 ;
    public final void rule__Servidor_Impl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4826:1: ( rule__Servidor_Impl__Group_7__2__Impl rule__Servidor_Impl__Group_7__3 )
            // InternalCeffective.g:4827:2: rule__Servidor_Impl__Group_7__2__Impl rule__Servidor_Impl__Group_7__3
            {
            pushFollow(FOLLOW_14);
            rule__Servidor_Impl__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__2"


    // $ANTLR start "rule__Servidor_Impl__Group_7__2__Impl"
    // InternalCeffective.g:4834:1: rule__Servidor_Impl__Group_7__2__Impl : ( ( rule__Servidor_Impl__RecursosAssignment_7_2 ) ) ;
    public final void rule__Servidor_Impl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4838:1: ( ( ( rule__Servidor_Impl__RecursosAssignment_7_2 ) ) )
            // InternalCeffective.g:4839:1: ( ( rule__Servidor_Impl__RecursosAssignment_7_2 ) )
            {
            // InternalCeffective.g:4839:1: ( ( rule__Servidor_Impl__RecursosAssignment_7_2 ) )
            // InternalCeffective.g:4840:2: ( rule__Servidor_Impl__RecursosAssignment_7_2 )
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosAssignment_7_2()); 
            // InternalCeffective.g:4841:2: ( rule__Servidor_Impl__RecursosAssignment_7_2 )
            // InternalCeffective.g:4841:3: rule__Servidor_Impl__RecursosAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__RecursosAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getRecursosAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__2__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__3"
    // InternalCeffective.g:4849:1: rule__Servidor_Impl__Group_7__3 : rule__Servidor_Impl__Group_7__3__Impl rule__Servidor_Impl__Group_7__4 ;
    public final void rule__Servidor_Impl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4853:1: ( rule__Servidor_Impl__Group_7__3__Impl rule__Servidor_Impl__Group_7__4 )
            // InternalCeffective.g:4854:2: rule__Servidor_Impl__Group_7__3__Impl rule__Servidor_Impl__Group_7__4
            {
            pushFollow(FOLLOW_14);
            rule__Servidor_Impl__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__3"


    // $ANTLR start "rule__Servidor_Impl__Group_7__3__Impl"
    // InternalCeffective.g:4861:1: rule__Servidor_Impl__Group_7__3__Impl : ( ( rule__Servidor_Impl__Group_7_3__0 )* ) ;
    public final void rule__Servidor_Impl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4865:1: ( ( ( rule__Servidor_Impl__Group_7_3__0 )* ) )
            // InternalCeffective.g:4866:1: ( ( rule__Servidor_Impl__Group_7_3__0 )* )
            {
            // InternalCeffective.g:4866:1: ( ( rule__Servidor_Impl__Group_7_3__0 )* )
            // InternalCeffective.g:4867:2: ( rule__Servidor_Impl__Group_7_3__0 )*
            {
             before(grammarAccess.getServidor_ImplAccess().getGroup_7_3()); 
            // InternalCeffective.g:4868:2: ( rule__Servidor_Impl__Group_7_3__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==31) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalCeffective.g:4868:3: rule__Servidor_Impl__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Servidor_Impl__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getServidor_ImplAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__3__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7__4"
    // InternalCeffective.g:4876:1: rule__Servidor_Impl__Group_7__4 : rule__Servidor_Impl__Group_7__4__Impl ;
    public final void rule__Servidor_Impl__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4880:1: ( rule__Servidor_Impl__Group_7__4__Impl )
            // InternalCeffective.g:4881:2: rule__Servidor_Impl__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__4"


    // $ANTLR start "rule__Servidor_Impl__Group_7__4__Impl"
    // InternalCeffective.g:4887:1: rule__Servidor_Impl__Group_7__4__Impl : ( ')' ) ;
    public final void rule__Servidor_Impl__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4891:1: ( ( ')' ) )
            // InternalCeffective.g:4892:1: ( ')' )
            {
            // InternalCeffective.g:4892:1: ( ')' )
            // InternalCeffective.g:4893:2: ')'
            {
             before(grammarAccess.getServidor_ImplAccess().getRightParenthesisKeyword_7_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getRightParenthesisKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7__4__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7_3__0"
    // InternalCeffective.g:4903:1: rule__Servidor_Impl__Group_7_3__0 : rule__Servidor_Impl__Group_7_3__0__Impl rule__Servidor_Impl__Group_7_3__1 ;
    public final void rule__Servidor_Impl__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4907:1: ( rule__Servidor_Impl__Group_7_3__0__Impl rule__Servidor_Impl__Group_7_3__1 )
            // InternalCeffective.g:4908:2: rule__Servidor_Impl__Group_7_3__0__Impl rule__Servidor_Impl__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7_3__0"


    // $ANTLR start "rule__Servidor_Impl__Group_7_3__0__Impl"
    // InternalCeffective.g:4915:1: rule__Servidor_Impl__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Servidor_Impl__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4919:1: ( ( ',' ) )
            // InternalCeffective.g:4920:1: ( ',' )
            {
            // InternalCeffective.g:4920:1: ( ',' )
            // InternalCeffective.g:4921:2: ','
            {
             before(grammarAccess.getServidor_ImplAccess().getCommaKeyword_7_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7_3__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_7_3__1"
    // InternalCeffective.g:4930:1: rule__Servidor_Impl__Group_7_3__1 : rule__Servidor_Impl__Group_7_3__1__Impl ;
    public final void rule__Servidor_Impl__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4934:1: ( rule__Servidor_Impl__Group_7_3__1__Impl )
            // InternalCeffective.g:4935:2: rule__Servidor_Impl__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7_3__1"


    // $ANTLR start "rule__Servidor_Impl__Group_7_3__1__Impl"
    // InternalCeffective.g:4941:1: rule__Servidor_Impl__Group_7_3__1__Impl : ( ( rule__Servidor_Impl__RecursosAssignment_7_3_1 ) ) ;
    public final void rule__Servidor_Impl__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4945:1: ( ( ( rule__Servidor_Impl__RecursosAssignment_7_3_1 ) ) )
            // InternalCeffective.g:4946:1: ( ( rule__Servidor_Impl__RecursosAssignment_7_3_1 ) )
            {
            // InternalCeffective.g:4946:1: ( ( rule__Servidor_Impl__RecursosAssignment_7_3_1 ) )
            // InternalCeffective.g:4947:2: ( rule__Servidor_Impl__RecursosAssignment_7_3_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosAssignment_7_3_1()); 
            // InternalCeffective.g:4948:2: ( rule__Servidor_Impl__RecursosAssignment_7_3_1 )
            // InternalCeffective.g:4948:3: rule__Servidor_Impl__RecursosAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__RecursosAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getRecursosAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_7_3__1__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_8__0"
    // InternalCeffective.g:4957:1: rule__Servidor_Impl__Group_8__0 : rule__Servidor_Impl__Group_8__0__Impl rule__Servidor_Impl__Group_8__1 ;
    public final void rule__Servidor_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4961:1: ( rule__Servidor_Impl__Group_8__0__Impl rule__Servidor_Impl__Group_8__1 )
            // InternalCeffective.g:4962:2: rule__Servidor_Impl__Group_8__0__Impl rule__Servidor_Impl__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__Servidor_Impl__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_8__0"


    // $ANTLR start "rule__Servidor_Impl__Group_8__0__Impl"
    // InternalCeffective.g:4969:1: rule__Servidor_Impl__Group_8__0__Impl : ( 'vpc' ) ;
    public final void rule__Servidor_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4973:1: ( ( 'vpc' ) )
            // InternalCeffective.g:4974:1: ( 'vpc' )
            {
            // InternalCeffective.g:4974:1: ( 'vpc' )
            // InternalCeffective.g:4975:2: 'vpc'
            {
             before(grammarAccess.getServidor_ImplAccess().getVpcKeyword_8_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getServidor_ImplAccess().getVpcKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_8__0__Impl"


    // $ANTLR start "rule__Servidor_Impl__Group_8__1"
    // InternalCeffective.g:4984:1: rule__Servidor_Impl__Group_8__1 : rule__Servidor_Impl__Group_8__1__Impl ;
    public final void rule__Servidor_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4988:1: ( rule__Servidor_Impl__Group_8__1__Impl )
            // InternalCeffective.g:4989:2: rule__Servidor_Impl__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_8__1"


    // $ANTLR start "rule__Servidor_Impl__Group_8__1__Impl"
    // InternalCeffective.g:4995:1: rule__Servidor_Impl__Group_8__1__Impl : ( ( rule__Servidor_Impl__VpcAssignment_8_1 ) ) ;
    public final void rule__Servidor_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:4999:1: ( ( ( rule__Servidor_Impl__VpcAssignment_8_1 ) ) )
            // InternalCeffective.g:5000:1: ( ( rule__Servidor_Impl__VpcAssignment_8_1 ) )
            {
            // InternalCeffective.g:5000:1: ( ( rule__Servidor_Impl__VpcAssignment_8_1 ) )
            // InternalCeffective.g:5001:2: ( rule__Servidor_Impl__VpcAssignment_8_1 )
            {
             before(grammarAccess.getServidor_ImplAccess().getVpcAssignment_8_1()); 
            // InternalCeffective.g:5002:2: ( rule__Servidor_Impl__VpcAssignment_8_1 )
            // InternalCeffective.g:5002:3: rule__Servidor_Impl__VpcAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Servidor_Impl__VpcAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getServidor_ImplAccess().getVpcAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__Group_8__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalCeffective.g:5011:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5015:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalCeffective.g:5016:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalCeffective.g:5023:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5027:1: ( ( ( '-' )? ) )
            // InternalCeffective.g:5028:1: ( ( '-' )? )
            {
            // InternalCeffective.g:5028:1: ( ( '-' )? )
            // InternalCeffective.g:5029:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalCeffective.g:5030:2: ( '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==48) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCeffective.g:5030:3: '-'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalCeffective.g:5038:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5042:1: ( rule__EInt__Group__1__Impl )
            // InternalCeffective.g:5043:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalCeffective.g:5049:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5053:1: ( ( RULE_INT ) )
            // InternalCeffective.g:5054:1: ( RULE_INT )
            {
            // InternalCeffective.g:5054:1: ( RULE_INT )
            // InternalCeffective.g:5055:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__0"
    // InternalCeffective.g:5065:1: rule__AutenticacionBasica__Group__0 : rule__AutenticacionBasica__Group__0__Impl rule__AutenticacionBasica__Group__1 ;
    public final void rule__AutenticacionBasica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5069:1: ( rule__AutenticacionBasica__Group__0__Impl rule__AutenticacionBasica__Group__1 )
            // InternalCeffective.g:5070:2: rule__AutenticacionBasica__Group__0__Impl rule__AutenticacionBasica__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AutenticacionBasica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__0"


    // $ANTLR start "rule__AutenticacionBasica__Group__0__Impl"
    // InternalCeffective.g:5077:1: rule__AutenticacionBasica__Group__0__Impl : ( () ) ;
    public final void rule__AutenticacionBasica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5081:1: ( ( () ) )
            // InternalCeffective.g:5082:1: ( () )
            {
            // InternalCeffective.g:5082:1: ( () )
            // InternalCeffective.g:5083:2: ()
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaAction_0()); 
            // InternalCeffective.g:5084:2: ()
            // InternalCeffective.g:5084:3: 
            {
            }

             after(grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__0__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__1"
    // InternalCeffective.g:5092:1: rule__AutenticacionBasica__Group__1 : rule__AutenticacionBasica__Group__1__Impl rule__AutenticacionBasica__Group__2 ;
    public final void rule__AutenticacionBasica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5096:1: ( rule__AutenticacionBasica__Group__1__Impl rule__AutenticacionBasica__Group__2 )
            // InternalCeffective.g:5097:2: rule__AutenticacionBasica__Group__1__Impl rule__AutenticacionBasica__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AutenticacionBasica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__1"


    // $ANTLR start "rule__AutenticacionBasica__Group__1__Impl"
    // InternalCeffective.g:5104:1: rule__AutenticacionBasica__Group__1__Impl : ( 'AutenticacionBasica' ) ;
    public final void rule__AutenticacionBasica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5108:1: ( ( 'AutenticacionBasica' ) )
            // InternalCeffective.g:5109:1: ( 'AutenticacionBasica' )
            {
            // InternalCeffective.g:5109:1: ( 'AutenticacionBasica' )
            // InternalCeffective.g:5110:2: 'AutenticacionBasica'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getAutenticacionBasicaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__1__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__2"
    // InternalCeffective.g:5119:1: rule__AutenticacionBasica__Group__2 : rule__AutenticacionBasica__Group__2__Impl rule__AutenticacionBasica__Group__3 ;
    public final void rule__AutenticacionBasica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5123:1: ( rule__AutenticacionBasica__Group__2__Impl rule__AutenticacionBasica__Group__3 )
            // InternalCeffective.g:5124:2: rule__AutenticacionBasica__Group__2__Impl rule__AutenticacionBasica__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__AutenticacionBasica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__2"


    // $ANTLR start "rule__AutenticacionBasica__Group__2__Impl"
    // InternalCeffective.g:5131:1: rule__AutenticacionBasica__Group__2__Impl : ( '{' ) ;
    public final void rule__AutenticacionBasica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5135:1: ( ( '{' ) )
            // InternalCeffective.g:5136:1: ( '{' )
            {
            // InternalCeffective.g:5136:1: ( '{' )
            // InternalCeffective.g:5137:2: '{'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__2__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__3"
    // InternalCeffective.g:5146:1: rule__AutenticacionBasica__Group__3 : rule__AutenticacionBasica__Group__3__Impl rule__AutenticacionBasica__Group__4 ;
    public final void rule__AutenticacionBasica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5150:1: ( rule__AutenticacionBasica__Group__3__Impl rule__AutenticacionBasica__Group__4 )
            // InternalCeffective.g:5151:2: rule__AutenticacionBasica__Group__3__Impl rule__AutenticacionBasica__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__AutenticacionBasica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__3"


    // $ANTLR start "rule__AutenticacionBasica__Group__3__Impl"
    // InternalCeffective.g:5158:1: rule__AutenticacionBasica__Group__3__Impl : ( ( rule__AutenticacionBasica__Group_3__0 )? ) ;
    public final void rule__AutenticacionBasica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5162:1: ( ( ( rule__AutenticacionBasica__Group_3__0 )? ) )
            // InternalCeffective.g:5163:1: ( ( rule__AutenticacionBasica__Group_3__0 )? )
            {
            // InternalCeffective.g:5163:1: ( ( rule__AutenticacionBasica__Group_3__0 )? )
            // InternalCeffective.g:5164:2: ( rule__AutenticacionBasica__Group_3__0 )?
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getGroup_3()); 
            // InternalCeffective.g:5165:2: ( rule__AutenticacionBasica__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalCeffective.g:5165:3: rule__AutenticacionBasica__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionBasica__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionBasicaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__3__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__4"
    // InternalCeffective.g:5173:1: rule__AutenticacionBasica__Group__4 : rule__AutenticacionBasica__Group__4__Impl rule__AutenticacionBasica__Group__5 ;
    public final void rule__AutenticacionBasica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5177:1: ( rule__AutenticacionBasica__Group__4__Impl rule__AutenticacionBasica__Group__5 )
            // InternalCeffective.g:5178:2: rule__AutenticacionBasica__Group__4__Impl rule__AutenticacionBasica__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__AutenticacionBasica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__4"


    // $ANTLR start "rule__AutenticacionBasica__Group__4__Impl"
    // InternalCeffective.g:5185:1: rule__AutenticacionBasica__Group__4__Impl : ( ( rule__AutenticacionBasica__Group_4__0 )? ) ;
    public final void rule__AutenticacionBasica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5189:1: ( ( ( rule__AutenticacionBasica__Group_4__0 )? ) )
            // InternalCeffective.g:5190:1: ( ( rule__AutenticacionBasica__Group_4__0 )? )
            {
            // InternalCeffective.g:5190:1: ( ( rule__AutenticacionBasica__Group_4__0 )? )
            // InternalCeffective.g:5191:2: ( rule__AutenticacionBasica__Group_4__0 )?
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getGroup_4()); 
            // InternalCeffective.g:5192:2: ( rule__AutenticacionBasica__Group_4__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalCeffective.g:5192:3: rule__AutenticacionBasica__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionBasica__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionBasicaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__4__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__5"
    // InternalCeffective.g:5200:1: rule__AutenticacionBasica__Group__5 : rule__AutenticacionBasica__Group__5__Impl rule__AutenticacionBasica__Group__6 ;
    public final void rule__AutenticacionBasica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5204:1: ( rule__AutenticacionBasica__Group__5__Impl rule__AutenticacionBasica__Group__6 )
            // InternalCeffective.g:5205:2: rule__AutenticacionBasica__Group__5__Impl rule__AutenticacionBasica__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__AutenticacionBasica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__5"


    // $ANTLR start "rule__AutenticacionBasica__Group__5__Impl"
    // InternalCeffective.g:5212:1: rule__AutenticacionBasica__Group__5__Impl : ( ( rule__AutenticacionBasica__Group_5__0 )? ) ;
    public final void rule__AutenticacionBasica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5216:1: ( ( ( rule__AutenticacionBasica__Group_5__0 )? ) )
            // InternalCeffective.g:5217:1: ( ( rule__AutenticacionBasica__Group_5__0 )? )
            {
            // InternalCeffective.g:5217:1: ( ( rule__AutenticacionBasica__Group_5__0 )? )
            // InternalCeffective.g:5218:2: ( rule__AutenticacionBasica__Group_5__0 )?
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getGroup_5()); 
            // InternalCeffective.g:5219:2: ( rule__AutenticacionBasica__Group_5__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==50) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalCeffective.g:5219:3: rule__AutenticacionBasica__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionBasica__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionBasicaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__5__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group__6"
    // InternalCeffective.g:5227:1: rule__AutenticacionBasica__Group__6 : rule__AutenticacionBasica__Group__6__Impl ;
    public final void rule__AutenticacionBasica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5231:1: ( rule__AutenticacionBasica__Group__6__Impl )
            // InternalCeffective.g:5232:2: rule__AutenticacionBasica__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__6"


    // $ANTLR start "rule__AutenticacionBasica__Group__6__Impl"
    // InternalCeffective.g:5238:1: rule__AutenticacionBasica__Group__6__Impl : ( '}' ) ;
    public final void rule__AutenticacionBasica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5242:1: ( ( '}' ) )
            // InternalCeffective.g:5243:1: ( '}' )
            {
            // InternalCeffective.g:5243:1: ( '}' )
            // InternalCeffective.g:5244:2: '}'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group__6__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_3__0"
    // InternalCeffective.g:5254:1: rule__AutenticacionBasica__Group_3__0 : rule__AutenticacionBasica__Group_3__0__Impl rule__AutenticacionBasica__Group_3__1 ;
    public final void rule__AutenticacionBasica__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5258:1: ( rule__AutenticacionBasica__Group_3__0__Impl rule__AutenticacionBasica__Group_3__1 )
            // InternalCeffective.g:5259:2: rule__AutenticacionBasica__Group_3__0__Impl rule__AutenticacionBasica__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionBasica__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_3__0"


    // $ANTLR start "rule__AutenticacionBasica__Group_3__0__Impl"
    // InternalCeffective.g:5266:1: rule__AutenticacionBasica__Group_3__0__Impl : ( 'usuario' ) ;
    public final void rule__AutenticacionBasica__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5270:1: ( ( 'usuario' ) )
            // InternalCeffective.g:5271:1: ( 'usuario' )
            {
            // InternalCeffective.g:5271:1: ( 'usuario' )
            // InternalCeffective.g:5272:2: 'usuario'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getUsuarioKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getUsuarioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_3__0__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_3__1"
    // InternalCeffective.g:5281:1: rule__AutenticacionBasica__Group_3__1 : rule__AutenticacionBasica__Group_3__1__Impl ;
    public final void rule__AutenticacionBasica__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5285:1: ( rule__AutenticacionBasica__Group_3__1__Impl )
            // InternalCeffective.g:5286:2: rule__AutenticacionBasica__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_3__1"


    // $ANTLR start "rule__AutenticacionBasica__Group_3__1__Impl"
    // InternalCeffective.g:5292:1: rule__AutenticacionBasica__Group_3__1__Impl : ( ( rule__AutenticacionBasica__UsuarioAssignment_3_1 ) ) ;
    public final void rule__AutenticacionBasica__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5296:1: ( ( ( rule__AutenticacionBasica__UsuarioAssignment_3_1 ) ) )
            // InternalCeffective.g:5297:1: ( ( rule__AutenticacionBasica__UsuarioAssignment_3_1 ) )
            {
            // InternalCeffective.g:5297:1: ( ( rule__AutenticacionBasica__UsuarioAssignment_3_1 ) )
            // InternalCeffective.g:5298:2: ( rule__AutenticacionBasica__UsuarioAssignment_3_1 )
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getUsuarioAssignment_3_1()); 
            // InternalCeffective.g:5299:2: ( rule__AutenticacionBasica__UsuarioAssignment_3_1 )
            // InternalCeffective.g:5299:3: rule__AutenticacionBasica__UsuarioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__UsuarioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionBasicaAccess().getUsuarioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_3__1__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_4__0"
    // InternalCeffective.g:5308:1: rule__AutenticacionBasica__Group_4__0 : rule__AutenticacionBasica__Group_4__0__Impl rule__AutenticacionBasica__Group_4__1 ;
    public final void rule__AutenticacionBasica__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5312:1: ( rule__AutenticacionBasica__Group_4__0__Impl rule__AutenticacionBasica__Group_4__1 )
            // InternalCeffective.g:5313:2: rule__AutenticacionBasica__Group_4__0__Impl rule__AutenticacionBasica__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionBasica__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_4__0"


    // $ANTLR start "rule__AutenticacionBasica__Group_4__0__Impl"
    // InternalCeffective.g:5320:1: rule__AutenticacionBasica__Group_4__0__Impl : ( 'correo' ) ;
    public final void rule__AutenticacionBasica__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5324:1: ( ( 'correo' ) )
            // InternalCeffective.g:5325:1: ( 'correo' )
            {
            // InternalCeffective.g:5325:1: ( 'correo' )
            // InternalCeffective.g:5326:2: 'correo'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getCorreoKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getCorreoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_4__0__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_4__1"
    // InternalCeffective.g:5335:1: rule__AutenticacionBasica__Group_4__1 : rule__AutenticacionBasica__Group_4__1__Impl ;
    public final void rule__AutenticacionBasica__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5339:1: ( rule__AutenticacionBasica__Group_4__1__Impl )
            // InternalCeffective.g:5340:2: rule__AutenticacionBasica__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_4__1"


    // $ANTLR start "rule__AutenticacionBasica__Group_4__1__Impl"
    // InternalCeffective.g:5346:1: rule__AutenticacionBasica__Group_4__1__Impl : ( ( rule__AutenticacionBasica__CorreoAssignment_4_1 ) ) ;
    public final void rule__AutenticacionBasica__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5350:1: ( ( ( rule__AutenticacionBasica__CorreoAssignment_4_1 ) ) )
            // InternalCeffective.g:5351:1: ( ( rule__AutenticacionBasica__CorreoAssignment_4_1 ) )
            {
            // InternalCeffective.g:5351:1: ( ( rule__AutenticacionBasica__CorreoAssignment_4_1 ) )
            // InternalCeffective.g:5352:2: ( rule__AutenticacionBasica__CorreoAssignment_4_1 )
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getCorreoAssignment_4_1()); 
            // InternalCeffective.g:5353:2: ( rule__AutenticacionBasica__CorreoAssignment_4_1 )
            // InternalCeffective.g:5353:3: rule__AutenticacionBasica__CorreoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__CorreoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionBasicaAccess().getCorreoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_4__1__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_5__0"
    // InternalCeffective.g:5362:1: rule__AutenticacionBasica__Group_5__0 : rule__AutenticacionBasica__Group_5__0__Impl rule__AutenticacionBasica__Group_5__1 ;
    public final void rule__AutenticacionBasica__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5366:1: ( rule__AutenticacionBasica__Group_5__0__Impl rule__AutenticacionBasica__Group_5__1 )
            // InternalCeffective.g:5367:2: rule__AutenticacionBasica__Group_5__0__Impl rule__AutenticacionBasica__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionBasica__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_5__0"


    // $ANTLR start "rule__AutenticacionBasica__Group_5__0__Impl"
    // InternalCeffective.g:5374:1: rule__AutenticacionBasica__Group_5__0__Impl : ( 'password' ) ;
    public final void rule__AutenticacionBasica__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5378:1: ( ( 'password' ) )
            // InternalCeffective.g:5379:1: ( 'password' )
            {
            // InternalCeffective.g:5379:1: ( 'password' )
            // InternalCeffective.g:5380:2: 'password'
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getPasswordKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAutenticacionBasicaAccess().getPasswordKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_5__0__Impl"


    // $ANTLR start "rule__AutenticacionBasica__Group_5__1"
    // InternalCeffective.g:5389:1: rule__AutenticacionBasica__Group_5__1 : rule__AutenticacionBasica__Group_5__1__Impl ;
    public final void rule__AutenticacionBasica__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5393:1: ( rule__AutenticacionBasica__Group_5__1__Impl )
            // InternalCeffective.g:5394:2: rule__AutenticacionBasica__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_5__1"


    // $ANTLR start "rule__AutenticacionBasica__Group_5__1__Impl"
    // InternalCeffective.g:5400:1: rule__AutenticacionBasica__Group_5__1__Impl : ( ( rule__AutenticacionBasica__PasswordAssignment_5_1 ) ) ;
    public final void rule__AutenticacionBasica__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5404:1: ( ( ( rule__AutenticacionBasica__PasswordAssignment_5_1 ) ) )
            // InternalCeffective.g:5405:1: ( ( rule__AutenticacionBasica__PasswordAssignment_5_1 ) )
            {
            // InternalCeffective.g:5405:1: ( ( rule__AutenticacionBasica__PasswordAssignment_5_1 ) )
            // InternalCeffective.g:5406:2: ( rule__AutenticacionBasica__PasswordAssignment_5_1 )
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getPasswordAssignment_5_1()); 
            // InternalCeffective.g:5407:2: ( rule__AutenticacionBasica__PasswordAssignment_5_1 )
            // InternalCeffective.g:5407:3: rule__AutenticacionBasica__PasswordAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionBasica__PasswordAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionBasicaAccess().getPasswordAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__Group_5__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__0"
    // InternalCeffective.g:5416:1: rule__AutenticacionFirma__Group__0 : rule__AutenticacionFirma__Group__0__Impl rule__AutenticacionFirma__Group__1 ;
    public final void rule__AutenticacionFirma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5420:1: ( rule__AutenticacionFirma__Group__0__Impl rule__AutenticacionFirma__Group__1 )
            // InternalCeffective.g:5421:2: rule__AutenticacionFirma__Group__0__Impl rule__AutenticacionFirma__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AutenticacionFirma__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__0"


    // $ANTLR start "rule__AutenticacionFirma__Group__0__Impl"
    // InternalCeffective.g:5428:1: rule__AutenticacionFirma__Group__0__Impl : ( () ) ;
    public final void rule__AutenticacionFirma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5432:1: ( ( () ) )
            // InternalCeffective.g:5433:1: ( () )
            {
            // InternalCeffective.g:5433:1: ( () )
            // InternalCeffective.g:5434:2: ()
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaAction_0()); 
            // InternalCeffective.g:5435:2: ()
            // InternalCeffective.g:5435:3: 
            {
            }

             after(grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__1"
    // InternalCeffective.g:5443:1: rule__AutenticacionFirma__Group__1 : rule__AutenticacionFirma__Group__1__Impl rule__AutenticacionFirma__Group__2 ;
    public final void rule__AutenticacionFirma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5447:1: ( rule__AutenticacionFirma__Group__1__Impl rule__AutenticacionFirma__Group__2 )
            // InternalCeffective.g:5448:2: rule__AutenticacionFirma__Group__1__Impl rule__AutenticacionFirma__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AutenticacionFirma__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__1"


    // $ANTLR start "rule__AutenticacionFirma__Group__1__Impl"
    // InternalCeffective.g:5455:1: rule__AutenticacionFirma__Group__1__Impl : ( 'AutenticacionFirma' ) ;
    public final void rule__AutenticacionFirma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5459:1: ( ( 'AutenticacionFirma' ) )
            // InternalCeffective.g:5460:1: ( 'AutenticacionFirma' )
            {
            // InternalCeffective.g:5460:1: ( 'AutenticacionFirma' )
            // InternalCeffective.g:5461:2: 'AutenticacionFirma'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getAutenticacionFirmaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__2"
    // InternalCeffective.g:5470:1: rule__AutenticacionFirma__Group__2 : rule__AutenticacionFirma__Group__2__Impl rule__AutenticacionFirma__Group__3 ;
    public final void rule__AutenticacionFirma__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5474:1: ( rule__AutenticacionFirma__Group__2__Impl rule__AutenticacionFirma__Group__3 )
            // InternalCeffective.g:5475:2: rule__AutenticacionFirma__Group__2__Impl rule__AutenticacionFirma__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__AutenticacionFirma__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__2"


    // $ANTLR start "rule__AutenticacionFirma__Group__2__Impl"
    // InternalCeffective.g:5482:1: rule__AutenticacionFirma__Group__2__Impl : ( '{' ) ;
    public final void rule__AutenticacionFirma__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5486:1: ( ( '{' ) )
            // InternalCeffective.g:5487:1: ( '{' )
            {
            // InternalCeffective.g:5487:1: ( '{' )
            // InternalCeffective.g:5488:2: '{'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__2__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__3"
    // InternalCeffective.g:5497:1: rule__AutenticacionFirma__Group__3 : rule__AutenticacionFirma__Group__3__Impl rule__AutenticacionFirma__Group__4 ;
    public final void rule__AutenticacionFirma__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5501:1: ( rule__AutenticacionFirma__Group__3__Impl rule__AutenticacionFirma__Group__4 )
            // InternalCeffective.g:5502:2: rule__AutenticacionFirma__Group__3__Impl rule__AutenticacionFirma__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__AutenticacionFirma__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__3"


    // $ANTLR start "rule__AutenticacionFirma__Group__3__Impl"
    // InternalCeffective.g:5509:1: rule__AutenticacionFirma__Group__3__Impl : ( ( rule__AutenticacionFirma__Group_3__0 )? ) ;
    public final void rule__AutenticacionFirma__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5513:1: ( ( ( rule__AutenticacionFirma__Group_3__0 )? ) )
            // InternalCeffective.g:5514:1: ( ( rule__AutenticacionFirma__Group_3__0 )? )
            {
            // InternalCeffective.g:5514:1: ( ( rule__AutenticacionFirma__Group_3__0 )? )
            // InternalCeffective.g:5515:2: ( rule__AutenticacionFirma__Group_3__0 )?
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup_3()); 
            // InternalCeffective.g:5516:2: ( rule__AutenticacionFirma__Group_3__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==34) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalCeffective.g:5516:3: rule__AutenticacionFirma__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionFirma__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__3__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__4"
    // InternalCeffective.g:5524:1: rule__AutenticacionFirma__Group__4 : rule__AutenticacionFirma__Group__4__Impl rule__AutenticacionFirma__Group__5 ;
    public final void rule__AutenticacionFirma__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5528:1: ( rule__AutenticacionFirma__Group__4__Impl rule__AutenticacionFirma__Group__5 )
            // InternalCeffective.g:5529:2: rule__AutenticacionFirma__Group__4__Impl rule__AutenticacionFirma__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__AutenticacionFirma__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__4"


    // $ANTLR start "rule__AutenticacionFirma__Group__4__Impl"
    // InternalCeffective.g:5536:1: rule__AutenticacionFirma__Group__4__Impl : ( ( rule__AutenticacionFirma__Group_4__0 )? ) ;
    public final void rule__AutenticacionFirma__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5540:1: ( ( ( rule__AutenticacionFirma__Group_4__0 )? ) )
            // InternalCeffective.g:5541:1: ( ( rule__AutenticacionFirma__Group_4__0 )? )
            {
            // InternalCeffective.g:5541:1: ( ( rule__AutenticacionFirma__Group_4__0 )? )
            // InternalCeffective.g:5542:2: ( rule__AutenticacionFirma__Group_4__0 )?
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup_4()); 
            // InternalCeffective.g:5543:2: ( rule__AutenticacionFirma__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalCeffective.g:5543:3: rule__AutenticacionFirma__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionFirma__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__4__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__5"
    // InternalCeffective.g:5551:1: rule__AutenticacionFirma__Group__5 : rule__AutenticacionFirma__Group__5__Impl rule__AutenticacionFirma__Group__6 ;
    public final void rule__AutenticacionFirma__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5555:1: ( rule__AutenticacionFirma__Group__5__Impl rule__AutenticacionFirma__Group__6 )
            // InternalCeffective.g:5556:2: rule__AutenticacionFirma__Group__5__Impl rule__AutenticacionFirma__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__AutenticacionFirma__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__5"


    // $ANTLR start "rule__AutenticacionFirma__Group__5__Impl"
    // InternalCeffective.g:5563:1: rule__AutenticacionFirma__Group__5__Impl : ( ( rule__AutenticacionFirma__Group_5__0 )? ) ;
    public final void rule__AutenticacionFirma__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5567:1: ( ( ( rule__AutenticacionFirma__Group_5__0 )? ) )
            // InternalCeffective.g:5568:1: ( ( rule__AutenticacionFirma__Group_5__0 )? )
            {
            // InternalCeffective.g:5568:1: ( ( rule__AutenticacionFirma__Group_5__0 )? )
            // InternalCeffective.g:5569:2: ( rule__AutenticacionFirma__Group_5__0 )?
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup_5()); 
            // InternalCeffective.g:5570:2: ( rule__AutenticacionFirma__Group_5__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==27) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalCeffective.g:5570:3: rule__AutenticacionFirma__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionFirma__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__5__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__6"
    // InternalCeffective.g:5578:1: rule__AutenticacionFirma__Group__6 : rule__AutenticacionFirma__Group__6__Impl rule__AutenticacionFirma__Group__7 ;
    public final void rule__AutenticacionFirma__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5582:1: ( rule__AutenticacionFirma__Group__6__Impl rule__AutenticacionFirma__Group__7 )
            // InternalCeffective.g:5583:2: rule__AutenticacionFirma__Group__6__Impl rule__AutenticacionFirma__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__AutenticacionFirma__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__6"


    // $ANTLR start "rule__AutenticacionFirma__Group__6__Impl"
    // InternalCeffective.g:5590:1: rule__AutenticacionFirma__Group__6__Impl : ( ( rule__AutenticacionFirma__Group_6__0 )? ) ;
    public final void rule__AutenticacionFirma__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5594:1: ( ( ( rule__AutenticacionFirma__Group_6__0 )? ) )
            // InternalCeffective.g:5595:1: ( ( rule__AutenticacionFirma__Group_6__0 )? )
            {
            // InternalCeffective.g:5595:1: ( ( rule__AutenticacionFirma__Group_6__0 )? )
            // InternalCeffective.g:5596:2: ( rule__AutenticacionFirma__Group_6__0 )?
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getGroup_6()); 
            // InternalCeffective.g:5597:2: ( rule__AutenticacionFirma__Group_6__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalCeffective.g:5597:3: rule__AutenticacionFirma__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AutenticacionFirma__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAutenticacionFirmaAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__6__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group__7"
    // InternalCeffective.g:5605:1: rule__AutenticacionFirma__Group__7 : rule__AutenticacionFirma__Group__7__Impl ;
    public final void rule__AutenticacionFirma__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5609:1: ( rule__AutenticacionFirma__Group__7__Impl )
            // InternalCeffective.g:5610:2: rule__AutenticacionFirma__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__7"


    // $ANTLR start "rule__AutenticacionFirma__Group__7__Impl"
    // InternalCeffective.g:5616:1: rule__AutenticacionFirma__Group__7__Impl : ( '}' ) ;
    public final void rule__AutenticacionFirma__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5620:1: ( ( '}' ) )
            // InternalCeffective.g:5621:1: ( '}' )
            {
            // InternalCeffective.g:5621:1: ( '}' )
            // InternalCeffective.g:5622:2: '}'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group__7__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_3__0"
    // InternalCeffective.g:5632:1: rule__AutenticacionFirma__Group_3__0 : rule__AutenticacionFirma__Group_3__0__Impl rule__AutenticacionFirma__Group_3__1 ;
    public final void rule__AutenticacionFirma__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5636:1: ( rule__AutenticacionFirma__Group_3__0__Impl rule__AutenticacionFirma__Group_3__1 )
            // InternalCeffective.g:5637:2: rule__AutenticacionFirma__Group_3__0__Impl rule__AutenticacionFirma__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionFirma__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_3__0"


    // $ANTLR start "rule__AutenticacionFirma__Group_3__0__Impl"
    // InternalCeffective.g:5644:1: rule__AutenticacionFirma__Group_3__0__Impl : ( 'usuario' ) ;
    public final void rule__AutenticacionFirma__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5648:1: ( ( 'usuario' ) )
            // InternalCeffective.g:5649:1: ( 'usuario' )
            {
            // InternalCeffective.g:5649:1: ( 'usuario' )
            // InternalCeffective.g:5650:2: 'usuario'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getUsuarioKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getUsuarioKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_3__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_3__1"
    // InternalCeffective.g:5659:1: rule__AutenticacionFirma__Group_3__1 : rule__AutenticacionFirma__Group_3__1__Impl ;
    public final void rule__AutenticacionFirma__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5663:1: ( rule__AutenticacionFirma__Group_3__1__Impl )
            // InternalCeffective.g:5664:2: rule__AutenticacionFirma__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_3__1"


    // $ANTLR start "rule__AutenticacionFirma__Group_3__1__Impl"
    // InternalCeffective.g:5670:1: rule__AutenticacionFirma__Group_3__1__Impl : ( ( rule__AutenticacionFirma__UsuarioAssignment_3_1 ) ) ;
    public final void rule__AutenticacionFirma__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5674:1: ( ( ( rule__AutenticacionFirma__UsuarioAssignment_3_1 ) ) )
            // InternalCeffective.g:5675:1: ( ( rule__AutenticacionFirma__UsuarioAssignment_3_1 ) )
            {
            // InternalCeffective.g:5675:1: ( ( rule__AutenticacionFirma__UsuarioAssignment_3_1 ) )
            // InternalCeffective.g:5676:2: ( rule__AutenticacionFirma__UsuarioAssignment_3_1 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getUsuarioAssignment_3_1()); 
            // InternalCeffective.g:5677:2: ( rule__AutenticacionFirma__UsuarioAssignment_3_1 )
            // InternalCeffective.g:5677:3: rule__AutenticacionFirma__UsuarioAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__UsuarioAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getUsuarioAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_3__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_4__0"
    // InternalCeffective.g:5686:1: rule__AutenticacionFirma__Group_4__0 : rule__AutenticacionFirma__Group_4__0__Impl rule__AutenticacionFirma__Group_4__1 ;
    public final void rule__AutenticacionFirma__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5690:1: ( rule__AutenticacionFirma__Group_4__0__Impl rule__AutenticacionFirma__Group_4__1 )
            // InternalCeffective.g:5691:2: rule__AutenticacionFirma__Group_4__0__Impl rule__AutenticacionFirma__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionFirma__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_4__0"


    // $ANTLR start "rule__AutenticacionFirma__Group_4__0__Impl"
    // InternalCeffective.g:5698:1: rule__AutenticacionFirma__Group_4__0__Impl : ( 'correo' ) ;
    public final void rule__AutenticacionFirma__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5702:1: ( ( 'correo' ) )
            // InternalCeffective.g:5703:1: ( 'correo' )
            {
            // InternalCeffective.g:5703:1: ( 'correo' )
            // InternalCeffective.g:5704:2: 'correo'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCorreoKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getCorreoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_4__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_4__1"
    // InternalCeffective.g:5713:1: rule__AutenticacionFirma__Group_4__1 : rule__AutenticacionFirma__Group_4__1__Impl ;
    public final void rule__AutenticacionFirma__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5717:1: ( rule__AutenticacionFirma__Group_4__1__Impl )
            // InternalCeffective.g:5718:2: rule__AutenticacionFirma__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_4__1"


    // $ANTLR start "rule__AutenticacionFirma__Group_4__1__Impl"
    // InternalCeffective.g:5724:1: rule__AutenticacionFirma__Group_4__1__Impl : ( ( rule__AutenticacionFirma__CorreoAssignment_4_1 ) ) ;
    public final void rule__AutenticacionFirma__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5728:1: ( ( ( rule__AutenticacionFirma__CorreoAssignment_4_1 ) ) )
            // InternalCeffective.g:5729:1: ( ( rule__AutenticacionFirma__CorreoAssignment_4_1 ) )
            {
            // InternalCeffective.g:5729:1: ( ( rule__AutenticacionFirma__CorreoAssignment_4_1 ) )
            // InternalCeffective.g:5730:2: ( rule__AutenticacionFirma__CorreoAssignment_4_1 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCorreoAssignment_4_1()); 
            // InternalCeffective.g:5731:2: ( rule__AutenticacionFirma__CorreoAssignment_4_1 )
            // InternalCeffective.g:5731:3: rule__AutenticacionFirma__CorreoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__CorreoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getCorreoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_4__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_5__0"
    // InternalCeffective.g:5740:1: rule__AutenticacionFirma__Group_5__0 : rule__AutenticacionFirma__Group_5__0__Impl rule__AutenticacionFirma__Group_5__1 ;
    public final void rule__AutenticacionFirma__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5744:1: ( rule__AutenticacionFirma__Group_5__0__Impl rule__AutenticacionFirma__Group_5__1 )
            // InternalCeffective.g:5745:2: rule__AutenticacionFirma__Group_5__0__Impl rule__AutenticacionFirma__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionFirma__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_5__0"


    // $ANTLR start "rule__AutenticacionFirma__Group_5__0__Impl"
    // InternalCeffective.g:5752:1: rule__AutenticacionFirma__Group_5__0__Impl : ( 'nombre' ) ;
    public final void rule__AutenticacionFirma__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5756:1: ( ( 'nombre' ) )
            // InternalCeffective.g:5757:1: ( 'nombre' )
            {
            // InternalCeffective.g:5757:1: ( 'nombre' )
            // InternalCeffective.g:5758:2: 'nombre'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getNombreKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getNombreKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_5__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_5__1"
    // InternalCeffective.g:5767:1: rule__AutenticacionFirma__Group_5__1 : rule__AutenticacionFirma__Group_5__1__Impl ;
    public final void rule__AutenticacionFirma__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5771:1: ( rule__AutenticacionFirma__Group_5__1__Impl )
            // InternalCeffective.g:5772:2: rule__AutenticacionFirma__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_5__1"


    // $ANTLR start "rule__AutenticacionFirma__Group_5__1__Impl"
    // InternalCeffective.g:5778:1: rule__AutenticacionFirma__Group_5__1__Impl : ( ( rule__AutenticacionFirma__NombreAssignment_5_1 ) ) ;
    public final void rule__AutenticacionFirma__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5782:1: ( ( ( rule__AutenticacionFirma__NombreAssignment_5_1 ) ) )
            // InternalCeffective.g:5783:1: ( ( rule__AutenticacionFirma__NombreAssignment_5_1 ) )
            {
            // InternalCeffective.g:5783:1: ( ( rule__AutenticacionFirma__NombreAssignment_5_1 ) )
            // InternalCeffective.g:5784:2: ( rule__AutenticacionFirma__NombreAssignment_5_1 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getNombreAssignment_5_1()); 
            // InternalCeffective.g:5785:2: ( rule__AutenticacionFirma__NombreAssignment_5_1 )
            // InternalCeffective.g:5785:3: rule__AutenticacionFirma__NombreAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__NombreAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getNombreAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_5__1__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_6__0"
    // InternalCeffective.g:5794:1: rule__AutenticacionFirma__Group_6__0 : rule__AutenticacionFirma__Group_6__0__Impl rule__AutenticacionFirma__Group_6__1 ;
    public final void rule__AutenticacionFirma__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5798:1: ( rule__AutenticacionFirma__Group_6__0__Impl rule__AutenticacionFirma__Group_6__1 )
            // InternalCeffective.g:5799:2: rule__AutenticacionFirma__Group_6__0__Impl rule__AutenticacionFirma__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__AutenticacionFirma__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_6__0"


    // $ANTLR start "rule__AutenticacionFirma__Group_6__0__Impl"
    // InternalCeffective.g:5806:1: rule__AutenticacionFirma__Group_6__0__Impl : ( 'certificado' ) ;
    public final void rule__AutenticacionFirma__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5810:1: ( ( 'certificado' ) )
            // InternalCeffective.g:5811:1: ( 'certificado' )
            {
            // InternalCeffective.g:5811:1: ( 'certificado' )
            // InternalCeffective.g:5812:2: 'certificado'
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCertificadoKeyword_6_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAutenticacionFirmaAccess().getCertificadoKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_6__0__Impl"


    // $ANTLR start "rule__AutenticacionFirma__Group_6__1"
    // InternalCeffective.g:5821:1: rule__AutenticacionFirma__Group_6__1 : rule__AutenticacionFirma__Group_6__1__Impl ;
    public final void rule__AutenticacionFirma__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5825:1: ( rule__AutenticacionFirma__Group_6__1__Impl )
            // InternalCeffective.g:5826:2: rule__AutenticacionFirma__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_6__1"


    // $ANTLR start "rule__AutenticacionFirma__Group_6__1__Impl"
    // InternalCeffective.g:5832:1: rule__AutenticacionFirma__Group_6__1__Impl : ( ( rule__AutenticacionFirma__CertificadoAssignment_6_1 ) ) ;
    public final void rule__AutenticacionFirma__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5836:1: ( ( ( rule__AutenticacionFirma__CertificadoAssignment_6_1 ) ) )
            // InternalCeffective.g:5837:1: ( ( rule__AutenticacionFirma__CertificadoAssignment_6_1 ) )
            {
            // InternalCeffective.g:5837:1: ( ( rule__AutenticacionFirma__CertificadoAssignment_6_1 ) )
            // InternalCeffective.g:5838:2: ( rule__AutenticacionFirma__CertificadoAssignment_6_1 )
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCertificadoAssignment_6_1()); 
            // InternalCeffective.g:5839:2: ( rule__AutenticacionFirma__CertificadoAssignment_6_1 )
            // InternalCeffective.g:5839:3: rule__AutenticacionFirma__CertificadoAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AutenticacionFirma__CertificadoAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAutenticacionFirmaAccess().getCertificadoAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__Group_6__1__Impl"


    // $ANTLR start "rule__Subred__Group__0"
    // InternalCeffective.g:5848:1: rule__Subred__Group__0 : rule__Subred__Group__0__Impl rule__Subred__Group__1 ;
    public final void rule__Subred__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5852:1: ( rule__Subred__Group__0__Impl rule__Subred__Group__1 )
            // InternalCeffective.g:5853:2: rule__Subred__Group__0__Impl rule__Subred__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Subred__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__0"


    // $ANTLR start "rule__Subred__Group__0__Impl"
    // InternalCeffective.g:5860:1: rule__Subred__Group__0__Impl : ( () ) ;
    public final void rule__Subred__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5864:1: ( ( () ) )
            // InternalCeffective.g:5865:1: ( () )
            {
            // InternalCeffective.g:5865:1: ( () )
            // InternalCeffective.g:5866:2: ()
            {
             before(grammarAccess.getSubredAccess().getSubredAction_0()); 
            // InternalCeffective.g:5867:2: ()
            // InternalCeffective.g:5867:3: 
            {
            }

             after(grammarAccess.getSubredAccess().getSubredAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__0__Impl"


    // $ANTLR start "rule__Subred__Group__1"
    // InternalCeffective.g:5875:1: rule__Subred__Group__1 : rule__Subred__Group__1__Impl rule__Subred__Group__2 ;
    public final void rule__Subred__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5879:1: ( rule__Subred__Group__1__Impl rule__Subred__Group__2 )
            // InternalCeffective.g:5880:2: rule__Subred__Group__1__Impl rule__Subred__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Subred__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__1"


    // $ANTLR start "rule__Subred__Group__1__Impl"
    // InternalCeffective.g:5887:1: rule__Subred__Group__1__Impl : ( 'Subred' ) ;
    public final void rule__Subred__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5891:1: ( ( 'Subred' ) )
            // InternalCeffective.g:5892:1: ( 'Subred' )
            {
            // InternalCeffective.g:5892:1: ( 'Subred' )
            // InternalCeffective.g:5893:2: 'Subred'
            {
             before(grammarAccess.getSubredAccess().getSubredKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getSubredKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__1__Impl"


    // $ANTLR start "rule__Subred__Group__2"
    // InternalCeffective.g:5902:1: rule__Subred__Group__2 : rule__Subred__Group__2__Impl rule__Subred__Group__3 ;
    public final void rule__Subred__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5906:1: ( rule__Subred__Group__2__Impl rule__Subred__Group__3 )
            // InternalCeffective.g:5907:2: rule__Subred__Group__2__Impl rule__Subred__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Subred__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__2"


    // $ANTLR start "rule__Subred__Group__2__Impl"
    // InternalCeffective.g:5914:1: rule__Subred__Group__2__Impl : ( '{' ) ;
    public final void rule__Subred__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5918:1: ( ( '{' ) )
            // InternalCeffective.g:5919:1: ( '{' )
            {
            // InternalCeffective.g:5919:1: ( '{' )
            // InternalCeffective.g:5920:2: '{'
            {
             before(grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__2__Impl"


    // $ANTLR start "rule__Subred__Group__3"
    // InternalCeffective.g:5929:1: rule__Subred__Group__3 : rule__Subred__Group__3__Impl rule__Subred__Group__4 ;
    public final void rule__Subred__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5933:1: ( rule__Subred__Group__3__Impl rule__Subred__Group__4 )
            // InternalCeffective.g:5934:2: rule__Subred__Group__3__Impl rule__Subred__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Subred__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__3"


    // $ANTLR start "rule__Subred__Group__3__Impl"
    // InternalCeffective.g:5941:1: rule__Subred__Group__3__Impl : ( ( rule__Subred__Group_3__0 )? ) ;
    public final void rule__Subred__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5945:1: ( ( ( rule__Subred__Group_3__0 )? ) )
            // InternalCeffective.g:5946:1: ( ( rule__Subred__Group_3__0 )? )
            {
            // InternalCeffective.g:5946:1: ( ( rule__Subred__Group_3__0 )? )
            // InternalCeffective.g:5947:2: ( rule__Subred__Group_3__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_3()); 
            // InternalCeffective.g:5948:2: ( rule__Subred__Group_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==27) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalCeffective.g:5948:3: rule__Subred__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__3__Impl"


    // $ANTLR start "rule__Subred__Group__4"
    // InternalCeffective.g:5956:1: rule__Subred__Group__4 : rule__Subred__Group__4__Impl rule__Subred__Group__5 ;
    public final void rule__Subred__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5960:1: ( rule__Subred__Group__4__Impl rule__Subred__Group__5 )
            // InternalCeffective.g:5961:2: rule__Subred__Group__4__Impl rule__Subred__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Subred__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__4"


    // $ANTLR start "rule__Subred__Group__4__Impl"
    // InternalCeffective.g:5968:1: rule__Subred__Group__4__Impl : ( ( rule__Subred__Group_4__0 )? ) ;
    public final void rule__Subred__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5972:1: ( ( ( rule__Subred__Group_4__0 )? ) )
            // InternalCeffective.g:5973:1: ( ( rule__Subred__Group_4__0 )? )
            {
            // InternalCeffective.g:5973:1: ( ( rule__Subred__Group_4__0 )? )
            // InternalCeffective.g:5974:2: ( rule__Subred__Group_4__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_4()); 
            // InternalCeffective.g:5975:2: ( rule__Subred__Group_4__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==38) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalCeffective.g:5975:3: rule__Subred__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__4__Impl"


    // $ANTLR start "rule__Subred__Group__5"
    // InternalCeffective.g:5983:1: rule__Subred__Group__5 : rule__Subred__Group__5__Impl rule__Subred__Group__6 ;
    public final void rule__Subred__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5987:1: ( rule__Subred__Group__5__Impl rule__Subred__Group__6 )
            // InternalCeffective.g:5988:2: rule__Subred__Group__5__Impl rule__Subred__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Subred__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__5"


    // $ANTLR start "rule__Subred__Group__5__Impl"
    // InternalCeffective.g:5995:1: rule__Subred__Group__5__Impl : ( ( rule__Subred__Group_5__0 )? ) ;
    public final void rule__Subred__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:5999:1: ( ( ( rule__Subred__Group_5__0 )? ) )
            // InternalCeffective.g:6000:1: ( ( rule__Subred__Group_5__0 )? )
            {
            // InternalCeffective.g:6000:1: ( ( rule__Subred__Group_5__0 )? )
            // InternalCeffective.g:6001:2: ( rule__Subred__Group_5__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_5()); 
            // InternalCeffective.g:6002:2: ( rule__Subred__Group_5__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==37) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalCeffective.g:6002:3: rule__Subred__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__5__Impl"


    // $ANTLR start "rule__Subred__Group__6"
    // InternalCeffective.g:6010:1: rule__Subred__Group__6 : rule__Subred__Group__6__Impl rule__Subred__Group__7 ;
    public final void rule__Subred__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6014:1: ( rule__Subred__Group__6__Impl rule__Subred__Group__7 )
            // InternalCeffective.g:6015:2: rule__Subred__Group__6__Impl rule__Subred__Group__7
            {
            pushFollow(FOLLOW_32);
            rule__Subred__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__6"


    // $ANTLR start "rule__Subred__Group__6__Impl"
    // InternalCeffective.g:6022:1: rule__Subred__Group__6__Impl : ( ( rule__Subred__Group_6__0 )? ) ;
    public final void rule__Subred__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6026:1: ( ( ( rule__Subred__Group_6__0 )? ) )
            // InternalCeffective.g:6027:1: ( ( rule__Subred__Group_6__0 )? )
            {
            // InternalCeffective.g:6027:1: ( ( rule__Subred__Group_6__0 )? )
            // InternalCeffective.g:6028:2: ( rule__Subred__Group_6__0 )?
            {
             before(grammarAccess.getSubredAccess().getGroup_6()); 
            // InternalCeffective.g:6029:2: ( rule__Subred__Group_6__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==54) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalCeffective.g:6029:3: rule__Subred__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subred__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubredAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__6__Impl"


    // $ANTLR start "rule__Subred__Group__7"
    // InternalCeffective.g:6037:1: rule__Subred__Group__7 : rule__Subred__Group__7__Impl ;
    public final void rule__Subred__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6041:1: ( rule__Subred__Group__7__Impl )
            // InternalCeffective.g:6042:2: rule__Subred__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__7"


    // $ANTLR start "rule__Subred__Group__7__Impl"
    // InternalCeffective.g:6048:1: rule__Subred__Group__7__Impl : ( '}' ) ;
    public final void rule__Subred__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6052:1: ( ( '}' ) )
            // InternalCeffective.g:6053:1: ( '}' )
            {
            // InternalCeffective.g:6053:1: ( '}' )
            // InternalCeffective.g:6054:2: '}'
            {
             before(grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group__7__Impl"


    // $ANTLR start "rule__Subred__Group_3__0"
    // InternalCeffective.g:6064:1: rule__Subred__Group_3__0 : rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1 ;
    public final void rule__Subred__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6068:1: ( rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1 )
            // InternalCeffective.g:6069:2: rule__Subred__Group_3__0__Impl rule__Subred__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__0"


    // $ANTLR start "rule__Subred__Group_3__0__Impl"
    // InternalCeffective.g:6076:1: rule__Subred__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__Subred__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6080:1: ( ( 'nombre' ) )
            // InternalCeffective.g:6081:1: ( 'nombre' )
            {
            // InternalCeffective.g:6081:1: ( 'nombre' )
            // InternalCeffective.g:6082:2: 'nombre'
            {
             before(grammarAccess.getSubredAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__0__Impl"


    // $ANTLR start "rule__Subred__Group_3__1"
    // InternalCeffective.g:6091:1: rule__Subred__Group_3__1 : rule__Subred__Group_3__1__Impl ;
    public final void rule__Subred__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6095:1: ( rule__Subred__Group_3__1__Impl )
            // InternalCeffective.g:6096:2: rule__Subred__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__1"


    // $ANTLR start "rule__Subred__Group_3__1__Impl"
    // InternalCeffective.g:6102:1: rule__Subred__Group_3__1__Impl : ( ( rule__Subred__NombreAssignment_3_1 ) ) ;
    public final void rule__Subred__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6106:1: ( ( ( rule__Subred__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:6107:1: ( ( rule__Subred__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:6107:1: ( ( rule__Subred__NombreAssignment_3_1 ) )
            // InternalCeffective.g:6108:2: ( rule__Subred__NombreAssignment_3_1 )
            {
             before(grammarAccess.getSubredAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:6109:2: ( rule__Subred__NombreAssignment_3_1 )
            // InternalCeffective.g:6109:3: rule__Subred__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_3__1__Impl"


    // $ANTLR start "rule__Subred__Group_4__0"
    // InternalCeffective.g:6118:1: rule__Subred__Group_4__0 : rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 ;
    public final void rule__Subred__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6122:1: ( rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1 )
            // InternalCeffective.g:6123:2: rule__Subred__Group_4__0__Impl rule__Subred__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__0"


    // $ANTLR start "rule__Subred__Group_4__0__Impl"
    // InternalCeffective.g:6130:1: rule__Subred__Group_4__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__Subred__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6134:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:6135:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:6135:1: ( 'zonaNombre' )
            // InternalCeffective.g:6136:2: 'zonaNombre'
            {
             before(grammarAccess.getSubredAccess().getZonaNombreKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getZonaNombreKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__0__Impl"


    // $ANTLR start "rule__Subred__Group_4__1"
    // InternalCeffective.g:6145:1: rule__Subred__Group_4__1 : rule__Subred__Group_4__1__Impl ;
    public final void rule__Subred__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6149:1: ( rule__Subred__Group_4__1__Impl )
            // InternalCeffective.g:6150:2: rule__Subred__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__1"


    // $ANTLR start "rule__Subred__Group_4__1__Impl"
    // InternalCeffective.g:6156:1: rule__Subred__Group_4__1__Impl : ( ( rule__Subred__ZonaNombreAssignment_4_1 ) ) ;
    public final void rule__Subred__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6160:1: ( ( ( rule__Subred__ZonaNombreAssignment_4_1 ) ) )
            // InternalCeffective.g:6161:1: ( ( rule__Subred__ZonaNombreAssignment_4_1 ) )
            {
            // InternalCeffective.g:6161:1: ( ( rule__Subred__ZonaNombreAssignment_4_1 ) )
            // InternalCeffective.g:6162:2: ( rule__Subred__ZonaNombreAssignment_4_1 )
            {
             before(grammarAccess.getSubredAccess().getZonaNombreAssignment_4_1()); 
            // InternalCeffective.g:6163:2: ( rule__Subred__ZonaNombreAssignment_4_1 )
            // InternalCeffective.g:6163:3: rule__Subred__ZonaNombreAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__ZonaNombreAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getZonaNombreAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_4__1__Impl"


    // $ANTLR start "rule__Subred__Group_5__0"
    // InternalCeffective.g:6172:1: rule__Subred__Group_5__0 : rule__Subred__Group_5__0__Impl rule__Subred__Group_5__1 ;
    public final void rule__Subred__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6176:1: ( rule__Subred__Group_5__0__Impl rule__Subred__Group_5__1 )
            // InternalCeffective.g:6177:2: rule__Subred__Group_5__0__Impl rule__Subred__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_5__0"


    // $ANTLR start "rule__Subred__Group_5__0__Impl"
    // InternalCeffective.g:6184:1: rule__Subred__Group_5__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__Subred__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6188:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:6189:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:6189:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:6190:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getZonaDisponibilidadKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_5__0__Impl"


    // $ANTLR start "rule__Subred__Group_5__1"
    // InternalCeffective.g:6199:1: rule__Subred__Group_5__1 : rule__Subred__Group_5__1__Impl ;
    public final void rule__Subred__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6203:1: ( rule__Subred__Group_5__1__Impl )
            // InternalCeffective.g:6204:2: rule__Subred__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_5__1"


    // $ANTLR start "rule__Subred__Group_5__1__Impl"
    // InternalCeffective.g:6210:1: rule__Subred__Group_5__1__Impl : ( ( rule__Subred__ZonaDisponibilidadAssignment_5_1 ) ) ;
    public final void rule__Subred__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6214:1: ( ( ( rule__Subred__ZonaDisponibilidadAssignment_5_1 ) ) )
            // InternalCeffective.g:6215:1: ( ( rule__Subred__ZonaDisponibilidadAssignment_5_1 ) )
            {
            // InternalCeffective.g:6215:1: ( ( rule__Subred__ZonaDisponibilidadAssignment_5_1 ) )
            // InternalCeffective.g:6216:2: ( rule__Subred__ZonaDisponibilidadAssignment_5_1 )
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadAssignment_5_1()); 
            // InternalCeffective.g:6217:2: ( rule__Subred__ZonaDisponibilidadAssignment_5_1 )
            // InternalCeffective.g:6217:3: rule__Subred__ZonaDisponibilidadAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__ZonaDisponibilidadAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getZonaDisponibilidadAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_5__1__Impl"


    // $ANTLR start "rule__Subred__Group_6__0"
    // InternalCeffective.g:6226:1: rule__Subred__Group_6__0 : rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1 ;
    public final void rule__Subred__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6230:1: ( rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1 )
            // InternalCeffective.g:6231:2: rule__Subred__Group_6__0__Impl rule__Subred__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Subred__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subred__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__0"


    // $ANTLR start "rule__Subred__Group_6__0__Impl"
    // InternalCeffective.g:6238:1: rule__Subred__Group_6__0__Impl : ( 'cidrBlock' ) ;
    public final void rule__Subred__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6242:1: ( ( 'cidrBlock' ) )
            // InternalCeffective.g:6243:1: ( 'cidrBlock' )
            {
            // InternalCeffective.g:6243:1: ( 'cidrBlock' )
            // InternalCeffective.g:6244:2: 'cidrBlock'
            {
             before(grammarAccess.getSubredAccess().getCidrBlockKeyword_6_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSubredAccess().getCidrBlockKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__0__Impl"


    // $ANTLR start "rule__Subred__Group_6__1"
    // InternalCeffective.g:6253:1: rule__Subred__Group_6__1 : rule__Subred__Group_6__1__Impl ;
    public final void rule__Subred__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6257:1: ( rule__Subred__Group_6__1__Impl )
            // InternalCeffective.g:6258:2: rule__Subred__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subred__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__1"


    // $ANTLR start "rule__Subred__Group_6__1__Impl"
    // InternalCeffective.g:6264:1: rule__Subred__Group_6__1__Impl : ( ( rule__Subred__CidrBlockAssignment_6_1 ) ) ;
    public final void rule__Subred__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6268:1: ( ( ( rule__Subred__CidrBlockAssignment_6_1 ) ) )
            // InternalCeffective.g:6269:1: ( ( rule__Subred__CidrBlockAssignment_6_1 ) )
            {
            // InternalCeffective.g:6269:1: ( ( rule__Subred__CidrBlockAssignment_6_1 ) )
            // InternalCeffective.g:6270:2: ( rule__Subred__CidrBlockAssignment_6_1 )
            {
             before(grammarAccess.getSubredAccess().getCidrBlockAssignment_6_1()); 
            // InternalCeffective.g:6271:2: ( rule__Subred__CidrBlockAssignment_6_1 )
            // InternalCeffective.g:6271:3: rule__Subred__CidrBlockAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Subred__CidrBlockAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSubredAccess().getCidrBlockAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__Group_6__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group__0"
    // InternalCeffective.g:6280:1: rule__InternetGateway__Group__0 : rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1 ;
    public final void rule__InternetGateway__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6284:1: ( rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1 )
            // InternalCeffective.g:6285:2: rule__InternetGateway__Group__0__Impl rule__InternetGateway__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__InternetGateway__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__0"


    // $ANTLR start "rule__InternetGateway__Group__0__Impl"
    // InternalCeffective.g:6292:1: rule__InternetGateway__Group__0__Impl : ( () ) ;
    public final void rule__InternetGateway__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6296:1: ( ( () ) )
            // InternalCeffective.g:6297:1: ( () )
            {
            // InternalCeffective.g:6297:1: ( () )
            // InternalCeffective.g:6298:2: ()
            {
             before(grammarAccess.getInternetGatewayAccess().getInternetGatewayAction_0()); 
            // InternalCeffective.g:6299:2: ()
            // InternalCeffective.g:6299:3: 
            {
            }

             after(grammarAccess.getInternetGatewayAccess().getInternetGatewayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group__1"
    // InternalCeffective.g:6307:1: rule__InternetGateway__Group__1 : rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2 ;
    public final void rule__InternetGateway__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6311:1: ( rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2 )
            // InternalCeffective.g:6312:2: rule__InternetGateway__Group__1__Impl rule__InternetGateway__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InternetGateway__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__1"


    // $ANTLR start "rule__InternetGateway__Group__1__Impl"
    // InternalCeffective.g:6319:1: rule__InternetGateway__Group__1__Impl : ( 'InternetGateway' ) ;
    public final void rule__InternetGateway__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6323:1: ( ( 'InternetGateway' ) )
            // InternalCeffective.g:6324:1: ( 'InternetGateway' )
            {
            // InternalCeffective.g:6324:1: ( 'InternetGateway' )
            // InternalCeffective.g:6325:2: 'InternetGateway'
            {
             before(grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getInternetGatewayKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group__2"
    // InternalCeffective.g:6334:1: rule__InternetGateway__Group__2 : rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3 ;
    public final void rule__InternetGateway__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6338:1: ( rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3 )
            // InternalCeffective.g:6339:2: rule__InternetGateway__Group__2__Impl rule__InternetGateway__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__InternetGateway__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__2"


    // $ANTLR start "rule__InternetGateway__Group__2__Impl"
    // InternalCeffective.g:6346:1: rule__InternetGateway__Group__2__Impl : ( '{' ) ;
    public final void rule__InternetGateway__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6350:1: ( ( '{' ) )
            // InternalCeffective.g:6351:1: ( '{' )
            {
            // InternalCeffective.g:6351:1: ( '{' )
            // InternalCeffective.g:6352:2: '{'
            {
             before(grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__2__Impl"


    // $ANTLR start "rule__InternetGateway__Group__3"
    // InternalCeffective.g:6361:1: rule__InternetGateway__Group__3 : rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4 ;
    public final void rule__InternetGateway__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6365:1: ( rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4 )
            // InternalCeffective.g:6366:2: rule__InternetGateway__Group__3__Impl rule__InternetGateway__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__InternetGateway__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__3"


    // $ANTLR start "rule__InternetGateway__Group__3__Impl"
    // InternalCeffective.g:6373:1: rule__InternetGateway__Group__3__Impl : ( ( rule__InternetGateway__Group_3__0 )? ) ;
    public final void rule__InternetGateway__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6377:1: ( ( ( rule__InternetGateway__Group_3__0 )? ) )
            // InternalCeffective.g:6378:1: ( ( rule__InternetGateway__Group_3__0 )? )
            {
            // InternalCeffective.g:6378:1: ( ( rule__InternetGateway__Group_3__0 )? )
            // InternalCeffective.g:6379:2: ( rule__InternetGateway__Group_3__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_3()); 
            // InternalCeffective.g:6380:2: ( rule__InternetGateway__Group_3__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==27) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalCeffective.g:6380:3: rule__InternetGateway__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternetGateway__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternetGatewayAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__3__Impl"


    // $ANTLR start "rule__InternetGateway__Group__4"
    // InternalCeffective.g:6388:1: rule__InternetGateway__Group__4 : rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5 ;
    public final void rule__InternetGateway__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6392:1: ( rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5 )
            // InternalCeffective.g:6393:2: rule__InternetGateway__Group__4__Impl rule__InternetGateway__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__InternetGateway__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__4"


    // $ANTLR start "rule__InternetGateway__Group__4__Impl"
    // InternalCeffective.g:6400:1: rule__InternetGateway__Group__4__Impl : ( ( rule__InternetGateway__Group_4__0 )? ) ;
    public final void rule__InternetGateway__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6404:1: ( ( ( rule__InternetGateway__Group_4__0 )? ) )
            // InternalCeffective.g:6405:1: ( ( rule__InternetGateway__Group_4__0 )? )
            {
            // InternalCeffective.g:6405:1: ( ( rule__InternetGateway__Group_4__0 )? )
            // InternalCeffective.g:6406:2: ( rule__InternetGateway__Group_4__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_4()); 
            // InternalCeffective.g:6407:2: ( rule__InternetGateway__Group_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==38) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalCeffective.g:6407:3: rule__InternetGateway__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternetGateway__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternetGatewayAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__4__Impl"


    // $ANTLR start "rule__InternetGateway__Group__5"
    // InternalCeffective.g:6415:1: rule__InternetGateway__Group__5 : rule__InternetGateway__Group__5__Impl rule__InternetGateway__Group__6 ;
    public final void rule__InternetGateway__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6419:1: ( rule__InternetGateway__Group__5__Impl rule__InternetGateway__Group__6 )
            // InternalCeffective.g:6420:2: rule__InternetGateway__Group__5__Impl rule__InternetGateway__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__InternetGateway__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__5"


    // $ANTLR start "rule__InternetGateway__Group__5__Impl"
    // InternalCeffective.g:6427:1: rule__InternetGateway__Group__5__Impl : ( ( rule__InternetGateway__Group_5__0 )? ) ;
    public final void rule__InternetGateway__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6431:1: ( ( ( rule__InternetGateway__Group_5__0 )? ) )
            // InternalCeffective.g:6432:1: ( ( rule__InternetGateway__Group_5__0 )? )
            {
            // InternalCeffective.g:6432:1: ( ( rule__InternetGateway__Group_5__0 )? )
            // InternalCeffective.g:6433:2: ( rule__InternetGateway__Group_5__0 )?
            {
             before(grammarAccess.getInternetGatewayAccess().getGroup_5()); 
            // InternalCeffective.g:6434:2: ( rule__InternetGateway__Group_5__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==37) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalCeffective.g:6434:3: rule__InternetGateway__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InternetGateway__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInternetGatewayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__5__Impl"


    // $ANTLR start "rule__InternetGateway__Group__6"
    // InternalCeffective.g:6442:1: rule__InternetGateway__Group__6 : rule__InternetGateway__Group__6__Impl ;
    public final void rule__InternetGateway__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6446:1: ( rule__InternetGateway__Group__6__Impl )
            // InternalCeffective.g:6447:2: rule__InternetGateway__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__6"


    // $ANTLR start "rule__InternetGateway__Group__6__Impl"
    // InternalCeffective.g:6453:1: rule__InternetGateway__Group__6__Impl : ( '}' ) ;
    public final void rule__InternetGateway__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6457:1: ( ( '}' ) )
            // InternalCeffective.g:6458:1: ( '}' )
            {
            // InternalCeffective.g:6458:1: ( '}' )
            // InternalCeffective.g:6459:2: '}'
            {
             before(grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group__6__Impl"


    // $ANTLR start "rule__InternetGateway__Group_3__0"
    // InternalCeffective.g:6469:1: rule__InternetGateway__Group_3__0 : rule__InternetGateway__Group_3__0__Impl rule__InternetGateway__Group_3__1 ;
    public final void rule__InternetGateway__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6473:1: ( rule__InternetGateway__Group_3__0__Impl rule__InternetGateway__Group_3__1 )
            // InternalCeffective.g:6474:2: rule__InternetGateway__Group_3__0__Impl rule__InternetGateway__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__InternetGateway__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_3__0"


    // $ANTLR start "rule__InternetGateway__Group_3__0__Impl"
    // InternalCeffective.g:6481:1: rule__InternetGateway__Group_3__0__Impl : ( 'nombre' ) ;
    public final void rule__InternetGateway__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6485:1: ( ( 'nombre' ) )
            // InternalCeffective.g:6486:1: ( 'nombre' )
            {
            // InternalCeffective.g:6486:1: ( 'nombre' )
            // InternalCeffective.g:6487:2: 'nombre'
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_3__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group_3__1"
    // InternalCeffective.g:6496:1: rule__InternetGateway__Group_3__1 : rule__InternetGateway__Group_3__1__Impl ;
    public final void rule__InternetGateway__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6500:1: ( rule__InternetGateway__Group_3__1__Impl )
            // InternalCeffective.g:6501:2: rule__InternetGateway__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_3__1"


    // $ANTLR start "rule__InternetGateway__Group_3__1__Impl"
    // InternalCeffective.g:6507:1: rule__InternetGateway__Group_3__1__Impl : ( ( rule__InternetGateway__NombreAssignment_3_1 ) ) ;
    public final void rule__InternetGateway__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6511:1: ( ( ( rule__InternetGateway__NombreAssignment_3_1 ) ) )
            // InternalCeffective.g:6512:1: ( ( rule__InternetGateway__NombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:6512:1: ( ( rule__InternetGateway__NombreAssignment_3_1 ) )
            // InternalCeffective.g:6513:2: ( rule__InternetGateway__NombreAssignment_3_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreAssignment_3_1()); 
            // InternalCeffective.g:6514:2: ( rule__InternetGateway__NombreAssignment_3_1 )
            // InternalCeffective.g:6514:3: rule__InternetGateway__NombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__NombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_3__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group_4__0"
    // InternalCeffective.g:6523:1: rule__InternetGateway__Group_4__0 : rule__InternetGateway__Group_4__0__Impl rule__InternetGateway__Group_4__1 ;
    public final void rule__InternetGateway__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6527:1: ( rule__InternetGateway__Group_4__0__Impl rule__InternetGateway__Group_4__1 )
            // InternalCeffective.g:6528:2: rule__InternetGateway__Group_4__0__Impl rule__InternetGateway__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__InternetGateway__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_4__0"


    // $ANTLR start "rule__InternetGateway__Group_4__0__Impl"
    // InternalCeffective.g:6535:1: rule__InternetGateway__Group_4__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__InternetGateway__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6539:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:6540:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:6540:1: ( 'zonaNombre' )
            // InternalCeffective.g:6541:2: 'zonaNombre'
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaNombreKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getZonaNombreKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_4__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group_4__1"
    // InternalCeffective.g:6550:1: rule__InternetGateway__Group_4__1 : rule__InternetGateway__Group_4__1__Impl ;
    public final void rule__InternetGateway__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6554:1: ( rule__InternetGateway__Group_4__1__Impl )
            // InternalCeffective.g:6555:2: rule__InternetGateway__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_4__1"


    // $ANTLR start "rule__InternetGateway__Group_4__1__Impl"
    // InternalCeffective.g:6561:1: rule__InternetGateway__Group_4__1__Impl : ( ( rule__InternetGateway__ZonaNombreAssignment_4_1 ) ) ;
    public final void rule__InternetGateway__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6565:1: ( ( ( rule__InternetGateway__ZonaNombreAssignment_4_1 ) ) )
            // InternalCeffective.g:6566:1: ( ( rule__InternetGateway__ZonaNombreAssignment_4_1 ) )
            {
            // InternalCeffective.g:6566:1: ( ( rule__InternetGateway__ZonaNombreAssignment_4_1 ) )
            // InternalCeffective.g:6567:2: ( rule__InternetGateway__ZonaNombreAssignment_4_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaNombreAssignment_4_1()); 
            // InternalCeffective.g:6568:2: ( rule__InternetGateway__ZonaNombreAssignment_4_1 )
            // InternalCeffective.g:6568:3: rule__InternetGateway__ZonaNombreAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__ZonaNombreAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getZonaNombreAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_4__1__Impl"


    // $ANTLR start "rule__InternetGateway__Group_5__0"
    // InternalCeffective.g:6577:1: rule__InternetGateway__Group_5__0 : rule__InternetGateway__Group_5__0__Impl rule__InternetGateway__Group_5__1 ;
    public final void rule__InternetGateway__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6581:1: ( rule__InternetGateway__Group_5__0__Impl rule__InternetGateway__Group_5__1 )
            // InternalCeffective.g:6582:2: rule__InternetGateway__Group_5__0__Impl rule__InternetGateway__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__InternetGateway__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_5__0"


    // $ANTLR start "rule__InternetGateway__Group_5__0__Impl"
    // InternalCeffective.g:6589:1: rule__InternetGateway__Group_5__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__InternetGateway__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6593:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:6594:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:6594:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:6595:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_5__0__Impl"


    // $ANTLR start "rule__InternetGateway__Group_5__1"
    // InternalCeffective.g:6604:1: rule__InternetGateway__Group_5__1 : rule__InternetGateway__Group_5__1__Impl ;
    public final void rule__InternetGateway__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6608:1: ( rule__InternetGateway__Group_5__1__Impl )
            // InternalCeffective.g:6609:2: rule__InternetGateway__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_5__1"


    // $ANTLR start "rule__InternetGateway__Group_5__1__Impl"
    // InternalCeffective.g:6615:1: rule__InternetGateway__Group_5__1__Impl : ( ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 ) ) ;
    public final void rule__InternetGateway__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6619:1: ( ( ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 ) ) )
            // InternalCeffective.g:6620:1: ( ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 ) )
            {
            // InternalCeffective.g:6620:1: ( ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 ) )
            // InternalCeffective.g:6621:2: ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 )
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadAssignment_5_1()); 
            // InternalCeffective.g:6622:2: ( rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 )
            // InternalCeffective.g:6622:3: rule__InternetGateway__ZonaDisponibilidadAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InternetGateway__ZonaDisponibilidadAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__Group_5__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__0"
    // InternalCeffective.g:6631:1: rule__GrupoSeguridad__Group__0 : rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1 ;
    public final void rule__GrupoSeguridad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6635:1: ( rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1 )
            // InternalCeffective.g:6636:2: rule__GrupoSeguridad__Group__0__Impl rule__GrupoSeguridad__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GrupoSeguridad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__0"


    // $ANTLR start "rule__GrupoSeguridad__Group__0__Impl"
    // InternalCeffective.g:6643:1: rule__GrupoSeguridad__Group__0__Impl : ( 'GrupoSeguridad' ) ;
    public final void rule__GrupoSeguridad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6647:1: ( ( 'GrupoSeguridad' ) )
            // InternalCeffective.g:6648:1: ( 'GrupoSeguridad' )
            {
            // InternalCeffective.g:6648:1: ( 'GrupoSeguridad' )
            // InternalCeffective.g:6649:2: 'GrupoSeguridad'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getGrupoSeguridadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__1"
    // InternalCeffective.g:6658:1: rule__GrupoSeguridad__Group__1 : rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2 ;
    public final void rule__GrupoSeguridad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6662:1: ( rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2 )
            // InternalCeffective.g:6663:2: rule__GrupoSeguridad__Group__1__Impl rule__GrupoSeguridad__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__GrupoSeguridad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__1"


    // $ANTLR start "rule__GrupoSeguridad__Group__1__Impl"
    // InternalCeffective.g:6670:1: rule__GrupoSeguridad__Group__1__Impl : ( '{' ) ;
    public final void rule__GrupoSeguridad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6674:1: ( ( '{' ) )
            // InternalCeffective.g:6675:1: ( '{' )
            {
            // InternalCeffective.g:6675:1: ( '{' )
            // InternalCeffective.g:6676:2: '{'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__2"
    // InternalCeffective.g:6685:1: rule__GrupoSeguridad__Group__2 : rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3 ;
    public final void rule__GrupoSeguridad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6689:1: ( rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3 )
            // InternalCeffective.g:6690:2: rule__GrupoSeguridad__Group__2__Impl rule__GrupoSeguridad__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__GrupoSeguridad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__2"


    // $ANTLR start "rule__GrupoSeguridad__Group__2__Impl"
    // InternalCeffective.g:6697:1: rule__GrupoSeguridad__Group__2__Impl : ( ( rule__GrupoSeguridad__Group_2__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6701:1: ( ( ( rule__GrupoSeguridad__Group_2__0 )? ) )
            // InternalCeffective.g:6702:1: ( ( rule__GrupoSeguridad__Group_2__0 )? )
            {
            // InternalCeffective.g:6702:1: ( ( rule__GrupoSeguridad__Group_2__0 )? )
            // InternalCeffective.g:6703:2: ( rule__GrupoSeguridad__Group_2__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_2()); 
            // InternalCeffective.g:6704:2: ( rule__GrupoSeguridad__Group_2__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==27) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalCeffective.g:6704:3: rule__GrupoSeguridad__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__2__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__3"
    // InternalCeffective.g:6712:1: rule__GrupoSeguridad__Group__3 : rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4 ;
    public final void rule__GrupoSeguridad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6716:1: ( rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4 )
            // InternalCeffective.g:6717:2: rule__GrupoSeguridad__Group__3__Impl rule__GrupoSeguridad__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__GrupoSeguridad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__3"


    // $ANTLR start "rule__GrupoSeguridad__Group__3__Impl"
    // InternalCeffective.g:6724:1: rule__GrupoSeguridad__Group__3__Impl : ( ( rule__GrupoSeguridad__Group_3__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6728:1: ( ( ( rule__GrupoSeguridad__Group_3__0 )? ) )
            // InternalCeffective.g:6729:1: ( ( rule__GrupoSeguridad__Group_3__0 )? )
            {
            // InternalCeffective.g:6729:1: ( ( rule__GrupoSeguridad__Group_3__0 )? )
            // InternalCeffective.g:6730:2: ( rule__GrupoSeguridad__Group_3__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_3()); 
            // InternalCeffective.g:6731:2: ( rule__GrupoSeguridad__Group_3__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==38) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalCeffective.g:6731:3: rule__GrupoSeguridad__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__3__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__4"
    // InternalCeffective.g:6739:1: rule__GrupoSeguridad__Group__4 : rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5 ;
    public final void rule__GrupoSeguridad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6743:1: ( rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5 )
            // InternalCeffective.g:6744:2: rule__GrupoSeguridad__Group__4__Impl rule__GrupoSeguridad__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__GrupoSeguridad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__4"


    // $ANTLR start "rule__GrupoSeguridad__Group__4__Impl"
    // InternalCeffective.g:6751:1: rule__GrupoSeguridad__Group__4__Impl : ( ( rule__GrupoSeguridad__Group_4__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6755:1: ( ( ( rule__GrupoSeguridad__Group_4__0 )? ) )
            // InternalCeffective.g:6756:1: ( ( rule__GrupoSeguridad__Group_4__0 )? )
            {
            // InternalCeffective.g:6756:1: ( ( rule__GrupoSeguridad__Group_4__0 )? )
            // InternalCeffective.g:6757:2: ( rule__GrupoSeguridad__Group_4__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_4()); 
            // InternalCeffective.g:6758:2: ( rule__GrupoSeguridad__Group_4__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==37) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalCeffective.g:6758:3: rule__GrupoSeguridad__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__4__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__5"
    // InternalCeffective.g:6766:1: rule__GrupoSeguridad__Group__5 : rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6 ;
    public final void rule__GrupoSeguridad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6770:1: ( rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6 )
            // InternalCeffective.g:6771:2: rule__GrupoSeguridad__Group__5__Impl rule__GrupoSeguridad__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__GrupoSeguridad__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__5"


    // $ANTLR start "rule__GrupoSeguridad__Group__5__Impl"
    // InternalCeffective.g:6778:1: rule__GrupoSeguridad__Group__5__Impl : ( ( rule__GrupoSeguridad__Group_5__0 )? ) ;
    public final void rule__GrupoSeguridad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6782:1: ( ( ( rule__GrupoSeguridad__Group_5__0 )? ) )
            // InternalCeffective.g:6783:1: ( ( rule__GrupoSeguridad__Group_5__0 )? )
            {
            // InternalCeffective.g:6783:1: ( ( rule__GrupoSeguridad__Group_5__0 )? )
            // InternalCeffective.g:6784:2: ( rule__GrupoSeguridad__Group_5__0 )?
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_5()); 
            // InternalCeffective.g:6785:2: ( rule__GrupoSeguridad__Group_5__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==59) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalCeffective.g:6785:3: rule__GrupoSeguridad__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GrupoSeguridad__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__5__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__6"
    // InternalCeffective.g:6793:1: rule__GrupoSeguridad__Group__6 : rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7 ;
    public final void rule__GrupoSeguridad__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6797:1: ( rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7 )
            // InternalCeffective.g:6798:2: rule__GrupoSeguridad__Group__6__Impl rule__GrupoSeguridad__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__GrupoSeguridad__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__6"


    // $ANTLR start "rule__GrupoSeguridad__Group__6__Impl"
    // InternalCeffective.g:6805:1: rule__GrupoSeguridad__Group__6__Impl : ( 'reglasSalida' ) ;
    public final void rule__GrupoSeguridad__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6809:1: ( ( 'reglasSalida' ) )
            // InternalCeffective.g:6810:1: ( 'reglasSalida' )
            {
            // InternalCeffective.g:6810:1: ( 'reglasSalida' )
            // InternalCeffective.g:6811:2: 'reglasSalida'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_6()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__6__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__7"
    // InternalCeffective.g:6820:1: rule__GrupoSeguridad__Group__7 : rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8 ;
    public final void rule__GrupoSeguridad__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6824:1: ( rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8 )
            // InternalCeffective.g:6825:2: rule__GrupoSeguridad__Group__7__Impl rule__GrupoSeguridad__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__7"


    // $ANTLR start "rule__GrupoSeguridad__Group__7__Impl"
    // InternalCeffective.g:6832:1: rule__GrupoSeguridad__Group__7__Impl : ( '(' ) ;
    public final void rule__GrupoSeguridad__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6836:1: ( ( '(' ) )
            // InternalCeffective.g:6837:1: ( '(' )
            {
            // InternalCeffective.g:6837:1: ( '(' )
            // InternalCeffective.g:6838:2: '('
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__7__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__8"
    // InternalCeffective.g:6847:1: rule__GrupoSeguridad__Group__8 : rule__GrupoSeguridad__Group__8__Impl rule__GrupoSeguridad__Group__9 ;
    public final void rule__GrupoSeguridad__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6851:1: ( rule__GrupoSeguridad__Group__8__Impl rule__GrupoSeguridad__Group__9 )
            // InternalCeffective.g:6852:2: rule__GrupoSeguridad__Group__8__Impl rule__GrupoSeguridad__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__GrupoSeguridad__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__8"


    // $ANTLR start "rule__GrupoSeguridad__Group__8__Impl"
    // InternalCeffective.g:6859:1: rule__GrupoSeguridad__Group__8__Impl : ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_8 ) ) ;
    public final void rule__GrupoSeguridad__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6863:1: ( ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_8 ) ) )
            // InternalCeffective.g:6864:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_8 ) )
            {
            // InternalCeffective.g:6864:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_8 ) )
            // InternalCeffective.g:6865:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_8 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_8()); 
            // InternalCeffective.g:6866:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_8 )
            // InternalCeffective.g:6866:3: rule__GrupoSeguridad__ReglasSalidaAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasSalidaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__8__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__9"
    // InternalCeffective.g:6874:1: rule__GrupoSeguridad__Group__9 : rule__GrupoSeguridad__Group__9__Impl rule__GrupoSeguridad__Group__10 ;
    public final void rule__GrupoSeguridad__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6878:1: ( rule__GrupoSeguridad__Group__9__Impl rule__GrupoSeguridad__Group__10 )
            // InternalCeffective.g:6879:2: rule__GrupoSeguridad__Group__9__Impl rule__GrupoSeguridad__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__GrupoSeguridad__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__9"


    // $ANTLR start "rule__GrupoSeguridad__Group__9__Impl"
    // InternalCeffective.g:6886:1: rule__GrupoSeguridad__Group__9__Impl : ( ( rule__GrupoSeguridad__Group_9__0 )* ) ;
    public final void rule__GrupoSeguridad__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6890:1: ( ( ( rule__GrupoSeguridad__Group_9__0 )* ) )
            // InternalCeffective.g:6891:1: ( ( rule__GrupoSeguridad__Group_9__0 )* )
            {
            // InternalCeffective.g:6891:1: ( ( rule__GrupoSeguridad__Group_9__0 )* )
            // InternalCeffective.g:6892:2: ( rule__GrupoSeguridad__Group_9__0 )*
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_9()); 
            // InternalCeffective.g:6893:2: ( rule__GrupoSeguridad__Group_9__0 )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==31) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalCeffective.g:6893:3: rule__GrupoSeguridad__Group_9__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GrupoSeguridad__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__9__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__10"
    // InternalCeffective.g:6901:1: rule__GrupoSeguridad__Group__10 : rule__GrupoSeguridad__Group__10__Impl rule__GrupoSeguridad__Group__11 ;
    public final void rule__GrupoSeguridad__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6905:1: ( rule__GrupoSeguridad__Group__10__Impl rule__GrupoSeguridad__Group__11 )
            // InternalCeffective.g:6906:2: rule__GrupoSeguridad__Group__10__Impl rule__GrupoSeguridad__Group__11
            {
            pushFollow(FOLLOW_36);
            rule__GrupoSeguridad__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__10"


    // $ANTLR start "rule__GrupoSeguridad__Group__10__Impl"
    // InternalCeffective.g:6913:1: rule__GrupoSeguridad__Group__10__Impl : ( ')' ) ;
    public final void rule__GrupoSeguridad__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6917:1: ( ( ')' ) )
            // InternalCeffective.g:6918:1: ( ')' )
            {
            // InternalCeffective.g:6918:1: ( ')' )
            // InternalCeffective.g:6919:2: ')'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_10()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__10__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__11"
    // InternalCeffective.g:6928:1: rule__GrupoSeguridad__Group__11 : rule__GrupoSeguridad__Group__11__Impl rule__GrupoSeguridad__Group__12 ;
    public final void rule__GrupoSeguridad__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6932:1: ( rule__GrupoSeguridad__Group__11__Impl rule__GrupoSeguridad__Group__12 )
            // InternalCeffective.g:6933:2: rule__GrupoSeguridad__Group__11__Impl rule__GrupoSeguridad__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__GrupoSeguridad__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__11"


    // $ANTLR start "rule__GrupoSeguridad__Group__11__Impl"
    // InternalCeffective.g:6940:1: rule__GrupoSeguridad__Group__11__Impl : ( 'reglasEntrada' ) ;
    public final void rule__GrupoSeguridad__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6944:1: ( ( 'reglasEntrada' ) )
            // InternalCeffective.g:6945:1: ( 'reglasEntrada' )
            {
            // InternalCeffective.g:6945:1: ( 'reglasEntrada' )
            // InternalCeffective.g:6946:2: 'reglasEntrada'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_11()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__11__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__12"
    // InternalCeffective.g:6955:1: rule__GrupoSeguridad__Group__12 : rule__GrupoSeguridad__Group__12__Impl rule__GrupoSeguridad__Group__13 ;
    public final void rule__GrupoSeguridad__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6959:1: ( rule__GrupoSeguridad__Group__12__Impl rule__GrupoSeguridad__Group__13 )
            // InternalCeffective.g:6960:2: rule__GrupoSeguridad__Group__12__Impl rule__GrupoSeguridad__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__12"


    // $ANTLR start "rule__GrupoSeguridad__Group__12__Impl"
    // InternalCeffective.g:6967:1: rule__GrupoSeguridad__Group__12__Impl : ( '(' ) ;
    public final void rule__GrupoSeguridad__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6971:1: ( ( '(' ) )
            // InternalCeffective.g:6972:1: ( '(' )
            {
            // InternalCeffective.g:6972:1: ( '(' )
            // InternalCeffective.g:6973:2: '('
            {
             before(grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_12()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getLeftParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__12__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__13"
    // InternalCeffective.g:6982:1: rule__GrupoSeguridad__Group__13 : rule__GrupoSeguridad__Group__13__Impl rule__GrupoSeguridad__Group__14 ;
    public final void rule__GrupoSeguridad__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6986:1: ( rule__GrupoSeguridad__Group__13__Impl rule__GrupoSeguridad__Group__14 )
            // InternalCeffective.g:6987:2: rule__GrupoSeguridad__Group__13__Impl rule__GrupoSeguridad__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__GrupoSeguridad__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__13"


    // $ANTLR start "rule__GrupoSeguridad__Group__13__Impl"
    // InternalCeffective.g:6994:1: rule__GrupoSeguridad__Group__13__Impl : ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_13 ) ) ;
    public final void rule__GrupoSeguridad__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:6998:1: ( ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_13 ) ) )
            // InternalCeffective.g:6999:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_13 ) )
            {
            // InternalCeffective.g:6999:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_13 ) )
            // InternalCeffective.g:7000:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_13 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_13()); 
            // InternalCeffective.g:7001:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_13 )
            // InternalCeffective.g:7001:3: rule__GrupoSeguridad__ReglasEntradaAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasEntradaAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__13__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__14"
    // InternalCeffective.g:7009:1: rule__GrupoSeguridad__Group__14 : rule__GrupoSeguridad__Group__14__Impl rule__GrupoSeguridad__Group__15 ;
    public final void rule__GrupoSeguridad__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7013:1: ( rule__GrupoSeguridad__Group__14__Impl rule__GrupoSeguridad__Group__15 )
            // InternalCeffective.g:7014:2: rule__GrupoSeguridad__Group__14__Impl rule__GrupoSeguridad__Group__15
            {
            pushFollow(FOLLOW_14);
            rule__GrupoSeguridad__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__14"


    // $ANTLR start "rule__GrupoSeguridad__Group__14__Impl"
    // InternalCeffective.g:7021:1: rule__GrupoSeguridad__Group__14__Impl : ( ( rule__GrupoSeguridad__Group_14__0 )* ) ;
    public final void rule__GrupoSeguridad__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7025:1: ( ( ( rule__GrupoSeguridad__Group_14__0 )* ) )
            // InternalCeffective.g:7026:1: ( ( rule__GrupoSeguridad__Group_14__0 )* )
            {
            // InternalCeffective.g:7026:1: ( ( rule__GrupoSeguridad__Group_14__0 )* )
            // InternalCeffective.g:7027:2: ( rule__GrupoSeguridad__Group_14__0 )*
            {
             before(grammarAccess.getGrupoSeguridadAccess().getGroup_14()); 
            // InternalCeffective.g:7028:2: ( rule__GrupoSeguridad__Group_14__0 )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==31) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalCeffective.g:7028:3: rule__GrupoSeguridad__Group_14__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GrupoSeguridad__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

             after(grammarAccess.getGrupoSeguridadAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__14__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__15"
    // InternalCeffective.g:7036:1: rule__GrupoSeguridad__Group__15 : rule__GrupoSeguridad__Group__15__Impl rule__GrupoSeguridad__Group__16 ;
    public final void rule__GrupoSeguridad__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7040:1: ( rule__GrupoSeguridad__Group__15__Impl rule__GrupoSeguridad__Group__16 )
            // InternalCeffective.g:7041:2: rule__GrupoSeguridad__Group__15__Impl rule__GrupoSeguridad__Group__16
            {
            pushFollow(FOLLOW_11);
            rule__GrupoSeguridad__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__15"


    // $ANTLR start "rule__GrupoSeguridad__Group__15__Impl"
    // InternalCeffective.g:7048:1: rule__GrupoSeguridad__Group__15__Impl : ( ')' ) ;
    public final void rule__GrupoSeguridad__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7052:1: ( ( ')' ) )
            // InternalCeffective.g:7053:1: ( ')' )
            {
            // InternalCeffective.g:7053:1: ( ')' )
            // InternalCeffective.g:7054:2: ')'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_15()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightParenthesisKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__15__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group__16"
    // InternalCeffective.g:7063:1: rule__GrupoSeguridad__Group__16 : rule__GrupoSeguridad__Group__16__Impl ;
    public final void rule__GrupoSeguridad__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7067:1: ( rule__GrupoSeguridad__Group__16__Impl )
            // InternalCeffective.g:7068:2: rule__GrupoSeguridad__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__16"


    // $ANTLR start "rule__GrupoSeguridad__Group__16__Impl"
    // InternalCeffective.g:7074:1: rule__GrupoSeguridad__Group__16__Impl : ( '}' ) ;
    public final void rule__GrupoSeguridad__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7078:1: ( ( '}' ) )
            // InternalCeffective.g:7079:1: ( '}' )
            {
            // InternalCeffective.g:7079:1: ( '}' )
            // InternalCeffective.g:7080:2: '}'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_16()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group__16__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__0"
    // InternalCeffective.g:7090:1: rule__GrupoSeguridad__Group_2__0 : rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1 ;
    public final void rule__GrupoSeguridad__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7094:1: ( rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1 )
            // InternalCeffective.g:7095:2: rule__GrupoSeguridad__Group_2__0__Impl rule__GrupoSeguridad__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__0__Impl"
    // InternalCeffective.g:7102:1: rule__GrupoSeguridad__Group_2__0__Impl : ( 'nombre' ) ;
    public final void rule__GrupoSeguridad__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7106:1: ( ( 'nombre' ) )
            // InternalCeffective.g:7107:1: ( 'nombre' )
            {
            // InternalCeffective.g:7107:1: ( 'nombre' )
            // InternalCeffective.g:7108:2: 'nombre'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getNombreKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__1"
    // InternalCeffective.g:7117:1: rule__GrupoSeguridad__Group_2__1 : rule__GrupoSeguridad__Group_2__1__Impl ;
    public final void rule__GrupoSeguridad__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7121:1: ( rule__GrupoSeguridad__Group_2__1__Impl )
            // InternalCeffective.g:7122:2: rule__GrupoSeguridad__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_2__1__Impl"
    // InternalCeffective.g:7128:1: rule__GrupoSeguridad__Group_2__1__Impl : ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7132:1: ( ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) ) )
            // InternalCeffective.g:7133:1: ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) )
            {
            // InternalCeffective.g:7133:1: ( ( rule__GrupoSeguridad__NombreAssignment_2_1 ) )
            // InternalCeffective.g:7134:2: ( rule__GrupoSeguridad__NombreAssignment_2_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreAssignment_2_1()); 
            // InternalCeffective.g:7135:2: ( rule__GrupoSeguridad__NombreAssignment_2_1 )
            // InternalCeffective.g:7135:3: rule__GrupoSeguridad__NombreAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__NombreAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getNombreAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_2__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__0"
    // InternalCeffective.g:7144:1: rule__GrupoSeguridad__Group_3__0 : rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1 ;
    public final void rule__GrupoSeguridad__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7148:1: ( rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1 )
            // InternalCeffective.g:7149:2: rule__GrupoSeguridad__Group_3__0__Impl rule__GrupoSeguridad__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__0__Impl"
    // InternalCeffective.g:7156:1: rule__GrupoSeguridad__Group_3__0__Impl : ( 'zonaNombre' ) ;
    public final void rule__GrupoSeguridad__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7160:1: ( ( 'zonaNombre' ) )
            // InternalCeffective.g:7161:1: ( 'zonaNombre' )
            {
            // InternalCeffective.g:7161:1: ( 'zonaNombre' )
            // InternalCeffective.g:7162:2: 'zonaNombre'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaNombreKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getZonaNombreKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__1"
    // InternalCeffective.g:7171:1: rule__GrupoSeguridad__Group_3__1 : rule__GrupoSeguridad__Group_3__1__Impl ;
    public final void rule__GrupoSeguridad__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7175:1: ( rule__GrupoSeguridad__Group_3__1__Impl )
            // InternalCeffective.g:7176:2: rule__GrupoSeguridad__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_3__1__Impl"
    // InternalCeffective.g:7182:1: rule__GrupoSeguridad__Group_3__1__Impl : ( ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7186:1: ( ( ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 ) ) )
            // InternalCeffective.g:7187:1: ( ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 ) )
            {
            // InternalCeffective.g:7187:1: ( ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 ) )
            // InternalCeffective.g:7188:2: ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaNombreAssignment_3_1()); 
            // InternalCeffective.g:7189:2: ( rule__GrupoSeguridad__ZonaNombreAssignment_3_1 )
            // InternalCeffective.g:7189:3: rule__GrupoSeguridad__ZonaNombreAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ZonaNombreAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getZonaNombreAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_3__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_4__0"
    // InternalCeffective.g:7198:1: rule__GrupoSeguridad__Group_4__0 : rule__GrupoSeguridad__Group_4__0__Impl rule__GrupoSeguridad__Group_4__1 ;
    public final void rule__GrupoSeguridad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7202:1: ( rule__GrupoSeguridad__Group_4__0__Impl rule__GrupoSeguridad__Group_4__1 )
            // InternalCeffective.g:7203:2: rule__GrupoSeguridad__Group_4__0__Impl rule__GrupoSeguridad__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_4__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_4__0__Impl"
    // InternalCeffective.g:7210:1: rule__GrupoSeguridad__Group_4__0__Impl : ( 'zonaDisponibilidad' ) ;
    public final void rule__GrupoSeguridad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7214:1: ( ( 'zonaDisponibilidad' ) )
            // InternalCeffective.g:7215:1: ( 'zonaDisponibilidad' )
            {
            // InternalCeffective.g:7215:1: ( 'zonaDisponibilidad' )
            // InternalCeffective.g:7216:2: 'zonaDisponibilidad'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_4__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_4__1"
    // InternalCeffective.g:7225:1: rule__GrupoSeguridad__Group_4__1 : rule__GrupoSeguridad__Group_4__1__Impl ;
    public final void rule__GrupoSeguridad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7229:1: ( rule__GrupoSeguridad__Group_4__1__Impl )
            // InternalCeffective.g:7230:2: rule__GrupoSeguridad__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_4__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_4__1__Impl"
    // InternalCeffective.g:7236:1: rule__GrupoSeguridad__Group_4__1__Impl : ( ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7240:1: ( ( ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 ) ) )
            // InternalCeffective.g:7241:1: ( ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 ) )
            {
            // InternalCeffective.g:7241:1: ( ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 ) )
            // InternalCeffective.g:7242:2: ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadAssignment_4_1()); 
            // InternalCeffective.g:7243:2: ( rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 )
            // InternalCeffective.g:7243:3: rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_4__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_5__0"
    // InternalCeffective.g:7252:1: rule__GrupoSeguridad__Group_5__0 : rule__GrupoSeguridad__Group_5__0__Impl rule__GrupoSeguridad__Group_5__1 ;
    public final void rule__GrupoSeguridad__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7256:1: ( rule__GrupoSeguridad__Group_5__0__Impl rule__GrupoSeguridad__Group_5__1 )
            // InternalCeffective.g:7257:2: rule__GrupoSeguridad__Group_5__0__Impl rule__GrupoSeguridad__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_5__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_5__0__Impl"
    // InternalCeffective.g:7264:1: rule__GrupoSeguridad__Group_5__0__Impl : ( 'descripcion' ) ;
    public final void rule__GrupoSeguridad__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7268:1: ( ( 'descripcion' ) )
            // InternalCeffective.g:7269:1: ( 'descripcion' )
            {
            // InternalCeffective.g:7269:1: ( 'descripcion' )
            // InternalCeffective.g:7270:2: 'descripcion'
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_5_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_5__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_5__1"
    // InternalCeffective.g:7279:1: rule__GrupoSeguridad__Group_5__1 : rule__GrupoSeguridad__Group_5__1__Impl ;
    public final void rule__GrupoSeguridad__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7283:1: ( rule__GrupoSeguridad__Group_5__1__Impl )
            // InternalCeffective.g:7284:2: rule__GrupoSeguridad__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_5__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_5__1__Impl"
    // InternalCeffective.g:7290:1: rule__GrupoSeguridad__Group_5__1__Impl : ( ( rule__GrupoSeguridad__DescripcionAssignment_5_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7294:1: ( ( ( rule__GrupoSeguridad__DescripcionAssignment_5_1 ) ) )
            // InternalCeffective.g:7295:1: ( ( rule__GrupoSeguridad__DescripcionAssignment_5_1 ) )
            {
            // InternalCeffective.g:7295:1: ( ( rule__GrupoSeguridad__DescripcionAssignment_5_1 ) )
            // InternalCeffective.g:7296:2: ( rule__GrupoSeguridad__DescripcionAssignment_5_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionAssignment_5_1()); 
            // InternalCeffective.g:7297:2: ( rule__GrupoSeguridad__DescripcionAssignment_5_1 )
            // InternalCeffective.g:7297:3: rule__GrupoSeguridad__DescripcionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__DescripcionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_5__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_9__0"
    // InternalCeffective.g:7306:1: rule__GrupoSeguridad__Group_9__0 : rule__GrupoSeguridad__Group_9__0__Impl rule__GrupoSeguridad__Group_9__1 ;
    public final void rule__GrupoSeguridad__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7310:1: ( rule__GrupoSeguridad__Group_9__0__Impl rule__GrupoSeguridad__Group_9__1 )
            // InternalCeffective.g:7311:2: rule__GrupoSeguridad__Group_9__0__Impl rule__GrupoSeguridad__Group_9__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_9__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_9__0__Impl"
    // InternalCeffective.g:7318:1: rule__GrupoSeguridad__Group_9__0__Impl : ( ',' ) ;
    public final void rule__GrupoSeguridad__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7322:1: ( ( ',' ) )
            // InternalCeffective.g:7323:1: ( ',' )
            {
            // InternalCeffective.g:7323:1: ( ',' )
            // InternalCeffective.g:7324:2: ','
            {
             before(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_9__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_9__1"
    // InternalCeffective.g:7333:1: rule__GrupoSeguridad__Group_9__1 : rule__GrupoSeguridad__Group_9__1__Impl ;
    public final void rule__GrupoSeguridad__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7337:1: ( rule__GrupoSeguridad__Group_9__1__Impl )
            // InternalCeffective.g:7338:2: rule__GrupoSeguridad__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_9__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_9__1__Impl"
    // InternalCeffective.g:7344:1: rule__GrupoSeguridad__Group_9__1__Impl : ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_9_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7348:1: ( ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_9_1 ) ) )
            // InternalCeffective.g:7349:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_9_1 ) )
            {
            // InternalCeffective.g:7349:1: ( ( rule__GrupoSeguridad__ReglasSalidaAssignment_9_1 ) )
            // InternalCeffective.g:7350:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_9_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_9_1()); 
            // InternalCeffective.g:7351:2: ( rule__GrupoSeguridad__ReglasSalidaAssignment_9_1 )
            // InternalCeffective.g:7351:3: rule__GrupoSeguridad__ReglasSalidaAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasSalidaAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_9__1__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_14__0"
    // InternalCeffective.g:7360:1: rule__GrupoSeguridad__Group_14__0 : rule__GrupoSeguridad__Group_14__0__Impl rule__GrupoSeguridad__Group_14__1 ;
    public final void rule__GrupoSeguridad__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7364:1: ( rule__GrupoSeguridad__Group_14__0__Impl rule__GrupoSeguridad__Group_14__1 )
            // InternalCeffective.g:7365:2: rule__GrupoSeguridad__Group_14__0__Impl rule__GrupoSeguridad__Group_14__1
            {
            pushFollow(FOLLOW_12);
            rule__GrupoSeguridad__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_14__0"


    // $ANTLR start "rule__GrupoSeguridad__Group_14__0__Impl"
    // InternalCeffective.g:7372:1: rule__GrupoSeguridad__Group_14__0__Impl : ( ',' ) ;
    public final void rule__GrupoSeguridad__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7376:1: ( ( ',' ) )
            // InternalCeffective.g:7377:1: ( ',' )
            {
            // InternalCeffective.g:7377:1: ( ',' )
            // InternalCeffective.g:7378:2: ','
            {
             before(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_14_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGrupoSeguridadAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_14__0__Impl"


    // $ANTLR start "rule__GrupoSeguridad__Group_14__1"
    // InternalCeffective.g:7387:1: rule__GrupoSeguridad__Group_14__1 : rule__GrupoSeguridad__Group_14__1__Impl ;
    public final void rule__GrupoSeguridad__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7391:1: ( rule__GrupoSeguridad__Group_14__1__Impl )
            // InternalCeffective.g:7392:2: rule__GrupoSeguridad__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_14__1"


    // $ANTLR start "rule__GrupoSeguridad__Group_14__1__Impl"
    // InternalCeffective.g:7398:1: rule__GrupoSeguridad__Group_14__1__Impl : ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_14_1 ) ) ;
    public final void rule__GrupoSeguridad__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7402:1: ( ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_14_1 ) ) )
            // InternalCeffective.g:7403:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_14_1 ) )
            {
            // InternalCeffective.g:7403:1: ( ( rule__GrupoSeguridad__ReglasEntradaAssignment_14_1 ) )
            // InternalCeffective.g:7404:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_14_1 )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_14_1()); 
            // InternalCeffective.g:7405:2: ( rule__GrupoSeguridad__ReglasEntradaAssignment_14_1 )
            // InternalCeffective.g:7405:3: rule__GrupoSeguridad__ReglasEntradaAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__GrupoSeguridad__ReglasEntradaAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__Group_14__1__Impl"


    // $ANTLR start "rule__Ceffective__ProveedorNubeAssignment_3_1"
    // InternalCeffective.g:7414:1: rule__Ceffective__ProveedorNubeAssignment_3_1 : ( ruleProveedorNube ) ;
    public final void rule__Ceffective__ProveedorNubeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7418:1: ( ( ruleProveedorNube ) )
            // InternalCeffective.g:7419:2: ( ruleProveedorNube )
            {
            // InternalCeffective.g:7419:2: ( ruleProveedorNube )
            // InternalCeffective.g:7420:3: ruleProveedorNube
            {
             before(grammarAccess.getCeffectiveAccess().getProveedorNubeProveedorNubeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProveedorNube();

            state._fsp--;

             after(grammarAccess.getCeffectiveAccess().getProveedorNubeProveedorNubeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ceffective__ProveedorNubeAssignment_3_1"


    // $ANTLR start "rule__ProveedorNube__NombreAssignment_2_1"
    // InternalCeffective.g:7429:1: rule__ProveedorNube__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ProveedorNube__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7433:1: ( ( ruleEString ) )
            // InternalCeffective.g:7434:2: ( ruleEString )
            {
            // InternalCeffective.g:7434:2: ( ruleEString )
            // InternalCeffective.g:7435:3: ruleEString
            {
             before(grammarAccess.getProveedorNubeAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__NombreAssignment_2_1"


    // $ANTLR start "rule__ProveedorNube__AmbientedespliegueAssignment_3_2"
    // InternalCeffective.g:7444:1: rule__ProveedorNube__AmbientedespliegueAssignment_3_2 : ( ( ruleEString ) ) ;
    public final void rule__ProveedorNube__AmbientedespliegueAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7448:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7449:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7449:2: ( ( ruleEString ) )
            // InternalCeffective.g:7450:3: ( ruleEString )
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueCrossReference_3_2_0()); 
            // InternalCeffective.g:7451:3: ( ruleEString )
            // InternalCeffective.g:7452:4: ruleEString
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueEStringParserRuleCall_3_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueEStringParserRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__AmbientedespliegueAssignment_3_2"


    // $ANTLR start "rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1"
    // InternalCeffective.g:7463:1: rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7467:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7468:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7468:2: ( ( ruleEString ) )
            // InternalCeffective.g:7469:3: ( ruleEString )
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueCrossReference_3_3_1_0()); 
            // InternalCeffective.g:7470:3: ( ruleEString )
            // InternalCeffective.g:7471:4: ruleEString
            {
             before(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueEStringParserRuleCall_3_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueEStringParserRuleCall_3_3_1_0_1()); 

            }

             after(grammarAccess.getProveedorNubeAccess().getAmbientedespliegueAmbienteDespliegueCrossReference_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__AmbientedespliegueAssignment_3_3_1"


    // $ANTLR start "rule__ProveedorNube__VpcAssignment_4_2"
    // InternalCeffective.g:7482:1: rule__ProveedorNube__VpcAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__ProveedorNube__VpcAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7486:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7487:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7487:2: ( ( ruleEString ) )
            // InternalCeffective.g:7488:3: ( ruleEString )
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_4_2_0()); 
            // InternalCeffective.g:7489:3: ( ruleEString )
            // InternalCeffective.g:7490:4: ruleEString
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcVPCEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getVpcVPCEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__VpcAssignment_4_2"


    // $ANTLR start "rule__ProveedorNube__VpcAssignment_4_3_1"
    // InternalCeffective.g:7501:1: rule__ProveedorNube__VpcAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ProveedorNube__VpcAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7505:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7506:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7506:2: ( ( ruleEString ) )
            // InternalCeffective.g:7507:3: ( ruleEString )
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_4_3_1_0()); 
            // InternalCeffective.g:7508:3: ( ruleEString )
            // InternalCeffective.g:7509:4: ruleEString
            {
             before(grammarAccess.getProveedorNubeAccess().getVpcVPCEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getVpcVPCEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getProveedorNubeAccess().getVpcVPCCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__VpcAssignment_4_3_1"


    // $ANTLR start "rule__ProveedorNube__AutenticacionUsuarioAssignment_7"
    // InternalCeffective.g:7520:1: rule__ProveedorNube__AutenticacionUsuarioAssignment_7 : ( ruleAutenticacionUsuario ) ;
    public final void rule__ProveedorNube__AutenticacionUsuarioAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7524:1: ( ( ruleAutenticacionUsuario ) )
            // InternalCeffective.g:7525:2: ( ruleAutenticacionUsuario )
            {
            // InternalCeffective.g:7525:2: ( ruleAutenticacionUsuario )
            // InternalCeffective.g:7526:3: ruleAutenticacionUsuario
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAutenticacionUsuario();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__AutenticacionUsuarioAssignment_7"


    // $ANTLR start "rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1"
    // InternalCeffective.g:7535:1: rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1 : ( ruleAutenticacionUsuario ) ;
    public final void rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7539:1: ( ( ruleAutenticacionUsuario ) )
            // InternalCeffective.g:7540:2: ( ruleAutenticacionUsuario )
            {
            // InternalCeffective.g:7540:2: ( ruleAutenticacionUsuario )
            // InternalCeffective.g:7541:3: ruleAutenticacionUsuario
            {
             before(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAutenticacionUsuario();

            state._fsp--;

             after(grammarAccess.getProveedorNubeAccess().getAutenticacionUsuarioAutenticacionUsuarioParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProveedorNube__AutenticacionUsuarioAssignment_8_1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1"
    // InternalCeffective.g:7550:1: rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7554:1: ( ( ruleEString ) )
            // InternalCeffective.g:7555:2: ( ruleEString )
            {
            // InternalCeffective.g:7555:2: ( ruleEString )
            // InternalCeffective.g:7556:3: ruleEString
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getUsuarioEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__UsuarioAssignment_3_1"


    // $ANTLR start "rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1"
    // InternalCeffective.g:7565:1: rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7569:1: ( ( ruleEString ) )
            // InternalCeffective.g:7570:2: ( ruleEString )
            {
            // InternalCeffective.g:7570:2: ( ruleEString )
            // InternalCeffective.g:7571:3: ruleEString
            {
             before(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionUsuario_ImplAccess().getCorreoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionUsuario_Impl__CorreoAssignment_4_1"


    // $ANTLR start "rule__ServidorAplicaciones__NombreAssignment_3_1"
    // InternalCeffective.g:7580:1: rule__ServidorAplicaciones__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7584:1: ( ( ruleEString ) )
            // InternalCeffective.g:7585:2: ( ruleEString )
            {
            // InternalCeffective.g:7585:2: ( ruleEString )
            // InternalCeffective.g:7586:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__NombreAssignment_3_1"


    // $ANTLR start "rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:7595:1: rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7599:1: ( ( ruleEString ) )
            // InternalCeffective.g:7600:2: ( ruleEString )
            {
            // InternalCeffective.g:7600:2: ( ruleEString )
            // InternalCeffective.g:7601:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__ServidorAplicaciones__ZonaNombreAssignment_5_1"
    // InternalCeffective.g:7610:1: rule__ServidorAplicaciones__ZonaNombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__ZonaNombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7614:1: ( ( ruleEString ) )
            // InternalCeffective.g:7615:2: ( ruleEString )
            {
            // InternalCeffective.g:7615:2: ( ruleEString )
            // InternalCeffective.g:7616:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__ZonaNombreAssignment_5_1"


    // $ANTLR start "rule__ServidorAplicaciones__TamanoAssignment_6_1"
    // InternalCeffective.g:7625:1: rule__ServidorAplicaciones__TamanoAssignment_6_1 : ( ruleTamanoServidor ) ;
    public final void rule__ServidorAplicaciones__TamanoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7629:1: ( ( ruleTamanoServidor ) )
            // InternalCeffective.g:7630:2: ( ruleTamanoServidor )
            {
            // InternalCeffective.g:7630:2: ( ruleTamanoServidor )
            // InternalCeffective.g:7631:3: ruleTamanoServidor
            {
             before(grammarAccess.getServidorAplicacionesAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoServidor();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__TamanoAssignment_6_1"


    // $ANTLR start "rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1"
    // InternalCeffective.g:7640:1: rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1 : ( ruleEString ) ;
    public final void rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7644:1: ( ( ruleEString ) )
            // InternalCeffective.g:7645:2: ( ruleEString )
            {
            // InternalCeffective.g:7645:2: ( ruleEString )
            // InternalCeffective.g:7646:3: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getSistemaOperativoEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__SistemaOperativoAssignment_7_1"


    // $ANTLR start "rule__ServidorAplicaciones__RecursosAssignment_8_2"
    // InternalCeffective.g:7655:1: rule__ServidorAplicaciones__RecursosAssignment_8_2 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__RecursosAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7659:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7660:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7660:2: ( ( ruleEString ) )
            // InternalCeffective.g:7661:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_2_0()); 
            // InternalCeffective.g:7662:3: ( ruleEString )
            // InternalCeffective.g:7663:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoEStringParserRuleCall_8_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoEStringParserRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__RecursosAssignment_8_2"


    // $ANTLR start "rule__ServidorAplicaciones__RecursosAssignment_8_3_1"
    // InternalCeffective.g:7674:1: rule__ServidorAplicaciones__RecursosAssignment_8_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__RecursosAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7678:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7679:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7679:2: ( ( ruleEString ) )
            // InternalCeffective.g:7680:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_3_1_0()); 
            // InternalCeffective.g:7681:3: ( ruleEString )
            // InternalCeffective.g:7682:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoEStringParserRuleCall_8_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoEStringParserRuleCall_8_3_1_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getRecursosRecursoCrossReference_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__RecursosAssignment_8_3_1"


    // $ANTLR start "rule__ServidorAplicaciones__VpcAssignment_9_1"
    // InternalCeffective.g:7693:1: rule__ServidorAplicaciones__VpcAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorAplicaciones__VpcAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7697:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7698:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7698:2: ( ( ruleEString ) )
            // InternalCeffective.g:7699:3: ( ruleEString )
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_9_1_0()); 
            // InternalCeffective.g:7700:3: ( ruleEString )
            // InternalCeffective.g:7701:4: ruleEString
            {
             before(grammarAccess.getServidorAplicacionesAccess().getVpcVPCEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorAplicacionesAccess().getVpcVPCEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getServidorAplicacionesAccess().getVpcVPCCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorAplicaciones__VpcAssignment_9_1"


    // $ANTLR start "rule__Almacenamiento__NombreAssignment_3_1"
    // InternalCeffective.g:7712:1: rule__Almacenamiento__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Almacenamiento__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7716:1: ( ( ruleEString ) )
            // InternalCeffective.g:7717:2: ( ruleEString )
            {
            // InternalCeffective.g:7717:2: ( ruleEString )
            // InternalCeffective.g:7718:3: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__NombreAssignment_3_1"


    // $ANTLR start "rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:7727:1: rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7731:1: ( ( ruleEString ) )
            // InternalCeffective.g:7732:2: ( ruleEString )
            {
            // InternalCeffective.g:7732:2: ( ruleEString )
            // InternalCeffective.g:7733:3: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__Almacenamiento__ZonaNombreAssignment_5_1"
    // InternalCeffective.g:7742:1: rule__Almacenamiento__ZonaNombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Almacenamiento__ZonaNombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7746:1: ( ( ruleEString ) )
            // InternalCeffective.g:7747:2: ( ruleEString )
            {
            // InternalCeffective.g:7747:2: ( ruleEString )
            // InternalCeffective.g:7748:3: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__ZonaNombreAssignment_5_1"


    // $ANTLR start "rule__Almacenamiento__TamanoInicialAssignment_6_1"
    // InternalCeffective.g:7757:1: rule__Almacenamiento__TamanoInicialAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__Almacenamiento__TamanoInicialAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7761:1: ( ( ruleEInt ) )
            // InternalCeffective.g:7762:2: ( ruleEInt )
            {
            // InternalCeffective.g:7762:2: ( ruleEInt )
            // InternalCeffective.g:7763:3: ruleEInt
            {
             before(grammarAccess.getAlmacenamientoAccess().getTamanoInicialEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getTamanoInicialEIntParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__TamanoInicialAssignment_6_1"


    // $ANTLR start "rule__Almacenamiento__RecursosAssignment_7_2"
    // InternalCeffective.g:7772:1: rule__Almacenamiento__RecursosAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Almacenamiento__RecursosAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7776:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7777:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7777:2: ( ( ruleEString ) )
            // InternalCeffective.g:7778:3: ( ruleEString )
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_2_0()); 
            // InternalCeffective.g:7779:3: ( ruleEString )
            // InternalCeffective.g:7780:4: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__RecursosAssignment_7_2"


    // $ANTLR start "rule__Almacenamiento__RecursosAssignment_7_3_1"
    // InternalCeffective.g:7791:1: rule__Almacenamiento__RecursosAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Almacenamiento__RecursosAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7795:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7796:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7796:2: ( ( ruleEString ) )
            // InternalCeffective.g:7797:3: ( ruleEString )
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_3_1_0()); 
            // InternalCeffective.g:7798:3: ( ruleEString )
            // InternalCeffective.g:7799:4: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getAlmacenamientoAccess().getRecursosRecursoCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__RecursosAssignment_7_3_1"


    // $ANTLR start "rule__Almacenamiento__VpcAssignment_8_1"
    // InternalCeffective.g:7810:1: rule__Almacenamiento__VpcAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Almacenamiento__VpcAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7814:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7815:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7815:2: ( ( ruleEString ) )
            // InternalCeffective.g:7816:3: ( ruleEString )
            {
             before(grammarAccess.getAlmacenamientoAccess().getVpcVPCCrossReference_8_1_0()); 
            // InternalCeffective.g:7817:3: ( ruleEString )
            // InternalCeffective.g:7818:4: ruleEString
            {
             before(grammarAccess.getAlmacenamientoAccess().getVpcVPCEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlmacenamientoAccess().getVpcVPCEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getAlmacenamientoAccess().getVpcVPCCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Almacenamiento__VpcAssignment_8_1"


    // $ANTLR start "rule__ServidorBD__NombreAssignment_3_1"
    // InternalCeffective.g:7829:1: rule__ServidorBD__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ServidorBD__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7833:1: ( ( ruleEString ) )
            // InternalCeffective.g:7834:2: ( ruleEString )
            {
            // InternalCeffective.g:7834:2: ( ruleEString )
            // InternalCeffective.g:7835:3: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__NombreAssignment_3_1"


    // $ANTLR start "rule__ServidorBD__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:7844:1: rule__ServidorBD__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ServidorBD__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7848:1: ( ( ruleEString ) )
            // InternalCeffective.g:7849:2: ( ruleEString )
            {
            // InternalCeffective.g:7849:2: ( ruleEString )
            // InternalCeffective.g:7850:3: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__ServidorBD__ZonaNombreAssignment_5_1"
    // InternalCeffective.g:7859:1: rule__ServidorBD__ZonaNombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__ServidorBD__ZonaNombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7863:1: ( ( ruleEString ) )
            // InternalCeffective.g:7864:2: ( ruleEString )
            {
            // InternalCeffective.g:7864:2: ( ruleEString )
            // InternalCeffective.g:7865:3: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__ZonaNombreAssignment_5_1"


    // $ANTLR start "rule__ServidorBD__TamanoAssignment_6_1"
    // InternalCeffective.g:7874:1: rule__ServidorBD__TamanoAssignment_6_1 : ( ruleTamanoServidor ) ;
    public final void rule__ServidorBD__TamanoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7878:1: ( ( ruleTamanoServidor ) )
            // InternalCeffective.g:7879:2: ( ruleTamanoServidor )
            {
            // InternalCeffective.g:7879:2: ( ruleTamanoServidor )
            // InternalCeffective.g:7880:3: ruleTamanoServidor
            {
             before(grammarAccess.getServidorBDAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoServidor();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__TamanoAssignment_6_1"


    // $ANTLR start "rule__ServidorBD__TipoAssignment_7_1"
    // InternalCeffective.g:7889:1: rule__ServidorBD__TipoAssignment_7_1 : ( ruleTipoBaseDatos ) ;
    public final void rule__ServidorBD__TipoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7893:1: ( ( ruleTipoBaseDatos ) )
            // InternalCeffective.g:7894:2: ( ruleTipoBaseDatos )
            {
            // InternalCeffective.g:7894:2: ( ruleTipoBaseDatos )
            // InternalCeffective.g:7895:3: ruleTipoBaseDatos
            {
             before(grammarAccess.getServidorBDAccess().getTipoTipoBaseDatosEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoBaseDatos();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getTipoTipoBaseDatosEnumRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__TipoAssignment_7_1"


    // $ANTLR start "rule__ServidorBD__SistemaManejadorAssignment_8_1"
    // InternalCeffective.g:7904:1: rule__ServidorBD__SistemaManejadorAssignment_8_1 : ( ruleEString ) ;
    public final void rule__ServidorBD__SistemaManejadorAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7908:1: ( ( ruleEString ) )
            // InternalCeffective.g:7909:2: ( ruleEString )
            {
            // InternalCeffective.g:7909:2: ( ruleEString )
            // InternalCeffective.g:7910:3: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getSistemaManejadorEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getSistemaManejadorEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__SistemaManejadorAssignment_8_1"


    // $ANTLR start "rule__ServidorBD__RecursosAssignment_9_2"
    // InternalCeffective.g:7919:1: rule__ServidorBD__RecursosAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBD__RecursosAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7923:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7924:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7924:2: ( ( ruleEString ) )
            // InternalCeffective.g:7925:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_2_0()); 
            // InternalCeffective.g:7926:3: ( ruleEString )
            // InternalCeffective.g:7927:4: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getRecursosRecursoEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getRecursosRecursoEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__RecursosAssignment_9_2"


    // $ANTLR start "rule__ServidorBD__RecursosAssignment_9_3_1"
    // InternalCeffective.g:7938:1: rule__ServidorBD__RecursosAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBD__RecursosAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7942:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7943:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7943:2: ( ( ruleEString ) )
            // InternalCeffective.g:7944:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_3_1_0()); 
            // InternalCeffective.g:7945:3: ( ruleEString )
            // InternalCeffective.g:7946:4: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getRecursosRecursoEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getRecursosRecursoEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getServidorBDAccess().getRecursosRecursoCrossReference_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__RecursosAssignment_9_3_1"


    // $ANTLR start "rule__ServidorBD__VpcAssignment_10_1"
    // InternalCeffective.g:7957:1: rule__ServidorBD__VpcAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__ServidorBD__VpcAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7961:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:7962:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:7962:2: ( ( ruleEString ) )
            // InternalCeffective.g:7963:3: ( ruleEString )
            {
             before(grammarAccess.getServidorBDAccess().getVpcVPCCrossReference_10_1_0()); 
            // InternalCeffective.g:7964:3: ( ruleEString )
            // InternalCeffective.g:7965:4: ruleEString
            {
             before(grammarAccess.getServidorBDAccess().getVpcVPCEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidorBDAccess().getVpcVPCEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getServidorBDAccess().getVpcVPCCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServidorBD__VpcAssignment_10_1"


    // $ANTLR start "rule__Servidor_Impl__NombreAssignment_3_1"
    // InternalCeffective.g:7976:1: rule__Servidor_Impl__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Servidor_Impl__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7980:1: ( ( ruleEString ) )
            // InternalCeffective.g:7981:2: ( ruleEString )
            {
            // InternalCeffective.g:7981:2: ( ruleEString )
            // InternalCeffective.g:7982:3: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__NombreAssignment_3_1"


    // $ANTLR start "rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:7991:1: rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:7995:1: ( ( ruleEString ) )
            // InternalCeffective.g:7996:2: ( ruleEString )
            {
            // InternalCeffective.g:7996:2: ( ruleEString )
            // InternalCeffective.g:7997:3: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__Servidor_Impl__ZonaNombreAssignment_5_1"
    // InternalCeffective.g:8006:1: rule__Servidor_Impl__ZonaNombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Servidor_Impl__ZonaNombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8010:1: ( ( ruleEString ) )
            // InternalCeffective.g:8011:2: ( ruleEString )
            {
            // InternalCeffective.g:8011:2: ( ruleEString )
            // InternalCeffective.g:8012:3: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getZonaNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__ZonaNombreAssignment_5_1"


    // $ANTLR start "rule__Servidor_Impl__TamanoAssignment_6_1"
    // InternalCeffective.g:8021:1: rule__Servidor_Impl__TamanoAssignment_6_1 : ( ruleTamanoServidor ) ;
    public final void rule__Servidor_Impl__TamanoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8025:1: ( ( ruleTamanoServidor ) )
            // InternalCeffective.g:8026:2: ( ruleTamanoServidor )
            {
            // InternalCeffective.g:8026:2: ( ruleTamanoServidor )
            // InternalCeffective.g:8027:3: ruleTamanoServidor
            {
             before(grammarAccess.getServidor_ImplAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTamanoServidor();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getTamanoTamanoServidorEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__TamanoAssignment_6_1"


    // $ANTLR start "rule__Servidor_Impl__RecursosAssignment_7_2"
    // InternalCeffective.g:8036:1: rule__Servidor_Impl__RecursosAssignment_7_2 : ( ( ruleEString ) ) ;
    public final void rule__Servidor_Impl__RecursosAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8040:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8041:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8041:2: ( ( ruleEString ) )
            // InternalCeffective.g:8042:3: ( ruleEString )
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_2_0()); 
            // InternalCeffective.g:8043:3: ( ruleEString )
            // InternalCeffective.g:8044:4: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosRecursoEStringParserRuleCall_7_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getRecursosRecursoEStringParserRuleCall_7_2_0_1()); 

            }

             after(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__RecursosAssignment_7_2"


    // $ANTLR start "rule__Servidor_Impl__RecursosAssignment_7_3_1"
    // InternalCeffective.g:8055:1: rule__Servidor_Impl__RecursosAssignment_7_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Servidor_Impl__RecursosAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8059:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8060:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8060:2: ( ( ruleEString ) )
            // InternalCeffective.g:8061:3: ( ruleEString )
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_3_1_0()); 
            // InternalCeffective.g:8062:3: ( ruleEString )
            // InternalCeffective.g:8063:4: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getRecursosRecursoEStringParserRuleCall_7_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getRecursosRecursoEStringParserRuleCall_7_3_1_0_1()); 

            }

             after(grammarAccess.getServidor_ImplAccess().getRecursosRecursoCrossReference_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__RecursosAssignment_7_3_1"


    // $ANTLR start "rule__Servidor_Impl__VpcAssignment_8_1"
    // InternalCeffective.g:8074:1: rule__Servidor_Impl__VpcAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__Servidor_Impl__VpcAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8078:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8079:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8079:2: ( ( ruleEString ) )
            // InternalCeffective.g:8080:3: ( ruleEString )
            {
             before(grammarAccess.getServidor_ImplAccess().getVpcVPCCrossReference_8_1_0()); 
            // InternalCeffective.g:8081:3: ( ruleEString )
            // InternalCeffective.g:8082:4: ruleEString
            {
             before(grammarAccess.getServidor_ImplAccess().getVpcVPCEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServidor_ImplAccess().getVpcVPCEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getServidor_ImplAccess().getVpcVPCCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Servidor_Impl__VpcAssignment_8_1"


    // $ANTLR start "rule__AutenticacionBasica__UsuarioAssignment_3_1"
    // InternalCeffective.g:8093:1: rule__AutenticacionBasica__UsuarioAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AutenticacionBasica__UsuarioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8097:1: ( ( ruleEString ) )
            // InternalCeffective.g:8098:2: ( ruleEString )
            {
            // InternalCeffective.g:8098:2: ( ruleEString )
            // InternalCeffective.g:8099:3: ruleEString
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getUsuarioEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionBasicaAccess().getUsuarioEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__UsuarioAssignment_3_1"


    // $ANTLR start "rule__AutenticacionBasica__CorreoAssignment_4_1"
    // InternalCeffective.g:8108:1: rule__AutenticacionBasica__CorreoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__AutenticacionBasica__CorreoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8112:1: ( ( ruleEString ) )
            // InternalCeffective.g:8113:2: ( ruleEString )
            {
            // InternalCeffective.g:8113:2: ( ruleEString )
            // InternalCeffective.g:8114:3: ruleEString
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getCorreoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionBasicaAccess().getCorreoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__CorreoAssignment_4_1"


    // $ANTLR start "rule__AutenticacionBasica__PasswordAssignment_5_1"
    // InternalCeffective.g:8123:1: rule__AutenticacionBasica__PasswordAssignment_5_1 : ( ruleEString ) ;
    public final void rule__AutenticacionBasica__PasswordAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8127:1: ( ( ruleEString ) )
            // InternalCeffective.g:8128:2: ( ruleEString )
            {
            // InternalCeffective.g:8128:2: ( ruleEString )
            // InternalCeffective.g:8129:3: ruleEString
            {
             before(grammarAccess.getAutenticacionBasicaAccess().getPasswordEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionBasicaAccess().getPasswordEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionBasica__PasswordAssignment_5_1"


    // $ANTLR start "rule__AutenticacionFirma__UsuarioAssignment_3_1"
    // InternalCeffective.g:8138:1: rule__AutenticacionFirma__UsuarioAssignment_3_1 : ( ruleEString ) ;
    public final void rule__AutenticacionFirma__UsuarioAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8142:1: ( ( ruleEString ) )
            // InternalCeffective.g:8143:2: ( ruleEString )
            {
            // InternalCeffective.g:8143:2: ( ruleEString )
            // InternalCeffective.g:8144:3: ruleEString
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getUsuarioEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaAccess().getUsuarioEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__UsuarioAssignment_3_1"


    // $ANTLR start "rule__AutenticacionFirma__CorreoAssignment_4_1"
    // InternalCeffective.g:8153:1: rule__AutenticacionFirma__CorreoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__AutenticacionFirma__CorreoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8157:1: ( ( ruleEString ) )
            // InternalCeffective.g:8158:2: ( ruleEString )
            {
            // InternalCeffective.g:8158:2: ( ruleEString )
            // InternalCeffective.g:8159:3: ruleEString
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCorreoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaAccess().getCorreoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__CorreoAssignment_4_1"


    // $ANTLR start "rule__AutenticacionFirma__NombreAssignment_5_1"
    // InternalCeffective.g:8168:1: rule__AutenticacionFirma__NombreAssignment_5_1 : ( ruleEString ) ;
    public final void rule__AutenticacionFirma__NombreAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8172:1: ( ( ruleEString ) )
            // InternalCeffective.g:8173:2: ( ruleEString )
            {
            // InternalCeffective.g:8173:2: ( ruleEString )
            // InternalCeffective.g:8174:3: ruleEString
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getNombreEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaAccess().getNombreEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__NombreAssignment_5_1"


    // $ANTLR start "rule__AutenticacionFirma__CertificadoAssignment_6_1"
    // InternalCeffective.g:8183:1: rule__AutenticacionFirma__CertificadoAssignment_6_1 : ( ruleEString ) ;
    public final void rule__AutenticacionFirma__CertificadoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8187:1: ( ( ruleEString ) )
            // InternalCeffective.g:8188:2: ( ruleEString )
            {
            // InternalCeffective.g:8188:2: ( ruleEString )
            // InternalCeffective.g:8189:3: ruleEString
            {
             before(grammarAccess.getAutenticacionFirmaAccess().getCertificadoEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAutenticacionFirmaAccess().getCertificadoEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AutenticacionFirma__CertificadoAssignment_6_1"


    // $ANTLR start "rule__Subred__NombreAssignment_3_1"
    // InternalCeffective.g:8198:1: rule__Subred__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Subred__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8202:1: ( ( ruleEString ) )
            // InternalCeffective.g:8203:2: ( ruleEString )
            {
            // InternalCeffective.g:8203:2: ( ruleEString )
            // InternalCeffective.g:8204:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__NombreAssignment_3_1"


    // $ANTLR start "rule__Subred__ZonaNombreAssignment_4_1"
    // InternalCeffective.g:8213:1: rule__Subred__ZonaNombreAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Subred__ZonaNombreAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8217:1: ( ( ruleEString ) )
            // InternalCeffective.g:8218:2: ( ruleEString )
            {
            // InternalCeffective.g:8218:2: ( ruleEString )
            // InternalCeffective.g:8219:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getZonaNombreEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getZonaNombreEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__ZonaNombreAssignment_4_1"


    // $ANTLR start "rule__Subred__ZonaDisponibilidadAssignment_5_1"
    // InternalCeffective.g:8228:1: rule__Subred__ZonaDisponibilidadAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Subred__ZonaDisponibilidadAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8232:1: ( ( ruleEString ) )
            // InternalCeffective.g:8233:2: ( ruleEString )
            {
            // InternalCeffective.g:8233:2: ( ruleEString )
            // InternalCeffective.g:8234:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__ZonaDisponibilidadAssignment_5_1"


    // $ANTLR start "rule__Subred__CidrBlockAssignment_6_1"
    // InternalCeffective.g:8243:1: rule__Subred__CidrBlockAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Subred__CidrBlockAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8247:1: ( ( ruleEString ) )
            // InternalCeffective.g:8248:2: ( ruleEString )
            {
            // InternalCeffective.g:8248:2: ( ruleEString )
            // InternalCeffective.g:8249:3: ruleEString
            {
             before(grammarAccess.getSubredAccess().getCidrBlockEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubredAccess().getCidrBlockEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subred__CidrBlockAssignment_6_1"


    // $ANTLR start "rule__InternetGateway__NombreAssignment_3_1"
    // InternalCeffective.g:8258:1: rule__InternetGateway__NombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__InternetGateway__NombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8262:1: ( ( ruleEString ) )
            // InternalCeffective.g:8263:2: ( ruleEString )
            {
            // InternalCeffective.g:8263:2: ( ruleEString )
            // InternalCeffective.g:8264:3: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__NombreAssignment_3_1"


    // $ANTLR start "rule__InternetGateway__ZonaNombreAssignment_4_1"
    // InternalCeffective.g:8273:1: rule__InternetGateway__ZonaNombreAssignment_4_1 : ( ruleEString ) ;
    public final void rule__InternetGateway__ZonaNombreAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8277:1: ( ( ruleEString ) )
            // InternalCeffective.g:8278:2: ( ruleEString )
            {
            // InternalCeffective.g:8278:2: ( ruleEString )
            // InternalCeffective.g:8279:3: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaNombreEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getZonaNombreEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__ZonaNombreAssignment_4_1"


    // $ANTLR start "rule__InternetGateway__ZonaDisponibilidadAssignment_5_1"
    // InternalCeffective.g:8288:1: rule__InternetGateway__ZonaDisponibilidadAssignment_5_1 : ( ruleEString ) ;
    public final void rule__InternetGateway__ZonaDisponibilidadAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8292:1: ( ( ruleEString ) )
            // InternalCeffective.g:8293:2: ( ruleEString )
            {
            // InternalCeffective.g:8293:2: ( ruleEString )
            // InternalCeffective.g:8294:3: ruleEString
            {
             before(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getInternetGatewayAccess().getZonaDisponibilidadEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InternetGateway__ZonaDisponibilidadAssignment_5_1"


    // $ANTLR start "rule__GrupoSeguridad__NombreAssignment_2_1"
    // InternalCeffective.g:8303:1: rule__GrupoSeguridad__NombreAssignment_2_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__NombreAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8307:1: ( ( ruleEString ) )
            // InternalCeffective.g:8308:2: ( ruleEString )
            {
            // InternalCeffective.g:8308:2: ( ruleEString )
            // InternalCeffective.g:8309:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getNombreEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__NombreAssignment_2_1"


    // $ANTLR start "rule__GrupoSeguridad__ZonaNombreAssignment_3_1"
    // InternalCeffective.g:8318:1: rule__GrupoSeguridad__ZonaNombreAssignment_3_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__ZonaNombreAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8322:1: ( ( ruleEString ) )
            // InternalCeffective.g:8323:2: ( ruleEString )
            {
            // InternalCeffective.g:8323:2: ( ruleEString )
            // InternalCeffective.g:8324:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaNombreEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getZonaNombreEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ZonaNombreAssignment_3_1"


    // $ANTLR start "rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1"
    // InternalCeffective.g:8333:1: rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8337:1: ( ( ruleEString ) )
            // InternalCeffective.g:8338:2: ( ruleEString )
            {
            // InternalCeffective.g:8338:2: ( ruleEString )
            // InternalCeffective.g:8339:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getZonaDisponibilidadEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ZonaDisponibilidadAssignment_4_1"


    // $ANTLR start "rule__GrupoSeguridad__DescripcionAssignment_5_1"
    // InternalCeffective.g:8348:1: rule__GrupoSeguridad__DescripcionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__GrupoSeguridad__DescripcionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8352:1: ( ( ruleEString ) )
            // InternalCeffective.g:8353:2: ( ruleEString )
            {
            // InternalCeffective.g:8353:2: ( ruleEString )
            // InternalCeffective.g:8354:3: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getDescripcionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__DescripcionAssignment_5_1"


    // $ANTLR start "rule__GrupoSeguridad__ReglasSalidaAssignment_8"
    // InternalCeffective.g:8363:1: rule__GrupoSeguridad__ReglasSalidaAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__ReglasSalidaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8367:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8368:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8368:2: ( ( ruleEString ) )
            // InternalCeffective.g:8369:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_8_0()); 
            // InternalCeffective.g:8370:3: ( ruleEString )
            // InternalCeffective.g:8371:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasSalidaAssignment_8"


    // $ANTLR start "rule__GrupoSeguridad__ReglasSalidaAssignment_9_1"
    // InternalCeffective.g:8382:1: rule__GrupoSeguridad__ReglasSalidaAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__ReglasSalidaAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8386:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8387:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8387:2: ( ( ruleEString ) )
            // InternalCeffective.g:8388:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_9_1_0()); 
            // InternalCeffective.g:8389:3: ( ruleEString )
            // InternalCeffective.g:8390:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasSalidaReglaCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasSalidaAssignment_9_1"


    // $ANTLR start "rule__GrupoSeguridad__ReglasEntradaAssignment_13"
    // InternalCeffective.g:8401:1: rule__GrupoSeguridad__ReglasEntradaAssignment_13 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__ReglasEntradaAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8405:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8406:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8406:2: ( ( ruleEString ) )
            // InternalCeffective.g:8407:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_13_0()); 
            // InternalCeffective.g:8408:3: ( ruleEString )
            // InternalCeffective.g:8409:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaEStringParserRuleCall_13_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaEStringParserRuleCall_13_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasEntradaAssignment_13"


    // $ANTLR start "rule__GrupoSeguridad__ReglasEntradaAssignment_14_1"
    // InternalCeffective.g:8420:1: rule__GrupoSeguridad__ReglasEntradaAssignment_14_1 : ( ( ruleEString ) ) ;
    public final void rule__GrupoSeguridad__ReglasEntradaAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCeffective.g:8424:1: ( ( ( ruleEString ) ) )
            // InternalCeffective.g:8425:2: ( ( ruleEString ) )
            {
            // InternalCeffective.g:8425:2: ( ( ruleEString ) )
            // InternalCeffective.g:8426:3: ( ruleEString )
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_14_1_0()); 
            // InternalCeffective.g:8427:3: ( ruleEString )
            // InternalCeffective.g:8428:4: ruleEString
            {
             before(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaEStringParserRuleCall_14_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaEStringParserRuleCall_14_1_0_1()); 

            }

             after(grammarAccess.getGrupoSeguridadAccess().getReglasEntradaReglaCrossReference_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GrupoSeguridad__ReglasEntradaAssignment_14_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000011C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000A000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000C00800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000003E108800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000A6108800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000062E108800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000002E108800000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000C00800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0010000C08800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0040006008800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000006008800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0A00006008000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});

}