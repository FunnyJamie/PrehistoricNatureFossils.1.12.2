package net.prehistoricnaturefossils.triggers;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModTriggers

{

    public static final CustomTrigger AEGER_COMPLETE = new CustomTrigger("adv_aeger");
    public static final CustomTrigger CIURCOPTERUS_COMPLETE = new CustomTrigger("adv_ciurcopterus");
    public static final CustomTrigger HADRANAX_COMPLETE = new CustomTrigger("adv_hadranax");
    public static final CustomTrigger CAPINATATOR_COMPLETE = new CustomTrigger("adv_capinatator");
    public static final CustomTrigger ERYMA_COMPLETE = new CustomTrigger("adv_eryma");
    public static final CustomTrigger MECOCHIRUS_COMPLETE = new CustomTrigger("adv_mecochirus");
    public static final CustomTrigger CYCLOMEDUSA_COMPLETE = new CustomTrigger("adv_cyclomedusa");
    public static final CustomTrigger ROTACIURCA_COMPLETE = new CustomTrigger("adv_rotaciurca");
    public static final CustomTrigger WAPTIA_COMPLETE = new CustomTrigger("adv_waptia");
    public static final CustomTrigger ISOXYS_COMPLETE = new CustomTrigger("adv_isoxys");
    public static final CustomTrigger ZENASPIS_COMPLETE = new CustomTrigger("adv_zenaspis");
    public static final CustomTrigger SCLERODUS_COMPLETE = new CustomTrigger("adv_sclerodus");
    public static final CustomTrigger SLIMONIA_COMPLETE = new CustomTrigger("adv_slimonia");
    public static final CustomTrigger SCAUMENACIA_COMPLETE = new CustomTrigger("adv_scaumenacia");
    public static final CustomTrigger DREPANASPIS_COMPLETE = new CustomTrigger("adv_drepanaspis");
    public static final CustomTrigger LONGISQUAMA_COMPLETE = new CustomTrigger("adv_longisquama");
    public static final CustomTrigger COOPEROCERAS_COMPLETE = new CustomTrigger("adv_cooperoceras");
    public static final CustomTrigger VESTINAUTILUS_COMPLETE = new CustomTrigger("adv_vestinautilus");
    public static final CustomTrigger PALAEONISCUM_COMPLETE = new CustomTrigger("adv_palaeoniscum");
    public static final CustomTrigger PARANAICHTHYS_COMPLETE = new CustomTrigger("adv_paranaichthys");
    public static final CustomTrigger ALLENYPTERUS_COMPLETE = new CustomTrigger("adv_allenypterus");
    public static final CustomTrigger HADRONECTOR_COMPLETE = new CustomTrigger("adv_hadronector");
    public static final CustomTrigger FLAGELLOPANTOPUS_COMPLETE = new CustomTrigger("adv_flagellopantopus");
    public static final CustomTrigger PRAEARCTURUS_COMPLETE = new CustomTrigger("adv_praearcturus");
    public static final CustomTrigger ECHINOCHIMAERA_COMPLETE = new CustomTrigger("adv_echinochimaera");
    public static final CustomTrigger SQUATINACTIS_COMPLETE = new CustomTrigger("adv_squatinactis");
    public static final CustomTrigger HELIANTHASTER_COMPLETE = new CustomTrigger("adv_helianthaster");
    public static final CustomTrigger MIMETASTER_COMPLETE = new CustomTrigger("adv_mimetaster");
    public static final CustomTrigger DORYASPIS_COMPLETE = new CustomTrigger("adv_doryaspis");
    public static final CustomTrigger GANTAROSTRATASPIS_COMPLETE = new CustomTrigger("adv_gantarostrataspis");
    public static final CustomTrigger STENSIOELLA_COMPLETE = new CustomTrigger("adv_stensioella");
    public static final CustomTrigger GROENLANDASPIS_COMPLETE = new CustomTrigger("adv_groenlandaspis");
    public static final CustomTrigger MOBULAVERMIS_COMPLETE = new CustomTrigger("adv_mobulavermis");
    public static final CustomTrigger KAYKAY_COMPLETE = new CustomTrigger("adv_kaykay");
    public static final CustomTrigger LEEDSICHTHYS_COMPLETE = new CustomTrigger("adv_leedsichthys");
    public static final CustomTrigger CAIHONG_COMPLETE = new CustomTrigger("adv_caihong");
    public static final CustomTrigger GOSFORDIA_COMPLETE = new CustomTrigger("adv_gosfordia");
    public static final CustomTrigger HYDROPESSUM_COMPLETE = new CustomTrigger("adv_hydropessum");
    public static final CustomTrigger DIPTERONOTUS_COMPLETE = new CustomTrigger("adv_dipteronotus");
    public static final CustomTrigger HARPAGOFUTUTOR_COMPLETE = new CustomTrigger("adv_harpagofututor");
    public static final CustomTrigger MAMULICHTHYS_COMPLETE = new CustomTrigger("adv_mamulichthys");
    public static final CustomTrigger SENEKICHTHYS_COMPLETE = new CustomTrigger("adv_senekichthys");
    public static final CustomTrigger PHYLLOCERAS_COMPLETE = new CustomTrigger("adv_phylloceras");
    public static final CustomTrigger TITANITES_COMPLETE = new CustomTrigger("adv_titanites");
    public static final CustomTrigger CHARNIA_COMPLETE = new CustomTrigger("adv_charnia");
    public static final CustomTrigger BRAZILICHTHYS_COMPLETE = new CustomTrigger("adv_brazilichthys");
    public static final CustomTrigger BETHESDAICHTHYS_COMPLETE = new CustomTrigger("adv_bethesdaichthys");
    public static final CustomTrigger HELIOPELTIS_COMPLETE = new CustomTrigger("adv_heliopeltis");
    public static final CustomTrigger PAREXUS_COMPLETE = new CustomTrigger("adv_parexus");
    public static final CustomTrigger SPRIGGINA_COMPLETE = new CustomTrigger("adv_spriggina");
    public static final CustomTrigger DIPLACANTHUS_COMPLETE = new CustomTrigger("adv_diplacanthus");
    public static final CustomTrigger FURCACAUDA_COMPLETE = new CustomTrigger("adv_furcacauda");
    public static final CustomTrigger DICRANURUS_COMPLETE = new CustomTrigger("adv_dicranurus");
    public static final CustomTrigger DUNYU_COMPLETE = new CustomTrigger("adv_dunyu");
    public static final CustomTrigger GUIYU_COMPLETE = new CustomTrigger("adv_guiyu");
    public static final CustomTrigger OSTEOLEPIS_COMPLETE = new CustomTrigger("adv_osteolepis");
    public static final CustomTrigger DICKINSONIA_COMPLETE = new CustomTrigger("adv_dickinsonia");
    public static final CustomTrigger PLATYCARASPIS_COMPLETE = new CustomTrigger("adv_platycaraspis");
    public static final CustomTrigger THELODUS_COMPLETE = new CustomTrigger("adv_thelodus");
    public static final CustomTrigger WARNETICARIS_COMPLETE = new CustomTrigger("adv_warneticaris");
    public static final CustomTrigger PHANTASPIS_COMPLETE = new CustomTrigger("adv_phantaspis");
    public static final CustomTrigger ARCHAEOPTERYX_COMPLETE = new CustomTrigger("adv_archaeopteryx");
    public static final CustomTrigger KLEPTOTHULE_COMPLETE = new CustomTrigger("adv_kleptothule");
    public static final CustomTrigger PSYCHOPYGE_COMPLETE = new CustomTrigger("adv_psychopyge");
    public static final CustomTrigger ANGUSTIDONTUS_COMPLETE = new CustomTrigger("adv_angustidontus");
    public static final CustomTrigger TYRANNOPHONTES_COMPLETE = new CustomTrigger("adv_tyrannophontes");
    public static final CustomTrigger NEUROPTERA_COMPLETE = new CustomTrigger("adv_neuroptera");
    public static final CustomTrigger ANTEOSAURUS_COMPLETE = new CustomTrigger("adv_anteosaurus");
    public static final CustomTrigger ARIZONASAURUS_COMPLETE = new CustomTrigger("adv_arizonasaurus");
    public static final CustomTrigger ATOPODENTATUS_COMPLETE = new CustomTrigger("adv_atopodentatus");
    public static final CustomTrigger BUNGARTIUS_COMPLETE = new CustomTrigger("adv_bungartius");
    public static final CustomTrigger BUNOSTEGOS_COMPLETE = new CustomTrigger("adv_bunostegos");
    public static final CustomTrigger CAVIRAMUS_COMPLETE = new CustomTrigger("adv_caviramus");
    public static final CustomTrigger COTYLORHYNCHUS_COMPLETE = new CustomTrigger("adv_cotylorhynchus");
    public static final CustomTrigger CRASSIGYRINUS_COMPLETE = new CustomTrigger("adv_crassigyrinus");
    public static final CustomTrigger CYAMODUS_COMPLETE = new CustomTrigger("adv_cyamodus");
    public static final CustomTrigger CYMBOSPONDYLUS_COMPLETE = new CustomTrigger("adv_cymbospondylus");
    public static final CustomTrigger DATHEOSAURUS_COMPLETE = new CustomTrigger("adv_datheosaurus");
    public static final CustomTrigger DESMATOSUCHUS_COMPLETE = new CustomTrigger("adv_desmatosuchus");
    public static final CustomTrigger DIMETRODON_COMPLETE = new CustomTrigger("adv_dimetrodon");
    public static final CustomTrigger DIPLOCAULUS_COMPLETE = new CustomTrigger("adv_diplocaulus");
    public static final CustomTrigger DRYOSAURUS_COMPLETE = new CustomTrigger("adv_dryosaurus");
    public static final CustomTrigger DUNKLEOSTEUS_COMPLETE = new CustomTrigger("adv_dunkleosteus");
    public static final CustomTrigger EDAPHOSAURUS_COMPLETE = new CustomTrigger("adv_edaphosaurus");
    public static final CustomTrigger EFFIGIA_COMPLETE = new CustomTrigger("adv_effigia");
    public static final CustomTrigger EORHYNCHOCHELYS_COMPLETE = new CustomTrigger("adv_eorhynchochelys");
    public static final CustomTrigger ERYOPS_COMPLETE = new CustomTrigger("adv_eryops");
    public static final CustomTrigger ERYTHROSUCHUS_COMPLETE = new CustomTrigger("adv_erythrosuchus");
    public static final CustomTrigger ESTEMMENOSUCHUS_COMPLETE = new CustomTrigger("adv_estemmenosuchus");
    public static final CustomTrigger GERROTHORAX_COMPLETE = new CustomTrigger("adv_gerrothorax");
    public static final CustomTrigger HENODUS_COMPLETE = new CustomTrigger("adv_henodus");
    public static final CustomTrigger INOSTRANCEVIA_COMPLETE = new CustomTrigger("adv_inostrancevia");
    public static final CustomTrigger JONKERIA_COMPLETE = new CustomTrigger("adv_jonkeria");
    public static final CustomTrigger KENTROSAURUS_COMPLETE = new CustomTrigger("adv_kentrosaurus");
    public static final CustomTrigger LESSEMSAURUS_COMPLETE = new CustomTrigger("adv_lessemsaurus");
    public static final CustomTrigger LILIENSTERNUS_COMPLETE = new CustomTrigger("adv_liliensternus");
    public static final CustomTrigger LIMNOSCELIS_COMPLETE = new CustomTrigger("adv_limnoscelis");
    public static final CustomTrigger LISOWICIA_COMPLETE = new CustomTrigger("adv_lisowicia");
    public static final CustomTrigger LOTOSAURUS_COMPLETE = new CustomTrigger("adv_lotosaurus");
    public static final CustomTrigger LYSTROSAURUS_COMPLETE = new CustomTrigger("adv_lystrosaurus");
    public static final CustomTrigger MASTODONSAURUS_COMPLETE = new CustomTrigger("adv_mastodonsaurus");
    public static final CustomTrigger MEGALOCEPHALUS_COMPLETE = new CustomTrigger("adv_megalocephalus");
    public static final CustomTrigger MEGALOSAURUS_COMPLETE = new CustomTrigger("adv_megalosaurus");
    public static final CustomTrigger MOSCHOPS_COMPLETE = new CustomTrigger("adv_moschops");
    public static final CustomTrigger NOTHOSAURUS_COMPLETE = new CustomTrigger("adv_nothosaurus");
    public static final CustomTrigger OPHIACODON_COMPLETE = new CustomTrigger("adv_ophiacodon");
    public static final CustomTrigger OPHTHALMOSAURUS_COMPLETE = new CustomTrigger("adv_ophthalmosaurus");
    public static final CustomTrigger PHOLIDERPETON_COMPLETE = new CustomTrigger("adv_pholiderpeton");
    public static final CustomTrigger PLACODUS_COMPLETE = new CustomTrigger("adv_placodus");
    public static final CustomTrigger PLATYHYSTRIX_COMPLETE = new CustomTrigger("adv_platyhystrix");
    public static final CustomTrigger POPOSAURUS_COMPLETE = new CustomTrigger("adv_poposaurus");
    public static final CustomTrigger POSTOSUCHUS_COMPLETE = new CustomTrigger("adv_postosuchus");
    public static final CustomTrigger PRIONOSUCHUS_COMPLETE = new CustomTrigger("adv_prionosuchus");
    public static final CustomTrigger PROBURNETIA_COMPLETE = new CustomTrigger("adv_proburnetia");
    public static final CustomTrigger RUBIDGEA_COMPLETE = new CustomTrigger("adv_rubidgea");
    public static final CustomTrigger SCUTOSAURUS_COMPLETE = new CustomTrigger("adv_scutosaurus");
    public static final CustomTrigger SHONISAURUS_COMPLETE = new CustomTrigger("adv_shonisaurus");
    public static final CustomTrigger SHRINGASAURUS_COMPLETE = new CustomTrigger("adv_shringasaurus");
    public static final CustomTrigger SILESAURUS_COMPLETE = new CustomTrigger("adv_silesaurus");
    public static final CustomTrigger SMILOSUCHUS_COMPLETE = new CustomTrigger("adv_smilosuchus");
    public static final CustomTrigger SUMINIA_COMPLETE = new CustomTrigger("adv_suminia");
    public static final CustomTrigger TANYSTROPHEUS_COMPLETE = new CustomTrigger("adv_tanystropheus");
    public static final CustomTrigger TETRACERATOPS_COMPLETE = new CustomTrigger("adv_tetraceratops");
    public static final CustomTrigger THECODONTOSAURUS_COMPLETE = new CustomTrigger("adv_thecodontosaurus");
    public static final CustomTrigger TIARAJUDENS_COMPLETE = new CustomTrigger("adv_tiarajudens");
    public static final CustomTrigger TIKTAALIK_COMPLETE = new CustomTrigger("adv_tiktaalik");
    public static final CustomTrigger YINLONG_COMPLETE = new CustomTrigger("adv_yinlong");
    public static final CustomTrigger RHOMALEOSAURUS_COMPLETE = new CustomTrigger("adv_rhomaleosaurus");
    public static final CustomTrigger PROTEROSUCHUS_COMPLETE = new CustomTrigger("adv_proterosuchus");
    public static final CustomTrigger DAKOSAURUS_COMPLETE = new CustomTrigger("adv_dakosaurus");
    public static final CustomTrigger PLACERIAS_COMPLETE = new CustomTrigger("adv_placerias");
    public static final CustomTrigger PLATEOSAURUS_COMPLETE = new CustomTrigger("adv_plateosaurus");
    public static final CustomTrigger COELOPHYSIS_COMPLETE = new CustomTrigger("adv_coelophysis");
    public static final CustomTrigger ICHTHYOSTEGA_COMPLETE = new CustomTrigger("adv_ichthyostega");
    public static final CustomTrigger HERRERASAURUS_COMPLETE = new CustomTrigger("adv_herrerasaurus");
    public static final CustomTrigger BATRACHOTOMUS_COMPLETE = new CustomTrigger("adv_batrachotomus");
    public static final CustomTrigger DIADECTES_COMPLETE = new CustomTrigger("adv_diadectes");
    public static final CustomTrigger CYNOGNATHUS_COMPLETE = new CustomTrigger("adv_cynognathus");
    public static final CustomTrigger HYPERODAPEDON_COMPLETE = new CustomTrigger("adv_hyperodapedon");
    public static final CustomTrigger PROGANOCHELYS_COMPLETE = new CustomTrigger("adv_proganochelys");
    public static final CustomTrigger SILLOSUCHUS_COMPLETE = new CustomTrigger("adv_sillosuchus");
    public static final CustomTrigger XINPUSAURUS_COMPLETE = new CustomTrigger("adv_xinpusaurus");
    public static final CustomTrigger VANCLEAVEA_COMPLETE = new CustomTrigger("adv_vancleavea");
    public static final CustomTrigger TEMNODONTOSAURUS_COMPLETE = new CustomTrigger("adv_temnodontosaurus");
    public static final CustomTrigger CERATOSAURUS_COMPLETE = new CustomTrigger("adv_ceratosaurus");
    public static final CustomTrigger BOBOSAURUS_COMPLETE = new CustomTrigger("adv_bobosaurus");
    public static final CustomTrigger EURHINOSAURUS_COMPLETE = new CustomTrigger("adv_eurhinosaurus");
    public static final CustomTrigger CRYOLOPHOSAURUS_COMPLETE = new CustomTrigger("adv_cryolophosaurus");
    public static final CustomTrigger GIGANTSPINOSAURUS_COMPLETE = new CustomTrigger("adv_gigantspinosaurus");
    public static final CustomTrigger TUOJIANGOSAURUS_COMPLETE = new CustomTrigger("adv_tuojiangosaurus");
    public static final CustomTrigger STEGOSAURUS_COMPLETE = new CustomTrigger("adv_stegosaurus");
    public static final CustomTrigger HUAYANGOSAURUS_COMPLETE = new CustomTrigger("adv_huayangosaurus");
    public static final CustomTrigger EUROPASAURUS_COMPLETE = new CustomTrigger("adv_europasaurus");
    public static final CustomTrigger HUPEHSUCHUS_COMPLETE = new CustomTrigger("adv_hupehsuchus");
    public static final CustomTrigger LAIDLERIA_COMPLETE = new CustomTrigger("adv_laidleria");
    public static final CustomTrigger YUNGUISAURUS_COMPLETE = new CustomTrigger("adv_yunguisaurus");
    public static final CustomTrigger MIXOSAURUS_COMPLETE = new CustomTrigger("adv_mixosaurus");
    public static final CustomTrigger CRIOCEPHALOSAURUS_COMPLETE = new CustomTrigger("adv_criocephalosaurus");
    public static final CustomTrigger CTENOSPONDYLUS_COMPLETE = new CustomTrigger("adv_ctenospondylus");
    public static final CustomTrigger ELGINIA_COMPLETE = new CustomTrigger("adv_elginia");
    public static final CustomTrigger EUNOTOSAURUS_COMPLETE = new CustomTrigger("adv_eunotosaurus");
    public static final CustomTrigger ROBERTIA_COMPLETE = new CustomTrigger("adv_robertia");
    public static final CustomTrigger LABIDOSAURUS_COMPLETE = new CustomTrigger("adv_labidosaurus");
    public static final CustomTrigger VIVAXOSAURUS_COMPLETE = new CustomTrigger("adv_vivaxosaurus");
    public static final CustomTrigger URANOCENTRODON_COMPLETE = new CustomTrigger("adv_uranocentrodon");
    public static final CustomTrigger TORVOSAURUS_COMPLETE = new CustomTrigger("adv_torvosaurus");
    public static final CustomTrigger YANGCHUANOSAURUS_COMPLETE = new CustomTrigger("adv_yangchuanosaurus");
    public static final CustomTrigger DILOPHOSAURUS_COMPLETE = new CustomTrigger("adv_dilophosaurus");
    public static final CustomTrigger MYMOORAPELTA_COMPLETE = new CustomTrigger("adv_mymoorapelta");
    public static final CustomTrigger SINRAPTOR_COMPLETE = new CustomTrigger("adv_sinraptor");
    public static final CustomTrigger ALLOSAURUS_COMPLETE = new CustomTrigger("adv_allosaurus");
    public static final CustomTrigger LIMUSAURUS_COMPLETE = new CustomTrigger("adv_limusaurus");
    public static final CustomTrigger APATOSAURUS_COMPLETE = new CustomTrigger("adv_apatosaurus");
    public static final CustomTrigger DASYCEPS_COMPLETE = new CustomTrigger("adv_dasyceps");
    public static final CustomTrigger PRISTEROGNATHUS_COMPLETE = new CustomTrigger("adv_pristerognathus");
    public static final CustomTrigger BOTHRIOLEPIS_COMPLETE = new CustomTrigger("adv_bothriolepis");
    public static final CustomTrigger PARMASTEGA_COMPLETE = new CustomTrigger("adv_parmastega");
    public static final CustomTrigger PROCERATOSAURUS_COMPLETE = new CustomTrigger("adv_proceratosaurus");
    public static final CustomTrigger ELAPHROSAURUS_COMPLETE = new CustomTrigger("adv_elaphrosaurus");
    public static final CustomTrigger ANUROGNATHUS_COMPLETE = new CustomTrigger("adv_anurognathus");
    public static final CustomTrigger RHAMPHORHYNCHUS_COMPLETE = new CustomTrigger("adv_rhamphorhynchus");
    public static final CustomTrigger YUXISAURUS_COMPLETE = new CustomTrigger("adv_yuxisaurus");
    public static final CustomTrigger GUANLONG_COMPLETE = new CustomTrigger("adv_guanlong");
    public static final CustomTrigger CHILESAURUS_COMPLETE = new CustomTrigger("adv_chilesaurus");
    public static final CustomTrigger CAMARASAURUS_COMPLETE = new CustomTrigger("adv_camarasaurus");
    public static final CustomTrigger ADEOPAPPOSAURUS_COMPLETE = new CustomTrigger("adv_adeopapposaurus");
    public static final CustomTrigger MIRAGAIA_COMPLETE = new CustomTrigger("adv_miragaia");
    public static final CustomTrigger PTERODACTYLUS_COMPLETE = new CustomTrigger("adv_pterodactylus");
    public static final CustomTrigger COMPSOGNATHUS_COMPLETE = new CustomTrigger("adv_compsognathus");
    public static final CustomTrigger TITANICHTHYS_COMPLETE = new CustomTrigger("adv_titanichthys");
    public static final CustomTrigger CAMPTOSAURUS_COMPLETE = new CustomTrigger("adv_camptosaurus");
    public static final CustomTrigger ACANTHOSTEGA_COMPLETE = new CustomTrigger("adv_acanthostega");
    public static final CustomTrigger SHUNOSAURUS_COMPLETE = new CustomTrigger("adv_shunosaurus");
    public static final CustomTrigger PROTEROGYRINUS_COMPLETE = new CustomTrigger("adv_proterogyrinus");
    public static final CustomTrigger HETERODONTOSAURUS_COMPLETE = new CustomTrigger("adv_heterodontosaurus");
    public static final CustomTrigger DIPLODOCUS_COMPLETE = new CustomTrigger("adv_diplodocus");
    public static final CustomTrigger BRACHIOSAURUS_COMPLETE = new CustomTrigger("adv_brachiosaurus");
    public static final CustomTrigger ORNITHOLESTES_COMPLETE = new CustomTrigger("adv_ornitholestes");
    public static final CustomTrigger MAMENCHISAURUS_COMPLETE = new CustomTrigger("adv_mamenchisaurus");
    public static final CustomTrigger YI_COMPLETE = new CustomTrigger("adv_yi");
    public static final CustomTrigger DIMORPHODON_COMPLETE = new CustomTrigger("adv_dimorphodon");
    public static final CustomTrigger STANOCEPHALOSAURUS_COMPLETE = new CustomTrigger("adv_stanocephalosaurus");
    public static final CustomTrigger CACOPS_COMPLETE = new CustomTrigger("adv_cacops");
    public static final CustomTrigger OPHTHALMOTHULE_COMPLETE = new CustomTrigger("adv_ophthalmothule");
    public static final CustomTrigger PLESIOSAURUS_COMPLETE = new CustomTrigger("adv_plesiosaurus");
    public static final CustomTrigger LUFENGOSAURUS_COMPLETE = new CustomTrigger("adv_lufengosaurus");
    public static final CustomTrigger MONOLOPHOSAURUS_COMPLETE = new CustomTrigger("adv_monolophosaurus");
    public static final CustomTrigger ICHTHYOSAURUS_COMPLETE = new CustomTrigger("adv_ichthyosaurus");
    public static final CustomTrigger THALATTOSUCHUS_COMPLETE = new CustomTrigger("adv_thalattosuchus");
    public static final CustomTrigger DEUTEROSAURUS_COMPLETE = new CustomTrigger("adv_deuterosaurus");
    public static final CustomTrigger PLIOSAURUS_COMPLETE = new CustomTrigger("adv_pliosaurus");
    public static final CustomTrigger ERETMORHIPIS_COMPLETE = new CustomTrigger("adv_eretmorhipis");
    public static final CustomTrigger CARTORHYNCHUS_COMPLETE = new CustomTrigger("adv_cartorhynchus");
    public static final CustomTrigger STAHLECKERIA_COMPLETE = new CustomTrigger("adv_stahleckeria");
    public static final CustomTrigger ENDOTHIODON_COMPLETE = new CustomTrigger("adv_endothiodon");
    public static final CustomTrigger ACANTHOSTOMATOPS_COMPLETE = new CustomTrigger("adv_acanthostomatops");
    public static final CustomTrigger MELOSAURUS_COMPLETE = new CustomTrigger("adv_melosaurus");
    public static final CustomTrigger DIPLOCERASPIS_COMPLETE = new CustomTrigger("adv_diploceraspis");

    public static final CustomTrigger[] TRIGGER_ARRAY = new CustomTrigger[] {
            AEGER_COMPLETE,
            SLIMONIA_COMPLETE,
            SCAUMENACIA_COMPLETE,
            DREPANASPIS_COMPLETE,
            LONGISQUAMA_COMPLETE,
            COOPEROCERAS_COMPLETE,
            VESTINAUTILUS_COMPLETE,
            PALAEONISCUM_COMPLETE,
            PARANAICHTHYS_COMPLETE,
            ALLENYPTERUS_COMPLETE,
            HADRONECTOR_COMPLETE,
            FLAGELLOPANTOPUS_COMPLETE,
            PRAEARCTURUS_COMPLETE,
            ECHINOCHIMAERA_COMPLETE,
            SQUATINACTIS_COMPLETE,
            HELIANTHASTER_COMPLETE,
            MIMETASTER_COMPLETE,
            DORYASPIS_COMPLETE,
            GANTAROSTRATASPIS_COMPLETE,
            STENSIOELLA_COMPLETE,
            GROENLANDASPIS_COMPLETE,
            MOBULAVERMIS_COMPLETE,
            KAYKAY_COMPLETE,
            LEEDSICHTHYS_COMPLETE,
            CAIHONG_COMPLETE,
            GOSFORDIA_COMPLETE,
            HYDROPESSUM_COMPLETE,
            DIPTERONOTUS_COMPLETE,
            HARPAGOFUTUTOR_COMPLETE,
            MAMULICHTHYS_COMPLETE,
            SENEKICHTHYS_COMPLETE,
            PHYLLOCERAS_COMPLETE,
            TITANITES_COMPLETE,
            CHARNIA_COMPLETE,
            BRAZILICHTHYS_COMPLETE,
            BETHESDAICHTHYS_COMPLETE,
            HELIOPELTIS_COMPLETE,
            PAREXUS_COMPLETE,
            SPRIGGINA_COMPLETE,
            DIPLACANTHUS_COMPLETE,
            FURCACAUDA_COMPLETE,
            DICRANURUS_COMPLETE,
            GUIYU_COMPLETE,
            OSTEOLEPIS_COMPLETE,
            DICKINSONIA_COMPLETE,
            KLEPTOTHULE_COMPLETE,
            PSYCHOPYGE_COMPLETE,
            ANGUSTIDONTUS_COMPLETE,
            TYRANNOPHONTES_COMPLETE,
            THELODUS_COMPLETE,
            DIPLODOCUS_COMPLETE,
            OPHTHALMOTHULE_COMPLETE,
            PLESIOSAURUS_COMPLETE,
            BRACHIOSAURUS_COMPLETE,
            THALATTOSUCHUS_COMPLETE,
            DEUTEROSAURUS_COMPLETE,
            PLIOSAURUS_COMPLETE,
            ERETMORHIPIS_COMPLETE,
            CARTORHYNCHUS_COMPLETE,
            STAHLECKERIA_COMPLETE,
            ENDOTHIODON_COMPLETE,
            ACANTHOSTOMATOPS_COMPLETE,
            MELOSAURUS_COMPLETE,
            DIPLOCERASPIS_COMPLETE,
            ICHTHYOSAURUS_COMPLETE,
            LUFENGOSAURUS_COMPLETE,
            MONOLOPHOSAURUS_COMPLETE,
            DUNYU_COMPLETE,
            CIURCOPTERUS_COMPLETE,
            HADRANAX_COMPLETE,
            CAPINATATOR_COMPLETE,
            ERYMA_COMPLETE,
            MECOCHIRUS_COMPLETE,
            CYCLOMEDUSA_COMPLETE,
            ROTACIURCA_COMPLETE,
            WAPTIA_COMPLETE,
            ISOXYS_COMPLETE,
            ZENASPIS_COMPLETE,
            SCLERODUS_COMPLETE,
            WARNETICARIS_COMPLETE,
            PHANTASPIS_COMPLETE,
            ARCHAEOPTERYX_COMPLETE,
            NEUROPTERA_COMPLETE,
            SHUNOSAURUS_COMPLETE,
            CAMPTOSAURUS_COMPLETE,
            ORNITHOLESTES_COMPLETE,
            STANOCEPHALOSAURUS_COMPLETE,
            CACOPS_COMPLETE,
            YI_COMPLETE,
            DIMORPHODON_COMPLETE,
            MAMENCHISAURUS_COMPLETE,
            TITANICHTHYS_COMPLETE,
            PLATYCARASPIS_COMPLETE,
            PARMASTEGA_COMPLETE,
            COMPSOGNATHUS_COMPLETE,
            PTERODACTYLUS_COMPLETE,
            CAMARASAURUS_COMPLETE,
            PROTEROGYRINUS_COMPLETE,
            ACANTHOSTEGA_COMPLETE,
            HETERODONTOSAURUS_COMPLETE,
            MIRAGAIA_COMPLETE,
            ADEOPAPPOSAURUS_COMPLETE,
            ANUROGNATHUS_COMPLETE,
            GUANLONG_COMPLETE,
            CHILESAURUS_COMPLETE,
            RHAMPHORHYNCHUS_COMPLETE,
            ANTEOSAURUS_COMPLETE,
            YUXISAURUS_COMPLETE,
            DASYCEPS_COMPLETE,
            BOTHRIOLEPIS_COMPLETE,
            ELAPHROSAURUS_COMPLETE,
            MYMOORAPELTA_COMPLETE,
            PRISTEROGNATHUS_COMPLETE,
            PROCERATOSAURUS_COMPLETE,
            APATOSAURUS_COMPLETE,
            SINRAPTOR_COMPLETE,
            LIMUSAURUS_COMPLETE,
            ALLOSAURUS_COMPLETE,
            YANGCHUANOSAURUS_COMPLETE,
            DILOPHOSAURUS_COMPLETE,
            GIGANTSPINOSAURUS_COMPLETE,
            VIVAXOSAURUS_COMPLETE,
            TORVOSAURUS_COMPLETE,
            URANOCENTRODON_COMPLETE,
            LAIDLERIA_COMPLETE,
            LABIDOSAURUS_COMPLETE,
            ROBERTIA_COMPLETE,
            EUNOTOSAURUS_COMPLETE,
            ELGINIA_COMPLETE,
            CTENOSPONDYLUS_COMPLETE,
            MIXOSAURUS_COMPLETE,
            HUPEHSUCHUS_COMPLETE,
            CRIOCEPHALOSAURUS_COMPLETE,
            YUNGUISAURUS_COMPLETE,
            STEGOSAURUS_COMPLETE,
            EUROPASAURUS_COMPLETE,
            HUAYANGOSAURUS_COMPLETE,
            BOBOSAURUS_COMPLETE,
            TUOJIANGOSAURUS_COMPLETE,
            CRYOLOPHOSAURUS_COMPLETE,
            EURHINOSAURUS_COMPLETE,
            PLATEOSAURUS_COMPLETE,
            CERATOSAURUS_COMPLETE,
            TEMNODONTOSAURUS_COMPLETE,
            SILLOSUCHUS_COMPLETE,
            VANCLEAVEA_COMPLETE,
            XINPUSAURUS_COMPLETE,
            YINLONG_COMPLETE,
            PLACERIAS_COMPLETE,
            CYNOGNATHUS_COMPLETE,
            ICHTHYOSTEGA_COMPLETE,
            PROGANOCHELYS_COMPLETE,
            DAKOSAURUS_COMPLETE,
            HYPERODAPEDON_COMPLETE,
            TIKTAALIK_COMPLETE,
            HERRERASAURUS_COMPLETE,
            TANYSTROPHEUS_COMPLETE,
            DIADECTES_COMPLETE,
            TIARAJUDENS_COMPLETE,
            THECODONTOSAURUS_COMPLETE,
            TETRACERATOPS_COMPLETE,
            BATRACHOTOMUS_COMPLETE,
            SMILOSUCHUS_COMPLETE,
            COELOPHYSIS_COMPLETE,
            SUMINIA_COMPLETE,
            SILESAURUS_COMPLETE,
            SHONISAURUS_COMPLETE,
            SHRINGASAURUS_COMPLETE,
            POSTOSUCHUS_COMPLETE,
            SCUTOSAURUS_COMPLETE,
            RUBIDGEA_COMPLETE,
            PROBURNETIA_COMPLETE,
            PRIONOSUCHUS_COMPLETE,
            POPOSAURUS_COMPLETE,
            OPHIACODON_COMPLETE,
            PLATYHYSTRIX_COMPLETE,
            PLACODUS_COMPLETE,
            PHOLIDERPETON_COMPLETE,
            OPHTHALMOSAURUS_COMPLETE,
            LOTOSAURUS_COMPLETE,
            LYSTROSAURUS_COMPLETE,
            NOTHOSAURUS_COMPLETE,
            MEGALOSAURUS_COMPLETE,
            MOSCHOPS_COMPLETE,
            MEGALOCEPHALUS_COMPLETE,
            MASTODONSAURUS_COMPLETE,
            LISOWICIA_COMPLETE,
            LIMNOSCELIS_COMPLETE,
            ATOPODENTATUS_COMPLETE,
            LILIENSTERNUS_COMPLETE,
            BUNGARTIUS_COMPLETE,
            LESSEMSAURUS_COMPLETE,
            KENTROSAURUS_COMPLETE,
            HENODUS_COMPLETE,
            PROTEROSUCHUS_COMPLETE,
            JONKERIA_COMPLETE,
            INOSTRANCEVIA_COMPLETE,
            ERYOPS_COMPLETE,
            GERROTHORAX_COMPLETE,
            ESTEMMENOSUCHUS_COMPLETE,
            ERYTHROSUCHUS_COMPLETE,
            EORHYNCHOCHELYS_COMPLETE,
            EFFIGIA_COMPLETE,
            BUNOSTEGOS_COMPLETE,
            EDAPHOSAURUS_COMPLETE,
            CAVIRAMUS_COMPLETE,
            CRASSIGYRINUS_COMPLETE,
            DUNKLEOSTEUS_COMPLETE,
            CYAMODUS_COMPLETE,
            CYMBOSPONDYLUS_COMPLETE,
            COTYLORHYNCHUS_COMPLETE,
            DATHEOSAURUS_COMPLETE,
            DRYOSAURUS_COMPLETE,
            DESMATOSUCHUS_COMPLETE,
            DIPLOCAULUS_COMPLETE,
            DIMETRODON_COMPLETE,
            RHOMALEOSAURUS_COMPLETE,
            ARIZONASAURUS_COMPLETE

    };


    public static void registerTriggers()
    {
        Method method;

        method = ReflectionHelper.findMethod(CriteriaTriggers.class, "register", "func_192118_a", ICriterionTrigger.class);

        method.setAccessible(true);

        for (int i=0; i < TRIGGER_ARRAY.length; i++)
        {
            try
            {
               method.invoke(null, TRIGGER_ARRAY[i]);
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
            {
               e.printStackTrace();
            }
        }
    }
}