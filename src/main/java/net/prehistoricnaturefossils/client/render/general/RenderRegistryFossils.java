package net.prehistoricnaturefossils.client.render.general;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.prehistoricnaturefossils.client.render.skeletons.*;
import net.prehistoricnaturefossils.client.render.slabs.*;
import net.prehistoricnaturefossils.tile.*;

public class RenderRegistryFossils {

    public static void RegisterEntityRenders() {

        //Fossil Slabs:
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAnomalocaris.class, new RenderFossilAnomalocaris());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAkmonistion.class, new RenderFossilAkmonistion());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAmpyx.class, new RenderFossilAmpyx());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArthropleura.class, new RenderFossilArthropleura());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAsaphus.class, new RenderFossilAsaphus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCoccosteus.class, new RenderFossilCoccosteus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilFalcatus.class, new RenderFossilFalcatus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilKeichousaurus.class, new RenderFossilKeichousaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLimulid.class, new RenderFossilLimulid());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMeganeura.class, new RenderFossilMeganeura());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMegarachne.class, new RenderFossilMegarachne());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMixopterus.class, new RenderFossilMixopterus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPulmonoscorpius.class, new RenderFossilPulmonoscorpius());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSchinderhannes.class, new RenderFossilSchinderhannes());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTullimonstrum.class, new RenderFossilTullimonstrum());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilWalliserops.class, new RenderFossilWalliserops());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTurboscinetes.class, new RenderFossilTurboscinetes());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAeger.class, new RenderFossilAeger());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEryon.class, new RenderFossilEryon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilForeyia.class, new RenderFossilForeyia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCrotalocephalus.class, new RenderFossilCrotalocephalus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOpabinia.class, new RenderFossilOpabinia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilGemuendina.class, new RenderFossilGemuendina());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBobasatrania.class, new RenderFossilBobasatrania());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOttoia.class, new RenderFossilOttoia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBelantsea.class, new RenderFossilBelantsea());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCladoselache.class, new RenderFossilCladoselache());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEusthenopteron.class, new RenderFossilEusthenopteron());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSidneyia.class, new RenderFossilSidneyia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilVetulicola.class, new RenderFossilVetulicola());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilClatrotitan.class, new RenderFossilClatrotitan());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHallucigenia.class, new RenderFossilHallucigenia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBandringa.class, new RenderFossilBandringa());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPikaia.class, new RenderFossilPikaia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCanadaspis.class, new RenderFossilCanadaspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilKerygmachela.class, new RenderFossilKerygmachela());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBalhuticaris.class, new RenderFossilBalhuticaris());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCambroraster.class, new RenderFossilCambroraster());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEoredlichia.class, new RenderFossilEoredlichia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilYawunik.class, new RenderFossilYawunik());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMarrella.class, new RenderFossilMarrella());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilNectocaris.class, new RenderFossilNectocaris());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPolybranchiaspis.class, new RenderFossilPolybranchiaspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilParameteoraspis.class, new RenderFossilParameteoraspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHaikouichthys.class, new RenderFossilHaikouichthys());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilYohoia.class, new RenderFossilYohoia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSanctacaris.class, new RenderFossilSanctacaris());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSkeemella.class, new RenderFossilSkeemella());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCyrtoceras.class, new RenderFossilCyrtoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlatypeltoides.class, new RenderFossilPlatypeltoides());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLituites.class, new RenderFossilLituites());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCothurnocystis.class, new RenderFossilCothurnocystis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOrthoceras.class, new RenderFossilOrthoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArandaspis.class, new RenderFossilArandaspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMaclurina.class, new RenderFossilMaclurina());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAphetoceras.class, new RenderFossilAphetoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSacabambaspis.class, new RenderFossilSacabambaspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHungioides.class, new RenderFossilHungioides());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDidymograptus.class, new RenderFossilDidymograptus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilGonioceras.class, new RenderFossilGonioceras());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAegirocassis.class, new RenderFossilAegirocassis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCameroceras.class, new RenderFossilCameroceras());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilConodont.class, new RenderFossilConodont());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPricyclopyge.class, new RenderFossilPricyclopyge());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilVillebrunaster.class, new RenderFossilVillebrunaster());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCalvapilosa.class, new RenderFossilCalvapilosa());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAiniktozoon.class, new RenderFossilAiniktozoon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArctinurus.class, new RenderFossilArctinurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBohemoharpes.class, new RenderFossilBohemoharpes());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBirkenia.class, new RenderFossilBirkenia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCarcinosoma.class, new RenderFossilCarcinosoma());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilFurcaster.class, new RenderFossilFurcaster());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEurypterus.class, new RenderFossilEurypterus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilJamoytius.class, new RenderFossilJamoytius());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPhragmoceras.class, new RenderFossilPhragmoceras());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlatylomaspis.class, new RenderFossilPlatylomaspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBundenbachiellus.class, new RenderFossilBundenbachiellus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAttercopus.class, new RenderFossilAttercopus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilJaekelopterus.class, new RenderFossilJaekelopterus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBrochoadmones.class, new RenderFossilBrochoadmones());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilRhinopteraspis.class, new RenderFossilRhinopteraspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHibbertopterus.class, new RenderFossilHibbertopterus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCiurcopterus.class, new RenderFossilCiurcopterus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSlimonia.class, new RenderFossilSlimonia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDunyu.class, new RenderFossilDunyu());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlatycaraspis.class, new RenderFossilPlatycaraspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilThelodus.class, new RenderFossilThelodus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilGuiyu.class, new RenderFossilGuiyu());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilWarneticaris.class, new RenderFossilWarneticaris());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPhantaspis.class, new RenderFossilPhantaspis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArchaeopteryx.class, new RenderFossilArchaeopteryx());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilNeuroptera.class, new RenderFossilNeuroptera());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilKleptothule.class, new RenderFossilKleptothule());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPsychopyge.class, new RenderFossilPsychopyge());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAngustidontus.class, new RenderFossilAngustidontus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTyrannophontes.class, new RenderFossilTyrannophontes());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDickinsonia.class, new RenderFossilDickinsonia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOsteolepis.class, new RenderFossilOsteolepis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDicranurus.class, new RenderFossilDicranurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHeliopeltis.class, new RenderFossilHeliopeltis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilFurcacauda.class, new RenderFossilFurcacauda());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDiplacanthus.class, new RenderFossilDiplacanthus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSpriggina.class, new RenderFossilSpriggina());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilParexus.class, new RenderFossilParexus());


        //Skeleton Mounts:
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilArizonasaurus.class, new RenderFossilArizonasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAnteosaurus.class, new RenderFossilAnteosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBungartius.class, new RenderFossilBungartius());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCaviramus.class, new RenderFossilCaviramus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCotylorhynchus.class, new RenderFossilCotylorhynchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCyamodus.class, new RenderFossilCyamodus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCymbospondylus.class, new RenderFossilCymbospondylus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDesmatosuchus.class, new RenderFossilDesmatosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDimetrodon.class, new RenderFossilDimetrodon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDiplocaulus.class, new RenderFossilDiplocaulus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDunkleosteus.class, new RenderFossilDunkleosteus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEdaphosaurus.class, new RenderFossilEdaphosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEffigia.class, new RenderFossilEffigia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilErythrosuchus.class, new RenderFossilErythrosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEstemmenosuchus.class, new RenderFossilEstemmenosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilGerrothorax.class, new RenderFossilGerrothorax());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHenodus.class, new RenderFossilHenodus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilKentrosaurus.class, new RenderFossilKentrosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLiliensternus.class, new RenderFossilLiliensternus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLotosaurus.class, new RenderFossilLotosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLystrosaurus.class, new RenderFossilLystrosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMastodonsaurus.class, new RenderFossilMastodonsaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMegalosaurus.class, new RenderFossilMegalosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMoschops.class, new RenderFossilMoschops());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOphiacodon.class, new RenderFossilOphiacodon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOphthalmosaurus.class, new RenderFossilOphthalmosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlatyhystrix.class, new RenderFossilPlatyhystrix());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPoposaurus.class, new RenderFossilPoposaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPrionosuchus.class, new RenderFossilPrionosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilRubidgea.class, new RenderFossilRubidgea());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilScutosaurus.class, new RenderFossilScutosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilShringasaurus.class, new RenderFossilShringasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSilesaurus.class, new RenderFossilSilesaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSuminia.class, new RenderFossilSuminia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilThecodontosaurus.class, new RenderFossilThecodontosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTiarajudens.class, new RenderFossilTiarajudens());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTiktaalik.class, new RenderFossilTiktaalik());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilYinlong.class, new RenderFossilYinlong());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilJonkeria.class, new RenderFossilJonkeria());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPostosuchus.class, new RenderFossilPostosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCrassigyrinus.class, new RenderFossilCrassigyrinus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEryops.class, new RenderFossilEryops());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDryosaurus.class, new RenderFossilDryosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTanystropheus.class, new RenderFossilTanystropheus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLessemsaurus.class, new RenderFossilLessemsaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilNothosaurus.class, new RenderFossilNothosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAtopodentatus.class, new RenderFossilAtopodentatus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlacodus.class, new RenderFossilPlacodus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilShonisaurus.class, new RenderFossilShonisaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLisowicia.class, new RenderFossilLisowicia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSmilosuchus.class, new RenderFossilSmilosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEorhynchochelys.class, new RenderFossilEorhynchochelys());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDatheosaurus.class, new RenderFossilDatheosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPholiderpeton.class, new RenderFossilPholiderpeton());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMegalocephalus.class, new RenderFossilMegalocephalus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLimnoscelis.class, new RenderFossilLimnoscelis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilProburnetia.class, new RenderFossilProburnetia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTetraceratops.class, new RenderFossilTetraceratops());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBunostegos.class, new RenderFossilBunostegos());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilInostrancevia.class, new RenderFossilInostrancevia());
//        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCrinoidRaft.class, new RenderFossilCrinoidRaft());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilRhomaleosaurus.class, new RenderFossilRhomaleosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilProterosuchus.class, new RenderFossilProterosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDakosaurus.class, new RenderFossilDakosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlacerias.class, new RenderFossilPlacerias());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPlateosaurus.class, new RenderFossilPlateosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCoelophysis.class, new RenderFossilCoelophysis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilIchthyostega.class, new RenderFossilIchthyostega());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHerrerasaurus.class, new RenderFossilHerrerasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBatrachotomus.class, new RenderFossilBatrachotomus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDiadectes.class, new RenderFossilDiadectes());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCynognathus.class, new RenderFossilCynognathus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHyperodapedon.class, new RenderFossilHyperodapedon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilProganochelys.class, new RenderFossilProganochelys());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSillosuchus.class, new RenderFossilSillosuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilXinpusaurus.class, new RenderFossilXinpusaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilVancleavea.class, new RenderFossilVancleavea());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTemnodontosaurus.class, new RenderFossilTemnodontosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCeratosaurus.class, new RenderFossilCeratosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBobosaurus.class, new RenderFossilBobosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEurhinosaurus.class, new RenderFossilEurhinosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCryolophosaurus.class, new RenderFossilCryolophosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilGigantspinosaurus.class, new RenderFossilGigantspinosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTuojiangosaurus.class, new RenderFossilTuojiangosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilStegosaurus.class, new RenderFossilStegosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHuayangosaurus.class, new RenderFossilHuayangosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEuropasaurus.class, new RenderFossilEuropasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHupehsuchus.class, new RenderFossilHupehsuchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLaidleria.class, new RenderFossilLaidleria());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilYunguisaurus.class, new RenderFossilYunguisaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMixosaurus.class, new RenderFossilMixosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCriocephalosaurus.class, new RenderFossilCriocephalosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCtenospondylus.class, new RenderFossilCtenospondylus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilElginia.class, new RenderFossilElginia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilEunotosaurus.class, new RenderFossilEunotosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilRobertia.class, new RenderFossilRobertia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLabidosaurus.class, new RenderFossilLabidosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilVivaxosaurus.class, new RenderFossilVivaxosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilUranocentrodon.class, new RenderFossilUranocentrodon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTorvosaurus.class, new RenderFossilTorvosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilYangchuanosaurus.class, new RenderFossilYangchuanosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDilophosaurus.class, new RenderFossilDilophosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMymoorapelta.class, new RenderFossilMymoorapelta());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilSinraptor.class, new RenderFossilSinraptor());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAllosaurus.class, new RenderFossilAllosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilLimusaurus.class, new RenderFossilLimusaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilApatosaurus.class, new RenderFossilApatosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDasyceps.class, new RenderFossilDasyceps());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPristerognathus.class, new RenderFossilPristerognathus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBothriolepis.class, new RenderFossilBothriolepis());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilParmastega.class, new RenderFossilParmastega());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilProceratosaurus.class, new RenderFossilProceratosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilElaphrosaurus.class, new RenderFossilElaphrosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAnurognathus.class, new RenderFossilAnurognathus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilRhamphorhynchus.class, new RenderFossilRhamphorhynchus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilYuxisaurus.class, new RenderFossilYuxisaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilGuanlong.class, new RenderFossilGuanlong());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilChilesaurus.class, new RenderFossilChilesaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCamarasaurus.class, new RenderFossilCamarasaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAdeopapposaurus.class, new RenderFossilAdeopapposaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMiragaia.class, new RenderFossilMiragaia());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilPterodactylus.class, new RenderFossilPterodactylus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCompsognathus.class, new RenderFossilCompsognathus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilTitanichthys.class, new RenderFossilTitanichthys());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCamptosaurus.class, new RenderFossilCamptosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilAcanthostega.class, new RenderFossilAcanthostega());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilShunosaurus.class, new RenderFossilShunosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilProterogyrinus.class, new RenderFossilProterogyrinus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilHeterodontosaurus.class, new RenderFossilHeterodontosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDiplodocus.class, new RenderFossilDiplodocus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilBrachiosaurus.class, new RenderFossilBrachiosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilOrnitholestes.class, new RenderFossilOrnitholestes());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilMamenchisaurus.class, new RenderFossilMamenchisaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilYi.class, new RenderFossilYi());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilDimorphodon.class, new RenderFossilDimorphodon());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilStanocephalosaurus.class, new RenderFossilStanocephalosaurus());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFossilCacops.class, new RenderFossilCacops());

    }
}
