using CSProtocol;
using System;

[ArgumentDescription(1, typeof(ulong), "ullUid", new object[]
{

}), ArgumentDescription(2, typeof(uint), "worldID", new object[]
{

}), ArgumentDescription(3, typeof(byte), "亲密度关系", new object[]
{

}), ArgumentDescription(4, typeof(uint), "解除关系时间", new object[]
{

}), CheatCommand("工具/SetIntimacyRelation", "设置亲密度关系", 88)]
internal class SetIntimacyRelation : CheatCommandNetworking
{
	protected override string Execute(string[] InArguments, ref CSDT_CHEATCMD_DETAIL CheatCmdRef)
	{
		CheatCmdRef.set_stIntimacyRelation(new CSDT_CHEAT_INTIMACYRELATION());
		CheatCmdRef.get_stIntimacyRelation().stUin.ullUid = CheatCommandBase.SmartConvert<ulong>(InArguments[0]);
		CheatCmdRef.get_stIntimacyRelation().stUin.dwLogicWorldId = CheatCommandBase.SmartConvert<uint>(InArguments[1]);
		CheatCmdRef.get_stIntimacyRelation().bIntimacyState = CheatCommandBase.SmartConvert<byte>(InArguments[2]);
		CheatCmdRef.get_stIntimacyRelation().dwTerminateTime = CheatCommandBase.SmartConvert<uint>(InArguments[3]);
		return CheatCommandBase.Done;
	}
}
